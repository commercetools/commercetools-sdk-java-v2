
package com.commercetools.api.models.cart;

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
public class CartSetLineItemPriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetLineItemPriceActionBuilder builder) {
        CartSetLineItemPriceAction cartSetLineItemPriceAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemPriceAction).isInstanceOf(CartSetLineItemPriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetLineItemPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { CartSetLineItemPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartSetLineItemPriceAction.builder()
                        .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemPriceAction value = CartSetLineItemPriceAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemPriceAction value = CartSetLineItemPriceAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalPrice() {
        CartSetLineItemPriceAction value = CartSetLineItemPriceAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
