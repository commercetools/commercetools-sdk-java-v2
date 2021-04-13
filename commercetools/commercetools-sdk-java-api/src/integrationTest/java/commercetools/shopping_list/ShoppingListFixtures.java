
package commercetools.shopping_list;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListDraft;
import com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder;
import com.commercetools.api.models.shopping_list.TextLineItemDraftBuilder;
import commercetools.customer.CustomerFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class ShoppingListFixtures {

    public static void withShoppingList(final Consumer<ShoppingList> consumer) {
        ShoppingList shoppingList = createShoppingList();
        consumer.accept(shoppingList);
        deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
    }

    public static void withUpdateableShoppingList(final UnaryOperator<ShoppingList> operator) {
        ShoppingList shoppingList = createShoppingList();
        shoppingList = operator.apply(shoppingList);
        deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
    }

    public static ShoppingList createShoppingList() {

        Customer customer = CustomerFixtures.createCustomer();

        ShoppingListDraft shoppingListDraft = ShoppingListDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .slug(CommercetoolsTestUtils.randomLocalizedString())
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .description(CommercetoolsTestUtils.randomLocalizedString())
                .customer(CustomerResourceIdentifierBuilder.of().id(customer.getId()).build())
                .textLineItems(Arrays.asList(TextLineItemDraftBuilder.of()
                        .addedAt(ZonedDateTime.now().plus(1, ChronoUnit.HOURS))
                        .description(CommercetoolsTestUtils.randomLocalizedString())
                        .name(CommercetoolsTestUtils.randomLocalizedString())
                        .quantity(10)
                        .build()))
                .deleteDaysAfterLastModification(2L)
                .build();

        ShoppingList shoppingList = CommercetoolsTestUtils.getProjectRoot()
                .shoppingLists()
                .post(shoppingListDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(shoppingList);
        Assert.assertEquals(shoppingListDraft.getKey(), shoppingList.getKey());

        return shoppingList;
    }

    public static ShoppingList deleteShoppingList(final String id, final Long version) {
        ShoppingList shoppingList = CommercetoolsTestUtils.getProjectRoot()
                .shoppingLists()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(shoppingList);
        Assert.assertEquals(shoppingList.getId(), id);

        return shoppingList;
    }
}
