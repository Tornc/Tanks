package tanks.tank;

import tanks.Drawing;
import tanks.Game;
import tanks.Movable;
import tanks.Panel;
import tanks.bullet.Bullet;
import tanks.bullet.BulletFlame;
import tanks.event.EventShootBullet;

/**
 * A short-range tank which shoots fire
 */
public class TankOrange extends TankAIControlled
{
	public TankOrange(String name, double x, double y, double angle)
	{
		super(name, x, y, Game.tile_size, 230, 120, 0, angle, ShootAI.straight);

		this.enableMovement = true;
		this.maxSpeed = 1.0;

		this.enableMineLaying = false;
		this.enablePredictiveFiring = false;
		this.aimTurretSpeed = 0.01;
		this.enablePathfinding = true;

		this.motionChangeChance = 0.001;
		this.avoidSensitivity = 1;

		this.bullet.maxLiveBullets = 0;
		this.bullet.bulletClass = BulletFlame.class;
		this.bullet.cooldownBase = 0;
		this.cooldownBase = 0;
		this.cooldownRandom = 0;
		this.bullet.effect = Bullet.BulletEffect.none;
		this.bullet.bounces = 0;
		this.bullet.name = "Flamethrower";

		this.coinValue = 4;

		this.description = "A short-range tank which shoots fire";
	}
}