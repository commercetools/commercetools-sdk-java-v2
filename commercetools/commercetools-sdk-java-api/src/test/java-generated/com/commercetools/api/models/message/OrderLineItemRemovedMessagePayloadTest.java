
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemRemovedMessagePayloadBuilder builder) {
        OrderLineItemRemovedMessagePayload orderLineItemRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemRemovedMessagePayload)
                .isInstanceOf(OrderLineItemRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderLineItemRemovedMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", OrderLineItemRemovedMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { "removedQuantity", OrderLineItemRemovedMessagePayload.builder().removedQuantity(7L) },
                new Object[] { "newQuantity", OrderLineItemRemovedMessagePayload.builder().newQuantity(4L) },
                new Object[] { "newState",
                        OrderLineItemRemovedMessagePayload.builder()
                                .newState(Collections
                                        .singletonList(new com.commercetools.api.models.order.ItemStateImpl())) },
                new Object[] { "newTotalPrice",
                        OrderLineItemRemovedMessagePayload.builder()
                                .newTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "newTaxedPrice",
                        OrderLineItemRemovedMessagePayload.builder()
                                .newTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { "newPrice",
                        OrderLineItemRemovedMessagePayload.builder()
                                .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "newShippingDetail", OrderLineItemRemovedMessagePayload.builder()
                        .newShippingDetail(new com.commercetools.api.models.cart.ItemShippingDetailsImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void removedQuantity() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setRemovedQuantity(7L);
        Assertions.assertThat(value.getRemovedQuantity()).isEqualTo(7L);
    }

    @Test
    public void newQuantity() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setNewQuantity(4L);
        Assertions.assertThat(value.getNewQuantity()).isEqualTo(4L);
    }

    @Test
    public void newState() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setNewState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getNewState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }

    @Test
    public void newTotalPrice() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setNewTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getNewTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void newTaxedPrice() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setNewTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getNewTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void newPrice() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setNewPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getNewPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void newShippingDetail() {
        OrderLineItemRemovedMessagePayload value = OrderLineItemRemovedMessagePayload.of();
        value.setNewShippingDetail(new com.commercetools.api.models.cart.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getNewShippingDetail())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsImpl());
    }
}
