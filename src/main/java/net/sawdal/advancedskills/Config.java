package net.sawdal.advancedskills;

import net.neoforged.neoforge.common.ModConfigSpec;

/**
 * All tunable values for the Woodsplitter's Creed skills.
 * File: config/sawdalsadvancedskills-common.toml. Every value is a starting value for playtesting.
 * (Heavy Hand and the attribute skills A1–A7 are tuned in definitions.json instead.)
 */
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    // --- Rooted Stance ---
    static { BUILDER.push("rootedStance"); }
    public static final ModConfigSpec.DoubleValue ROOTED_KNOCKBACK_MULT = BUILDER
            .comment("Knockback taken is multiplied by this while holding an axe (0.4 = 60% less knockback).")
            .defineInRange("knockbackMultiplier", 0.4, 0.0, 1.0);
    static { BUILDER.pop(); }

    // --- Splinter Guard ---
    static { BUILDER.push("splinterGuard"); }
    public static final ModConfigSpec.IntValue SPLINTER_SLOWNESS_AMP = BUILDER
            .comment("Slowness amplifier given to a shielded foe (0 = Slowness I).")
            .defineInRange("slownessAmplifier", 2, 0, 9);
    public static final ModConfigSpec.IntValue SPLINTER_DURATION = BUILDER
            .comment("Slowness duration in ticks.")
            .defineInRange("durationTicks", 60, 1, 72000);
    static { BUILDER.pop(); }

    // --- Cleaving Arc ---
    static { BUILDER.push("cleavingArc"); }
    public static final ModConfigSpec.DoubleValue CLEAVE_RATIO = BUILDER
            .comment("Sweeping damage ratio added while an axe is in the main hand. Sweep damage = 1 + ratio x attack damage.")
            .defineInRange("sweepRatio", 0.75, 0.0, 10.0);
    static { BUILDER.pop(); }

    // --- Timberfall ---
    static { BUILDER.push("timberfall"); }
    public static final ModConfigSpec.DoubleValue TIMBERFALL_CRIT_BONUS = BUILDER
            .comment("Axe crit multiplier is multiplied by this (1.5 turns a x1.5 crit into x2.25).")
            .defineInRange("critMultiplierBonus", 1.5, 1.0, 10.0);
    static { BUILDER.pop(); }

    // --- Bark and Iron ---
    static { BUILDER.push("barkAndIron"); }
    public static final ModConfigSpec.DoubleValue BARK_RESISTANCE = BUILDER
            .comment("puffish_attributes:resistance added (multiply_total) while holding an axe in a wooded biome. 0.20 = 20% less damage.")
            .defineInRange("resistance", 0.20, 0.0, 1.0);
    static { BUILDER.pop(); }

    // --- Bloodied Haft ---
    static { BUILDER.push("bloodiedHaft"); }
    public static final ModConfigSpec.DoubleValue HAFT_BONUS_PER_STACK = BUILDER
            .comment("Bonus damage per consecutive hit on the same target (0.08 = +8% per stack).")
            .defineInRange("bonusPerStack", 0.08, 0.0, 10.0);
    public static final ModConfigSpec.IntValue HAFT_MAX_STACKS = BUILDER
            .comment("Maximum stacks counted.")
            .defineInRange("maxStacks", 5, 1, 100);
    public static final ModConfigSpec.IntValue HAFT_WINDOW = BUILDER
            .comment("Max ticks between hits before the streak resets.")
            .defineInRange("windowTicks", 40, 1, 72000);
    static { BUILDER.pop(); }

    // --- Felling Blow ---
    static { BUILDER.push("fellingBlow"); }
    public static final ModConfigSpec.DoubleValue FELLING_MULT = BUILDER
            .comment("Damage multiplier against large or heavy foes.")
            .defineInRange("multiplier", 1.5, 1.0, 10.0);
    public static final ModConfigSpec.DoubleValue FELLING_MIN_WIDTH = BUILDER
            .comment("Foes at least this wide (hitbox width, blocks) qualify.")
            .defineInRange("minWidth", 1.4, 0.0, 100.0);
    public static final ModConfigSpec.DoubleValue FELLING_MIN_MAX_HEALTH = BUILDER
            .comment("Foes with at least this much max health qualify.")
            .defineInRange("minMaxHealth", 40.0, 0.0, 100000.0);
    static { BUILDER.pop(); }

    // --- Woodsman's Wrath ---
    static { BUILDER.push("woodsmansWrath"); }
    public static final ModConfigSpec.IntValue WRATH_STRENGTH_AMP = BUILDER
            .comment("Strength amplifier on an axe kill (1 = Strength II).")
            .defineInRange("strengthAmplifier", 1, 0, 9);
    public static final ModConfigSpec.IntValue WRATH_DURATION = BUILDER
            .comment("Strength duration in ticks.")
            .defineInRange("durationTicks", 120, 1, 72000);
    static { BUILDER.pop(); }

    // --- Oath of the Splitting Storm (Sunder meter) ---
    static { BUILDER.push("oath"); }
    public static final ModConfigSpec.IntValue OATH_HITS = BUILDER
            .comment("Fully charged axe hits on the same foe needed to apply Vulnerable.")
            .defineInRange("hitsRequired", 5, 1, 100);
    public static final ModConfigSpec.IntValue OATH_WINDOW = BUILDER
            .comment("Max ticks between counted hits before the meter resets.")
            .defineInRange("windowTicks", 60, 1, 72000);
    public static final ModConfigSpec.IntValue OATH_VULN_TICKS = BUILDER
            .comment("Vulnerable duration in ticks.")
            .defineInRange("vulnerableTicks", 100, 1, 72000);
    static { BUILDER.pop(); }

    // --- Vulnerable effect ---
    static { BUILDER.push("vulnerable"); }
    public static final ModConfigSpec.DoubleValue VULN_PER_LEVEL = BUILDER
            .comment("Extra damage taken per effect level, from any source (0.20 = +20%).")
            .defineInRange("multiplierPerLevel", 0.20, 0.0, 10.0);
    static { BUILDER.pop(); }

    // --- Heartwood Stand ---
    static { BUILDER.push("heartwood"); }
    public static final ModConfigSpec.DoubleValue HEARTWOOD_HEALTH_FRACTION = BUILDER
            .comment("Triggers when health drops to or below this fraction of max health.")
            .defineInRange("healthFraction", 0.35, 0.01, 1.0);
    public static final ModConfigSpec.IntValue HEARTWOOD_RESIST_AMP = BUILDER
            .comment("Resistance amplifier (2 = Resistance III).")
            .defineInRange("resistanceAmplifier", 2, 0, 4);
    public static final ModConfigSpec.IntValue HEARTWOOD_DURATION = BUILDER
            .comment("Resistance duration in ticks.")
            .defineInRange("durationTicks", 120, 1, 72000);
    public static final ModConfigSpec.IntValue HEARTWOOD_COOLDOWN = BUILDER
            .comment("Cooldown in ticks (saved across relogs and death).")
            .defineInRange("cooldownTicks", 1200, 0, 720000);
    static { BUILDER.pop(); }

    // --- Ground Splitter ---
    static { BUILDER.push("groundSplitter"); }
    public static final ModConfigSpec.DoubleValue SLAM_RADIUS = BUILDER
            .comment("Radius (blocks) around the struck foe.")
            .defineInRange("radius", 5.0, 0.5, 32.0);
    public static final ModConfigSpec.IntValue SLAM_SLOWNESS_AMP = BUILDER
            .defineInRange("slownessAmp", 2, 0, 9);
    public static final ModConfigSpec.IntValue SLAM_SLOWNESS_TICKS = BUILDER
            .defineInRange("slownessTicks", 80, 1, 72000);
    public static final ModConfigSpec.IntValue SLAM_WEAKNESS_AMP = BUILDER
            .defineInRange("weaknessAmp", 0, 0, 9);
    public static final ModConfigSpec.IntValue SLAM_WEAKNESS_TICKS = BUILDER
            .defineInRange("weaknessTicks", 60, 1, 72000);
    public static final ModConfigSpec.IntValue SLAM_COOLDOWN = BUILDER
            .comment("Cooldown in ticks.")
            .defineInRange("cooldownTicks", 120, 0, 72000);
    static { BUILDER.pop(); }

    // --- Pack Leader ---
    static { BUILDER.push("packLeader"); }
    public static final ModConfigSpec.DoubleValue PACK_RANGE = BUILDER
            .comment("Max distance (blocks) between you and your wolf.")
            .defineInRange("range", 16.0, 1.0, 128.0);
    public static final ModConfigSpec.DoubleValue PACK_MULT = BUILDER
            .comment("Wolf damage multiplier while you are in a wooded biome (#sawdalsadvancedskills:wooded).")
            .defineInRange("multiplier", 1.5, 1.0, 10.0);
    public static final ModConfigSpec.DoubleValue PACK_ATTACK_SPEED_MULT = BUILDER
            .comment("Wolf attack speed multiplier in a wooded biome. Wolves bite every 20 ticks; 1.5 = every ~13 ticks.")
            .defineInRange("attackSpeedMultiplier", 1.5, 1.0, 10.0);
    public static final ModConfigSpec.DoubleValue PACK_MOVE_SPEED_BONUS = BUILDER
            .comment("Wolf movement speed bonus in a wooded biome (0.15 = +15%).")
            .defineInRange("movementSpeedBonus", 0.15, 0.0, 2.0);
    static { BUILDER.pop(); }

    static final ModConfigSpec SPEC = BUILDER.build();
}
