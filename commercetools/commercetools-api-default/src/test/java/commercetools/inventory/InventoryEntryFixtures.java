package commercetools.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntry;
import com.commercetools.api.generated.models.inventory.InventoryEntryDraft;
import com.commercetools.api.generated.models.inventory.InventoryEntryDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

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

        Assert.assertNotNull(inventoryEntry);
        Assert.assertEquals(inventoryEntry.getSku(), inventoryEntryDraft.getSku());
        Assert.assertEquals(inventoryEntry.getQuantityOnStock(), inventoryEntryDraft.getQuantityOnStock());
        
        return inventoryEntry;
    }
    
    public static InventoryEntry delete(final String id) {
        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .inventory()
                .withId(id)
                .delete()
                .executeBlocking().getBody();
        Assert.assertNotNull(inventoryEntry);
        return inventoryEntry;
    }
    
}
