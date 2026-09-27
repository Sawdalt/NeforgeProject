package net.sawdal.advancedskills;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.sawdal.advancedskills.registry.ModAttachments;
import net.sawdal.advancedskills.registry.ModEffects;
import net.sawdal.advancedskills.woodsplitter.CritHandler;
import net.sawdal.advancedskills.woodsplitter.DamageHandler;
import net.sawdal.advancedskills.woodsplitter.DefenseHandler;
import net.sawdal.advancedskills.woodsplitter.HeartwoodBar;
import net.sawdal.advancedskills.woodsplitter.HitHandler;
import net.sawdal.advancedskills.woodsplitter.KillHandler;
import net.sawdal.advancedskills.woodsplitter.PackLeader;
import net.sawdal.advancedskills.woodsplitter.SweepHandler;

@Mod(AdvancedSkills.MODID)
public class AdvancedSkills {
    public static final String MODID = "sawdalsadvancedskills";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedSkills(IEventBus modEventBus, ModContainer modContainer) {
        // Registries (mod bus)
        ModEffects.EFFECTS.register(modEventBus);
        ModAttachments.ATTACHMENT_TYPES.register(modEventBus);

        // Config: config/sawdalsadvancedskills-common.toml
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        // Woodsplitter's Creed gameplay handlers (game bus, static @SubscribeEvent methods)
        NeoForge.EVENT_BUS.register(HitHandler.class);
        NeoForge.EVENT_BUS.register(CritHandler.class);
        NeoForge.EVENT_BUS.register(SweepHandler.class);
        NeoForge.EVENT_BUS.register(DamageHandler.class);
        NeoForge.EVENT_BUS.register(DefenseHandler.class);
        NeoForge.EVENT_BUS.register(KillHandler.class);
        NeoForge.EVENT_BUS.register(HeartwoodBar.class);
        NeoForge.EVENT_BUS.register(PackLeader.class);
    }
}
