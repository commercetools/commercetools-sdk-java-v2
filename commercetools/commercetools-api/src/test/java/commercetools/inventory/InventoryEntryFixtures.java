package commercetools.inventory;

import com.commercetools.models.Inventory.InventoryEntry;
import com.commercetools.models.Inventory.InventoryEntryDraft;
import com.commercetools.models.Inventory.InventoryEntryDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class InventoryEntryFixtures {
    
    public static void withInventoryEntry(final Consumer<InventoryEntry> consumer) {
        InventoryEntry inventoryEntry = create();
        consumer.accept(inventoryEntry);
        delete(inventoryEntry.getId());
    }
    
    public static void withUpdatableInventoryEntry(final UnaryOperator<InventoryEntry> operator) {
        InventoryEntry inventoryEntry = create();
        inventoryEntry = operator.apply(inventoryEntry);
        delete(inventoryEntry.getId());
    }
    
    public static InventoryEntry create() {
        InventoryEntryDraft inventoryEntryDraft = InventoryEntryDraftBuilder.of()
                .sku(CommercetoolsTestUtils.randomString())
                .quantityOnStock(10L)
                .build();
        
        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .inventory()
                .post(inventoryEntryDraft)
                .executeBlocking().getBody();

        Assertions.assertNotNull(inventoryEntry);
        Assertions.assertEquals(inventoryEntry.getSku(), inventoryEntryDraft.getSku());
        Assertions.assertEquals(inventoryEntry.getQuantityOnStock(), inventoryEntryDraft.getQuantityOnStock());
        
        return inventoryEntry;
    }
    
    public static InventoryEntry delete(final String id) {
        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .inventory()
                .withId(id)
                .delete()
                .executeBlocking().getBody();
        Assertions.assertNotNull(inventoryEntry);
        return inventoryEntry;
    }
    
}
