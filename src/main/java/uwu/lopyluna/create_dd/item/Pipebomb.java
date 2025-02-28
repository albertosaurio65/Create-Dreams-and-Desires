package uwu.lopyluna.create_dd.item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.AssetLookup;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import uwu.lopyluna.create_dd.item.ItemProperties.ChromaticCompound;
import uwu.lopyluna.create_dd.item.ItemProperties.ForestRavagerItem;
import uwu.lopyluna.create_dd.item.ItemProperties.RefinedRadiance;
import uwu.lopyluna.create_dd.item.ItemProperties.ShadowSteel;

import static com.simibubi.create.AllTags.AllItemTags.CREATE_INGOTS;
import static com.simibubi.create.AllTags.forgeItemTag;
import static uwu.lopyluna.create_dd.DDcreate.REGISTRATE;

public class Pipebomb {

    static {
        REGISTRATE.creativeModeTab(() -> PipebombTab.BASE_CREATIVE_TAB);
    }

    //YIPPEE ITEMS PIPEBOMB YUMMY
    public static final ItemEntry<Item>
            mithril_ingot = taggedIngredient("mithril_ingot", forgeItemTag("ingots/mithril"), CREATE_INGOTS.tag),
            bronze_ingot = taggedIngredient("bronze_ingot", forgeItemTag("ingots/bronze"), forgeItemTag("ingots/strong_bronze"), CREATE_INGOTS.tag),
            steel_ingot = taggedIngredient("steel_ingot", forgeItemTag("ingots/steel"), CREATE_INGOTS.tag),
            tin_ingot = taggedIngredient("tin_ingot", forgeItemTag("ingots/tin"), CREATE_INGOTS.tag),
            industrial_iron_ingot = taggedIngredient("industrial_iron_ingot", forgeItemTag("ingots/industrial_iron"), CREATE_INGOTS.tag),
            mithril_nugget = taggedIngredient("mithril_nugget", forgeItemTag("nuggets/mithril")),
            bronze_nugget = taggedIngredient("bronze_nugget", forgeItemTag("nuggets/bronze"), forgeItemTag("ingots/strong_bronze")),
            steel_nugget = taggedIngredient("steel_nugget", forgeItemTag("nuggets/steel")),
            tin_nugget = taggedIngredient("tin_nugget", forgeItemTag("nuggets/tin")),
            industrial_iron_nugget = taggedIngredient("industrial_iron_nugget", forgeItemTag("nuggets/industrial_iron")),
            mithril_sheet = taggedIngredient("mithril_sheet", forgeItemTag("plates/mithril")),
            bronze_sheet = taggedIngredient("bronze_sheet", forgeItemTag("plates/bronze"), forgeItemTag("ingots/strong_bronze")),
            steel_sheet = taggedIngredient("steel_sheet", forgeItemTag("plates/steel")),
            industrial_iron_sheet = taggedIngredient("industrial_iron_sheet", forgeItemTag("plates/industrial_iron")),
            tin_raw = ingredient("raw_tin"),
            lapis_alloy = taggedIngredient("lapis_alloy", forgeItemTag("ingots/lapis_alloy")),
            lapis_sheet = taggedIngredient("lapis_sheet", forgeItemTag("plates/lapis_alloy")),
            andesite_sheet = taggedIngredient("andesite_sheet", forgeItemTag("plates/andesite_alloy")),
            zinc_sheet = taggedIngredient("zinc_sheet", forgeItemTag("plates/zinc")),
            tin_sheet = taggedIngredient("tin_sheet", forgeItemTag("plates/tin")),
            integrated_circuit = ingredient("integrated_circuit"),
            integrated_mechanism = ingredient("integrated_mechanism"),
            abstruse_mechanism = ingredient("abstruse_mechanism"),
            calculation_mechanism = ingredient("calculation_mechanism"),
            inductive_mechanism = ingredient("inductive_mechanism"),
            infernal_mechanism = ingredient("infernal_mechanism"),
            sealed_mechanism = ingredient("sealed_mechanism"),
            vanilla_orchid = ingredient("vanilla_orchid"),
            spectral_ruby = ingredient("spectral_ruby"),
            polished_spectral_ruby = ingredient("polished_spectral_ruby");

    public static final ItemEntry<SequencedAssemblyItem>
            incomplete_integrated_circuit = sequencedIngredient("incomplete_integrated_circuit"),
            incomplete_integrated_mechanism = sequencedIngredient("incomplete_integrated_mechanism"),
            incomplete_abstruse_mechanism = sequencedIngredient("incomplete_abstruse_mechanism"),
            incomplete_calculation_mechanism = sequencedIngredient("incomplete_calculation_mechanism"),
            incomplete_inductive_mechanism = sequencedIngredient("incomplete_inductive_mechanism"),
            incomplete_infernal_mechanism = sequencedIngredient("incomplete_infernal_mechanism"),
            incomplete_sealed_mechanism = sequencedIngredient("incomplete_sealed_mechanism");

    public static final ItemEntry<ChromaticCompound> CHROMATIC_COMPOUND =
            REGISTRATE.item("chromatic_compound", ChromaticCompound::new)
            .properties(p -> p.stacksTo(16)
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant())
            .register();

    public static final ItemEntry<ShadowSteel> SHADOW_STEEL =
            REGISTRATE.item("shadow_steel", ShadowSteel::new)
            .properties(p -> p.stacksTo(16)
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant())
            .register();

    public static final ItemEntry<RefinedRadiance> REFINED_RADIANCE =
            REGISTRATE.item("refined_radiance", RefinedRadiance::new)
            .properties(p -> p.stacksTo(16)
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant())
            .register();

    public static final ItemEntry<ShadowSteel> SHADOW_STEEL_SHEET =
            REGISTRATE.item("shadow_steel_sheet", ShadowSteel::new)
                    .properties(p -> p.stacksTo(16)
                            .rarity(Rarity.UNCOMMON)
                            .fireResistant())
                    .register();

    public static final ItemEntry<RefinedRadiance> REFINED_RADIANCE_SHEET =
            REGISTRATE.item("refined_radiance_sheet", RefinedRadiance::new)
                    .properties(p -> p.stacksTo(16)
                            .rarity(Rarity.UNCOMMON)
                            .fireResistant())
                    .register();


    public static final ItemEntry<ForestRavagerItem> forest_ravager =
            REGISTRATE.item("forest_ravager", ForestRavagerItem::new)
            .properties(p -> p.stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant())
            .model(AssetLookup.itemModelWithPartials())
            .register();

    private static ItemEntry<Item> ingredient(String name) {
        return REGISTRATE.item(name, Item::new)
                .register();
    }
    private static ItemEntry<SequencedAssemblyItem> sequencedIngredient(String name) {
        return REGISTRATE.item(name, SequencedAssemblyItem::new)
                .register();
    }

    @SafeVarargs
    private static ItemEntry<Item> taggedIngredient(String name, TagKey<Item>... tags) {
        return REGISTRATE.item(name, Item::new)
                .tag(tags)
                .register();
    }

    public static void register() {}
}
