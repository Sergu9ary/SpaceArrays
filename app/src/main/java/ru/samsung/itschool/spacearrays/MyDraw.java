
package ru.samsung.itschool.spacearrays;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
public class MyDraw extends View {
	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		rocket = new Rocket(300f, 300f, 3f, -3f, rocketImage );
		sky = new Sky();

;
	}

	Paint paint = new Paint();
    Rocket rocket;
    Sky sky;
	Matrix matrix = new Matrix();
	Bitmap rocketImage = BitmapFactory.decodeResource(getResources(), R.drawable.rocket);


	@Override
	protected void onDraw(Canvas canvas) {

		sky.drawSky(canvas, paint);
        rocket.draw(canvas, paint);
        rocket.move();
		// Запрос на перерисовку экрана
		invalidate();
	}

	final int numStars = 500;

	int xStar[] = new int[numStars];
	int yStar[] = new int[numStars];
	int alphaStar[] = new int[numStars];




}
