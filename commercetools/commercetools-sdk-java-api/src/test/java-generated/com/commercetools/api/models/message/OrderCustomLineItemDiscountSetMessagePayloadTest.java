
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
public class OrderCustomLineItemDiscountSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemDiscountSetMessagePayloadBuilder builder) {
        OrderCustomLineItemDiscountSetMessagePayload orderCustomLineItemDiscountSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderCustomLineItemDiscountSetMessagePayload)
                .isInstanceOf(OrderCustomLineItemDiscountSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        OrderCustomLineItemDiscountSetMessagePayload.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        OrderCustomLineItemDiscountSetMessagePayload.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderCustomLineItemDiscountSetMessagePayload.builder()
                        .discountedPricePerQuantity(Collections.singletonList(
                            new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { OrderCustomLineItemDiscountSetMessagePayload.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void taxedPrice() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }
}
