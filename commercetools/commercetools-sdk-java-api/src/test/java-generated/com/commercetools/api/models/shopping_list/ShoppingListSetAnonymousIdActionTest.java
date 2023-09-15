
package com.commercetools.api.models.shopping_list;

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
public class ShoppingListSetAnonymousIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetAnonymousIdActionBuilder builder) {
        ShoppingListSetAnonymousIdAction shoppingListSetAnonymousIdAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetAnonymousIdAction).isInstanceOf(ShoppingListSetAnonymousIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListSetAnonymousIdAction.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void anonymousId() {
        ShoppingListSetAnonymousIdAction value = ShoppingListSetAnonymousIdAction.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
