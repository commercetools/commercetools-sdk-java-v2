
package commercetools.inventory;

import static commercetools.inventory.InventoryEntryFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.inventory.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryIntegrationTests {

    @Test
    public void createAndDelete() {
        InventoryEntryDraft inventoryEntryDraft = InventoryEntryDraftBuilder.of()
                .sku(CommercetoolsTestUtils.randomString())
                .quantityOnStock(10L)
                .build();

        InventoryEntry inventoryEntry = CommercetoolsTestUtils.getProjectApiRoot()
                .inventory()
                .post(inventoryEntryDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(inventoryEntry);
        Assertions.assertEquals(inventoryEntry.getSku(), inventoryEntryDraft.getSku());
        Assertions.assertEquals(inventoryEntry.getQuantityOnStock(), inventoryEntryDraft.getQuantityOnStock());

        InventoryEntry deletedInventoryEntry = CommercetoolsTestUtils.getProjectApiRoot()
                .inventory()
                .withId(inventoryEntry.getId())
                .delete()
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedInventoryEntry);
        Assertions.assertEquals(inventoryEntry.getId(), deletedInventoryEntry.getId());
    }

    @Test
    public void getById() {
        withInventoryEntry(inventoryEntry -> {
            InventoryEntry queriedInventoryEntry = CommercetoolsTestUtils.getProjectApiRoot()
                    .inventory()
                    .withId(inventoryEntry.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(queriedInventoryEntry);
            Assertions.assertEquals(inventoryEntry.getId(), queriedInventoryEntry.getId());
        });
    }

    @Test
    public void query() {
        withInventoryEntry(inventoryEntry -> {
            InventoryPagedQueryResponse inventoryPagedQueryResponse = CommercetoolsTestUtils.getProjectApiRoot()
                    .inventory()
                    .get()
                    .withWhere("id=" + "\"" + inventoryEntry.getId() + "\"")
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(inventoryPagedQueryResponse);
            Assertions.assertEquals(inventoryPagedQueryResponse.getResults().get(0).getId(), inventoryEntry.getId());
        });
    }

    @Test
    public void update() {
        withUpdatableInventoryEntry(inventoryEntry -> {
            List<InventoryEntryUpdateAction> updateActions = new ArrayList<>();
            updateActions.add(InventoryEntrySetRestockableInDaysActionBuilder.of().restockableInDays(10L).build());

            InventoryEntry updatedInventoryEntry = CommercetoolsTestUtils.getProjectApiRoot()
                    .inventory()
                    .withId(inventoryEntry.getId())
                    .post(InventoryEntryUpdateBuilder.of()
                            .actions(updateActions)
                            .version(inventoryEntry.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedInventoryEntry);
            Assertions.assertEquals(updatedInventoryEntry.getRestockableInDays(), Long.valueOf(10));

            return updatedInventoryEntry;
        });
    }
}
