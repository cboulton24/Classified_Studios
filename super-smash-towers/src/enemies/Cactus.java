package enemies;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.me.td.World;

import util.Point;


public class Cactus extends Enemy
{
	static float maxHealth=300;
 	
 	public Cactus(Point[] waypoints, float difficulty, AssetManager manager)
 	{
		super(waypoints,maxHealth*difficulty);
		
		name = "Cactus";
		width = 28;
		height = 42;
		health = (int)(maxHealth*difficulty);
		speed = 2.5f;
		damage = (int)(15*difficulty);
		gold_given = 50;
		animation_speed = 10;
		
		tex = new Texture[2];
		tex[0] = manager.get("data/enemies/zcatus1.png");
		tex[1] = manager.get("data/enemies/zcatus2.png");
		collider = new Rectangle((float)waypoints[0].getX(), (float)waypoints[0].getY(), width, height);
	}
	
}
