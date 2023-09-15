
package com.commercetools.history.models.change_value;

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
public class ShoppingListLineItemValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListLineItemValueBuilder builder) {
        ShoppingListLineItemValue shoppingListLineItemValue = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemValue).isInstanceOf(ShoppingListLineItemValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListLineItemValue.builder().id("id") },
                new Object[] { ShoppingListLineItemValue.builder()
                        .name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ShoppingListLineItemValue.builder().variantId(5) } };
    }

    @Test
    public void id() {
        ShoppingListLineItemValue value = ShoppingListLineItemValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        ShoppingListLineItemValue value = ShoppingListLineItemValue.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variantId() {
        ShoppingListLineItemValue value = ShoppingListLineItemValue.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }
}
