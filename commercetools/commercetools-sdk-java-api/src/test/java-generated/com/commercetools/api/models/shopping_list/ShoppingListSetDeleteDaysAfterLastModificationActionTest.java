
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetDeleteDaysAfterLastModificationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder) {
        ShoppingListSetDeleteDaysAfterLastModificationAction shoppingListSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(ShoppingListSetDeleteDaysAfterLastModificationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deleteDaysAfterLastModification",
                ShoppingListSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        ShoppingListSetDeleteDaysAfterLastModificationAction value = ShoppingListSetDeleteDaysAfterLastModificationAction
                .of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }
}
