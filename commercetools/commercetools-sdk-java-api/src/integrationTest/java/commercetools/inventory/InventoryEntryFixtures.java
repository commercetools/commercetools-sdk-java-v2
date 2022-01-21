
package commercetools.inventory;

import static commercetools.channel.ChannelFixtures.*;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.inventory.InventoryEntryDraft;
import com.commercetools.api.models.inventory.InventoryEntryDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class InventoryEntryFixtures {

    public static void withInventoryEntry(final Consumer<InventoryEntry> consumer) {
        withChannel(channel -> {
            InventoryEntry inventoryEntry = create(channel);
            try {
                consumer.accept(inventoryEntry);
            }
            finally {
                delete(inventoryEntry.getId());
            }
        });
    }

    public static void withUpdatableInventoryEntry(final UnaryOperator<InventoryEntry> operator) {
        withChannel(channel -> {
            InventoryEntry inventoryEntry = create(channel);
            try {
                inventoryEntry = operator.apply(inventoryEntry);
            }
            finally {
                delete(inventoryEntry.getId());
            }
        });
    }

    public static InventoryEntry create(Channel channel) {
        InventoryEntryDraft inventoryEntryDraft = InventoryEntryDraftBuilder.of()
                .sku(CommercetoolsTestUtils.randomString())
                .quantityOnStock(10L)
                .expectedDelivery(ZonedDateTime.now().plus(1, ChronoUnit.DAYS))
                .supplyChannel(ChannelResourceIdentifierBuilder.of().id(channel.getId()).build())
                .build();

        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getProjectApiRoot()
                .inventory()
                .post(inventoryEntryDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(inventoryEntry);
        Assertions.assertEquals(inventoryEntry.getSku(), inventoryEntryDraft.getSku());
        Assertions.assertEquals(inventoryEntry.getQuantityOnStock(), inventoryEntryDraft.getQuantityOnStock());

        return inventoryEntry;
    }

    public static InventoryEntry delete(final String id) {
        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getProjectApiRoot()
                .inventory()
                .withId(id)
                .delete()
                .executeBlocking()
                .getBody();
        Assertions.assertNotNull(inventoryEntry);
        return inventoryEntry;
    }

}
