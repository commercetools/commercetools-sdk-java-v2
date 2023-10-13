
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
public class OrderLineItemRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemRemovedMessagePayloadBuilder builder) {
        OrderLineItemRemovedMessagePayload orderLineItemRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemRemovedMessagePayload)
                .isInstanceOf(OrderLineItemRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderLineItemRemovedMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { OrderLineItemRemovedMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderLineItemRemovedMessagePayload.builder().removedQuantity(7L) },
                new Object[] { OrderLineItemRemovedMessagePayload.builder().newQuantity(4L) },
                new Object[] { OrderLineItemRemovedMessagePayload.builder()
                        .newState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) },
                new Object[] { OrderLineItemRemovedMessagePayload.builder()
                        .newTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { OrderLineItemRemovedMessagePayload.builder()
                        .newTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { OrderLineItemRemovedMessagePayload.builder()
                        .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { OrderLineItemRemovedMessagePayload.builder()
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
