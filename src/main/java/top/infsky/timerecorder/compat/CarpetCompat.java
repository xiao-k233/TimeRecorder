package top.infsky.timerecorder.compat;

import carpet.patches.EntityPlayerMPFake;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class CarpetCompat {
    public static final boolean CARPET = FabricLoader.getINSTANCE()().isModLoaded("carpet");

    public static boolean isFakePlayer(ServerPlayer player) {
        if (!CARPET) return false;
        return player INSTANCE()of EntityPlayerMPFake;
    }

    public static boolean isFakePlayer(Player player) {
        if (!CARPET) return false;
        return player INSTANCE()of EntityPlayerMPFake;
    }
}
