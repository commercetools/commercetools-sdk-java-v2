
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
public class OrderLineItemDiscountSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemDiscountSetMessageBuilder builder) {
        OrderLineItemDiscountSetMessage orderLineItemDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemDiscountSetMessage).isInstanceOf(OrderLineItemDiscountSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderLineItemDiscountSetMessage.builder().lineItemId("lineItemId") },
                new Object[] { OrderLineItemDiscountSetMessage.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderLineItemDiscountSetMessage.builder()
                        .discountedPricePerQuantity(Collections.singletonList(
                            new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { OrderLineItemDiscountSetMessage.builder()
                        .totalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { OrderLineItemDiscountSetMessage.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { OrderLineItemDiscountSetMessage.builder()
                        .taxedPricePortions(Collections
                                .singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl())) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void totalPrice() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void taxedPricePortions() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setTaxedPricePortions(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
        Assertions.assertThat(value.getTaxedPricePortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
    }
}
