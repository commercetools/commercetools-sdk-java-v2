
package com.commercetools.api.models.project;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ShoppingListsConfigurationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListsConfigurationBuilder builder) {
        ShoppingListsConfiguration shoppingListsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(shoppingListsConfiguration).isInstanceOf(ShoppingListsConfiguration.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListsConfiguration.builder().deleteDaysAfterLastModification(3L) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        ShoppingListsConfiguration value = ShoppingListsConfiguration.of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }
}
