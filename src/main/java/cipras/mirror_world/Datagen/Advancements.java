package cipras.mirror_world.Datagen;

import cipras.mirror_world.MirrorWorld;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class Advancements implements Consumer<Consumer<Advancement>> {
    @Override
    public void accept(Consumer<Advancement> advancementConsumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        Items.GLASS,
                        Text.literal("Mirror World"),
                        Text.literal("It's just a try."),
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.CHALLENGE,
                        true,
                        false,
                        true
                )
                .criterion("got_dirt", InventoryChangedCriterion.Conditions.items(Items.DIRT))
                .build(advancementConsumer, MirrorWorld.MOD_ID + "/root");
    }
}
