
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListSetDeleteDaysAfterLastModificationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder) {
        MyShoppingListSetDeleteDaysAfterLastModificationAction myShoppingListSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(MyShoppingListSetDeleteDaysAfterLastModificationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deleteDaysAfterLastModification",
                MyShoppingListSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        MyShoppingListSetDeleteDaysAfterLastModificationAction value = MyShoppingListSetDeleteDaysAfterLastModificationAction
                .of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }
}
