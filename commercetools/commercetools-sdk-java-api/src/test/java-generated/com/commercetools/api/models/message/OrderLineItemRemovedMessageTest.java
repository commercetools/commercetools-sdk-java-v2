
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
public class OrderLineItemRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemRemovedMessageBuilder builder) {
        OrderLineItemRemovedMessage orderLineItemRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemRemovedMessage).isInstanceOf(OrderLineItemRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderLineItemRemovedMessage.builder().lineItemId("lineItemId") },
                new Object[] { OrderLineItemRemovedMessage.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderLineItemRemovedMessage.builder().removedQuantity(7L) },
                new Object[] { OrderLineItemRemovedMessage.builder().newQuantity(4L) },
                new Object[] { OrderLineItemRemovedMessage.builder()
                        .newState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) },
                new Object[] { OrderLineItemRemovedMessage.builder()
                        .newTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { OrderLineItemRemovedMessage.builder()
                        .newTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { OrderLineItemRemovedMessage.builder()
                        .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { OrderLineItemRemovedMessage.builder()
                        .newShippingDetail(new com.commercetools.api.models.cart.ItemShippingDetailsImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void removedQuantity() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setRemovedQuantity(7L);
        Assertions.assertThat(value.getRemovedQuantity()).isEqualTo(7L);
    }

    @Test
    public void newQuantity() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setNewQuantity(4L);
        Assertions.assertThat(value.getNewQuantity()).isEqualTo(4L);
    }

    @Test
    public void newState() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setNewState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getNewState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }

    @Test
    public void newTotalPrice() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setNewTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getNewTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void newTaxedPrice() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setNewTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getNewTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void newPrice() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setNewPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getNewPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void newShippingDetail() {
        OrderLineItemRemovedMessage value = OrderLineItemRemovedMessage.of();
        value.setNewShippingDetail(new com.commercetools.api.models.cart.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getNewShippingDetail())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsImpl());
    }
}
