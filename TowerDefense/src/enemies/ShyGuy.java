package enemies;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

import util.Point;


public class ShyGuy extends Enemy
{
	
	public ShyGuy(Point[] waypoints, float difficulty)
	{
		super(waypoints);
		
		name = "ShyGuy";
		width = 32;
		height = 32;
		float hp = 100*difficulty;
		health = (int)hp;
		speed = 2.0f*difficulty;
		damage = 10;
		gold_given = 25;
		animation_speed = 6;
		
		tex = new Texture[2];
		tex[0] = new Texture("data/enemies/shy_guy_right_1.png");
		tex[1] = new Texture("data/enemies/shy_guy_right_2.png");
		collider = new Rectangle((float)waypoints[0].getX(), (float)waypoints[0].getY(), width, height);
	}
	
}
