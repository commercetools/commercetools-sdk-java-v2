
package com.commercetools.api.models.message;

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
public class OrderLineItemDiscountSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemDiscountSetMessagePayloadBuilder builder) {
        OrderLineItemDiscountSetMessagePayload orderLineItemDiscountSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemDiscountSetMessagePayload)
                .isInstanceOf(OrderLineItemDiscountSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderLineItemDiscountSetMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { OrderLineItemDiscountSetMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderLineItemDiscountSetMessagePayload.builder()
                        .discountedPricePerQuantity(Collections.singletonList(
                            new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { OrderLineItemDiscountSetMessagePayload.builder()
                        .totalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { OrderLineItemDiscountSetMessagePayload.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { OrderLineItemDiscountSetMessagePayload.builder()
                        .taxedPricePortions(Collections
                                .singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl())) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void totalPrice() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setTotalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void taxedPricePortions() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setTaxedPricePortions(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
        Assertions.assertThat(value.getTaxedPricePortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
    }
}
