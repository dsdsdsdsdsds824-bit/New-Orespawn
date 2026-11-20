package danger.orespawn;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

/** Minerio que solta gema (Ruby, Amethyst) e experiencia ao ser quebrado sem Silk Touch. */
public class GemOreBlock extends Block {
    private static final Random XP_RANDOM = new Random();
    private final int xpMin;
    private final int xpMax;

    public GemOreBlock(Properties properties, int xpMin, int xpMax) {
        super(properties);
        this.xpMin = xpMin;
        this.xpMax = xpMax;
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? MathHelper.nextInt(XP_RANDOM, xpMin, xpMax) : 0;
    }
}
