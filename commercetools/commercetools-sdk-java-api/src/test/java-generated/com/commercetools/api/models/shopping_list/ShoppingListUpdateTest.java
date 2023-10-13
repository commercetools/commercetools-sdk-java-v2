
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

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
public class ShoppingListUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListUpdateBuilder builder) {
        ShoppingListUpdate shoppingListUpdate = builder.buildUnchecked();
        Assertions.assertThat(shoppingListUpdate).isInstanceOf(ShoppingListUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListUpdate.builder().version(2L) },
                new Object[] { ShoppingListUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.shopping_list.ShoppingListUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ShoppingListUpdate value = ShoppingListUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ShoppingListUpdate value = ShoppingListUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shopping_list.ShoppingListUpdateActionImpl()));
    }
}
