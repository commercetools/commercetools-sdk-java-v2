
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListsConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListsConfigurationBuilder builder) {
        ShoppingListsConfiguration shoppingListsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(shoppingListsConfiguration).isInstanceOf(ShoppingListsConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deleteDaysAfterLastModification",
                ShoppingListsConfiguration.builder().deleteDaysAfterLastModification(3L) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        ShoppingListsConfiguration value = ShoppingListsConfiguration.of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }
}
