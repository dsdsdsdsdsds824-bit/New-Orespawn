package danger.orespawn;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

/**
 * Cristais do OreSpawn: podem explodir quando quebrados por um jogador (como no 1.7.10)
 * e soltam experiencia abaixo de Y=40.
 */
public class CrystalBlock extends Block {
    private static final Random RANDOM_SOURCE = new Random();
    private final float explosionChance;
    private final float explosionPower;

    public CrystalBlock(Properties properties, float explosionChance, float explosionPower) {
        super(properties);
        this.explosionChance = explosionChance;
        this.explosionPower = explosionPower;
    }

    @Override
    public void onPlayerDestroy(IWorld world, BlockPos pos, BlockState state) {
        if (explosionChance > 0.0F && world instanceof World) {
            World level = (World) world;
            if (!level.isRemote && RANDOM_SOURCE.nextFloat() < explosionChance) {
                Explosion.Mode mode = level.getGameRules().getBoolean(GameRules.MOB_GRIEFING) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
                level.createExplosion(null, pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, explosionPower, mode);
            }
        }
        super.onPlayerDestroy(world, pos, state);
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 && pos.getY() < 40 ? MathHelper.nextInt(RANDOM_SOURCE, 5, 18) : 0;
    }
}
