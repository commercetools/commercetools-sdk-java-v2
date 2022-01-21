
package commercetools.shopping_list;

import static commercetools.customer.CustomerFixtures.*;

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
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class ShoppingListFixtures {

    public static void withShoppingList(final Consumer<ShoppingList> consumer) {
        withCustomer(customer -> {
            ShoppingList shoppingList = createShoppingList(customer);
            try {
                consumer.accept(shoppingList);
            }
            finally {
                deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
            }
        });
    }

    public static void withUpdateableShoppingList(final UnaryOperator<ShoppingList> operator) {
        withCustomer(customer -> {
            ShoppingList shoppingList = createShoppingList(customer);
            try {
                shoppingList = operator.apply(shoppingList);
            }
            finally {
                deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
            }
        });
    }

    public static ShoppingList createShoppingList(Customer customer) {
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

        ShoppingList shoppingList = CommercetoolsTestUtils.getProjectApiRoot()
                .shoppingLists()
                .post(shoppingListDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(shoppingList);
        Assertions.assertEquals(shoppingListDraft.getKey(), shoppingList.getKey());

        return shoppingList;
    }

    public static ShoppingList deleteShoppingList(final String id, final Long version) {
        ShoppingList shoppingList = CommercetoolsTestUtils.getProjectApiRoot()
                .shoppingLists()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(shoppingList);
        Assertions.assertEquals(shoppingList.getId(), id);

        return shoppingList;
    }
}
