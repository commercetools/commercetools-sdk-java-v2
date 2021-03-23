
package commercetools.shopping_list;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.shopping_list.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingListIntegrationTests {

    @Test
    public void createAndDeleteById() {
        ShoppingList shoppingList = ShoppingListFixtures.createShoppingList();
        ShoppingListFixtures.deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
    }

    @Test
    public void getById() {
        ShoppingListFixtures.withShoppingList(shoppingList -> {
            ShoppingList queriedShoppingList = CommercetoolsTestUtils.getProjectRoot()
                    .shoppingLists()
                    .withId(shoppingList.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedShoppingList);
            Assert.assertEquals(shoppingList.getId(), queriedShoppingList.getId());
        });
    }

    @Test
    public void getByKey() {
        ShoppingListFixtures.withShoppingList(shoppingList -> {
            ShoppingList queriedShoppingList = CommercetoolsTestUtils.getProjectRoot()
                    .shoppingLists()
                    .withKey(shoppingList.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedShoppingList);
            Assert.assertEquals(shoppingList.getKey(), queriedShoppingList.getKey());
        });
    }

    @Test
    public void query() {
        ShoppingListFixtures.withShoppingList(shoppingList -> {
            ShoppingListPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .shoppingLists()
                    .get()
                    .withWhere("id=" + "\"" + shoppingList.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), shoppingList.getId());
        });
    }

    @Test
    public void updateByKey() {
        ShoppingListFixtures.withUpdateableShoppingList(shoppingList -> {

            List<ShoppingListUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShoppingListSetKeyActionBuilder.of().key(newKey).build());

            ShoppingList updatedShoppingList = CommercetoolsTestUtils.getProjectRoot()
                    .shoppingLists()
                    .withKey(shoppingList.getKey())
                    .post(ShoppingListUpdateBuilder.of()
                            .version(shoppingList.getVersion())
                            .actions(updateActions)
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedShoppingList);
            Assert.assertEquals(updatedShoppingList.getKey(), newKey);

            return updatedShoppingList;
        });
    }

    @Test
    public void updateById() {
        ShoppingListFixtures.withUpdateableShoppingList(shoppingList -> {

            List<ShoppingListUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShoppingListSetKeyActionBuilder.of().key(newKey).build());

            ShoppingList updatedShoppingList = CommercetoolsTestUtils.getProjectRoot()
                    .shoppingLists()
                    .withId(shoppingList.getId())
                    .post(ShoppingListUpdateBuilder.of()
                            .version(shoppingList.getVersion())
                            .actions(updateActions)
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedShoppingList);
            Assert.assertEquals(updatedShoppingList.getKey(), newKey);

            return updatedShoppingList;
        });
    }

    @Test
    public void deleteByKey() {
        ShoppingList shoppingList = ShoppingListFixtures.createShoppingList();
        ShoppingList deletedShoppingList = ShoppingListFixtures.deleteShoppingList(shoppingList.getId(),
            shoppingList.getVersion());
        Assert.assertNotNull(deletedShoppingList);
        Assert.assertEquals(shoppingList.getId(), deletedShoppingList.getId());
    }

}
