
package commercetools.shopping_list;

import static commercetools.customer.CustomerFixtures.*;
import static commercetools.shopping_list.ShoppingListFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.shopping_list.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingListIntegrationTests {

    @Test
    public void createAndDeleteById() {
        withCustomer(customer -> {
            ShoppingList shoppingList = createShoppingList(customer);
            deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
        });
    }

    @Test
    public void getById() {
        withShoppingList(shoppingList -> {
            ShoppingList queriedShoppingList = CommercetoolsTestUtils.getProjectApiRoot()
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
        withShoppingList(shoppingList -> {
            ShoppingList queriedShoppingList = CommercetoolsTestUtils.getProjectApiRoot()
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
        withShoppingList(shoppingList -> {
            ShoppingListPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
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
        withUpdateableShoppingList(shoppingList -> {

            List<ShoppingListUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShoppingListSetKeyActionBuilder.of().key(newKey).build());

            ShoppingList updatedShoppingList = CommercetoolsTestUtils.getProjectApiRoot()
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
        withUpdateableShoppingList(shoppingList -> {

            List<ShoppingListUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShoppingListSetKeyActionBuilder.of().key(newKey).build());

            ShoppingList updatedShoppingList = CommercetoolsTestUtils.getProjectApiRoot()
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
        withCustomer(customer -> {
            ShoppingList shoppingList = createShoppingList(customer);
            ShoppingList deletedShoppingList = deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
            Assert.assertNotNull(deletedShoppingList);
            Assert.assertEquals(shoppingList.getId(), deletedShoppingList.getId());
        });
    }

}
