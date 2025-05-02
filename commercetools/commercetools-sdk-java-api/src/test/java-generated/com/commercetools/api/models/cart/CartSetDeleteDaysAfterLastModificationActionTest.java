
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetDeleteDaysAfterLastModificationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetDeleteDaysAfterLastModificationActionBuilder builder) {
        CartSetDeleteDaysAfterLastModificationAction cartSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(CartSetDeleteDaysAfterLastModificationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deleteDaysAfterLastModification",
                CartSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        CartSetDeleteDaysAfterLastModificationAction value = CartSetDeleteDaysAfterLastModificationAction.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }
}
