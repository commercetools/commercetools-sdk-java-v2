
package com.commercetools.api.models.me;

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
public class MyCartSetLineItemShippingDetailsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartSetLineItemShippingDetailsActionBuilder builder) {
        MyCartSetLineItemShippingDetailsAction myCartSetLineItemShippingDetailsAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemShippingDetailsAction)
                .isInstanceOf(MyCartSetLineItemShippingDetailsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyCartSetLineItemShippingDetailsAction.builder().lineItemId("lineItemId") },
                new Object[] { MyCartSetLineItemShippingDetailsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyCartSetLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemShippingDetailsAction value = MyCartSetLineItemShippingDetailsAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemShippingDetailsAction value = MyCartSetLineItemShippingDetailsAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void shippingDetails() {
        MyCartSetLineItemShippingDetailsAction value = MyCartSetLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
