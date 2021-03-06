package enemies;
import com.me.td.World;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

import util.Point;


public class galagaEnemy4 extends Enemy
{
	
	static float maxHealth=1600;
 	
 	public galagaEnemy4(Point[] waypoints, float difficulty, AssetManager manager)
 	{
		super(waypoints,maxHealth*difficulty);
		name = "G Enemy 4";
		width = 28;
		height = 42;
		health = (int)(maxHealth*difficulty);
		speed = 2.0f;
		damage = (int)(10*difficulty);
		gold_given = 100;
		animation_speed = 10;
		can_attack = true;
		
		tex = new Texture[2];
		tex[0] = manager.get("data/enemies/galagaEnemy4.png");
		tex[1] = manager.get("data/enemies/galagaEnemy4.png");
		collider = new Rectangle((float)waypoints[0].getX(), (float)waypoints[0].getY(), width, height);
	}
	
}
