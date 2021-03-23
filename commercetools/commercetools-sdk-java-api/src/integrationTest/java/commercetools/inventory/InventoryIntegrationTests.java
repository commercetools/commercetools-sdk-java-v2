
package commercetools.inventory;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.inventory.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class InventoryIntegrationTests {

    @Test
    public void createAndDelete() {
        InventoryEntryDraft inventoryEntryDraft = InventoryEntryDraftBuilder.of()
                .sku(CommercetoolsTestUtils.randomString())
                .quantityOnStock(10L)
                .build();

        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getProjectRoot()
                .inventory()
                .post(inventoryEntryDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(inventoryEntry);
        Assert.assertEquals(inventoryEntry.getSku(), inventoryEntryDraft.getSku());
        Assert.assertEquals(inventoryEntry.getQuantityOnStock(), inventoryEntryDraft.getQuantityOnStock());

        InventoryEntry deletedInventoryEntry = CommercetoolsTestUtils.getProjectRoot()
                .inventory()
                .withId(inventoryEntry.getId())
                .delete()
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedInventoryEntry);
        Assert.assertEquals(inventoryEntry.getId(), deletedInventoryEntry.getId());
    }

    @Test
    public void getById() {
        InventoryEntryFixtures.withInventoryEntry(inventoryEntry -> {
            InventoryEntry queriedInventoryEntry = CommercetoolsTestUtils.getProjectRoot()
                    .inventory()
                    .withId(inventoryEntry.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assert.assertNotNull(queriedInventoryEntry);
            Assert.assertEquals(inventoryEntry.getId(), queriedInventoryEntry.getId());
        });
    }

    @Test
    public void query() {
        InventoryEntryFixtures.withInventoryEntry(inventoryEntry -> {
            InventoryPagedQueryResponse inventoryPagedQueryResponse = CommercetoolsTestUtils.getProjectRoot()
                    .inventory()
                    .get()
                    .withWhere("id=" + "\"" + inventoryEntry.getId() + "\"")
                    .executeBlocking()
                    .getBody();
            Assert.assertNotNull(inventoryPagedQueryResponse);
            Assert.assertEquals(inventoryPagedQueryResponse.getResults().get(0).getId(), inventoryEntry.getId());
        });
    }

    @Test
    public void update() {
        InventoryEntryFixtures.withUpdatableInventoryEntry(inventoryEntry -> {
            List<InventoryEntryUpdateAction> updateActions = new ArrayList<>();
            updateActions.add(InventoryEntrySetRestockableInDaysActionBuilder.of().restockableInDays(10L).build());

            InventoryEntry updatedInventoryEntry = CommercetoolsTestUtils.getProjectRoot()
                    .inventory()
                    .withId(inventoryEntry.getId())
                    .post(InventoryEntryUpdateBuilder.of()
                            .actions(updateActions)
                            .version(inventoryEntry.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedInventoryEntry);
            Assert.assertEquals(updatedInventoryEntry.getRestockableInDays(), Long.valueOf(10));

            return updatedInventoryEntry;
        });
    }
}
