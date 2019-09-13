package commercetools.shopping_list;

import com.commercetools.models.shopping_list.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
         ShoppingList shoppingList = ShoppingListFixtures.createShoppingList();
         ShoppingListFixtures.deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
    }
    
    @Test
    public void getById() {
        ShoppingListFixtures.withShoppingList(shoppingList -> {
            ShoppingList queriedShoppingList = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shoppingLists()
                    .withId(shoppingList.getId())
                    .get()
                    .executeBlocking().getBody();

            Assertions.assertNotNull(queriedShoppingList);
            Assertions.assertEquals(shoppingList.getId(), queriedShoppingList.getId());
        });
    }

    @Test
    public void getByKey() {
        ShoppingListFixtures.withShoppingList(shoppingList -> {
            ShoppingList queriedShoppingList = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shoppingLists()
                    .withKey(shoppingList.getKey())
                    .get()
                    .executeBlocking().getBody();

            Assertions.assertNotNull(queriedShoppingList);
            Assertions.assertEquals(shoppingList.getKey(), queriedShoppingList.getKey());
        });
    }
    
    @Test
    public void query() {
        ShoppingListFixtures.withShoppingList(shoppingList -> {
            ShoppingListPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shoppingLists()
                    .get()
                    .addWhere("id=" + "\"" + shoppingList.getId() + "\"")
                    .executeBlocking().getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), shoppingList.getId());
        });
    }   
    
    @Test
    public void updateByKey() {
        ShoppingListFixtures.withUpdateableShoppingList(shoppingList -> {
            
            List<ShoppingListUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShoppingListSetKeyActionBuilder.of().key(newKey).build());

            ShoppingList updatedShoppingList = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shoppingLists()
                    .withKey(shoppingList.getKey())
                    .post(ShoppingListUpdateBuilder.of()
                            .version(shoppingList.getVersion())
                            .actions(updateActions).build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedShoppingList);
            Assertions.assertEquals(updatedShoppingList.getKey(),newKey);
            
            return updatedShoppingList;
        });
    }

    @Test
    public void updateById() {
        ShoppingListFixtures.withUpdateableShoppingList(shoppingList -> {

            List<ShoppingListUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShoppingListSetKeyActionBuilder.of().key(newKey).build());

            ShoppingList updatedShoppingList = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shoppingLists()
                    .withId(shoppingList.getId())
                    .post(ShoppingListUpdateBuilder.of()
                            .version(shoppingList.getVersion())
                            .actions(updateActions).build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedShoppingList);
            Assertions.assertEquals(updatedShoppingList.getKey(),newKey);

            return updatedShoppingList;
        });
    }
    
    @Test
    public void deleteByKey() {
        ShoppingList shoppingList = ShoppingListFixtures.createShoppingList();
        ShoppingList deletedShoppingList = ShoppingListFixtures.deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
        Assertions.assertNotNull(deletedShoppingList);
        Assertions.assertEquals(shoppingList.getId(), deletedShoppingList.getId());
    }
    
}
