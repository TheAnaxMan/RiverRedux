package supercoder79.riverredux;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class ModCompatHolder {
    public static Map<Identifier, RegistryKey<Biome>> BIOME_TO_RIVER = new HashMap<>();
    public static void init() {
        BIOME_TO_RIVER.put(traverse("mini_jungle"), RiverBiomes.TROPICAL);
        BIOME_TO_RIVER.put(traverse("desert_shrubland"), RiverBiomes.SANDY);
        BIOME_TO_RIVER.put(traverse("arid_highlands"), RiverBiomes.SANDY);
        BIOME_TO_RIVER.put(traverse("coniferous_forest"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(traverse("coniferous_wooded_hills"), RiverBiomes.GRAVELLY);

        BIOME_TO_RIVER.put(terrestria("rainbow_rainforest"), RiverBiomes.TROPICAL);
        BIOME_TO_RIVER.put(terrestria("rainbow_rainforest_lake"), RiverBiomes.TROPICAL);
        BIOME_TO_RIVER.put(terrestria("rainbow_rainforest_mountains"), RiverBiomes.TROPICAL);
        BIOME_TO_RIVER.put(terrestria("hemlock_rainforest"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(terrestria("hemlock_rainforest_clearing"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(terrestria("snowy_hemlock_rainforest"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(terrestria("snowy_hemlock_rainforest_clearing"), RiverBiomes.GRAVELLY);

        BIOME_TO_RIVER.put(vpb("red_desert"), RiverBiomes.CARVED);
        BIOME_TO_RIVER.put(vpb("red_desert_plateau"), RiverBiomes.CARVED);
        BIOME_TO_RIVER.put(vpb("oasis"), RiverBiomes.TROPICAL);
        BIOME_TO_RIVER.put(vpb("lush_desert"), RiverBiomes.SANDY);
        BIOME_TO_RIVER.put(vpb("desert_plateau"), RiverBiomes.SANDY);
        BIOME_TO_RIVER.put(vpb("taiga_lake"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("taiga_clearing"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("berry_fields"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("taiga_edge"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("pine_taiga"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("fen"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("mixed_taiga"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("tall_taiga"), RiverBiomes.GRAVELLY);
        BIOME_TO_RIVER.put(vpb("tall_pine_taiga"), RiverBiomes.GRAVELLY);
    }

    private static Identifier traverse(String name) {
        return new Identifier("traverse", name);
    }

    private static Identifier terrestria(String name) {
        return new Identifier("terrestria", name);
    }

    private static Identifier vpb(String name) {
        return new Identifier("vanillaplusbiomes", name);
    }

    public static void add(Registry<Biome> biomes) {
        for (Identifier id : biomes.getIds()) {
            add(biomes, id);
        }
    }

    private static void add(Registry<Biome> biomes, Identifier id) {
//        if (BIOME_TO_RIVER.containsKey(id)) {
//            OverworldBiomes.setRiverBiome(biomes.getKey(biomes.get(id)).get(), BIOME_TO_RIVER.get(id));
//        }
    }
}
