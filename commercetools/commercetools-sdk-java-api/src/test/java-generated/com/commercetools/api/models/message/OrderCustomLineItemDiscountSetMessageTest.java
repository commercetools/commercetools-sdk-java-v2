
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
public class OrderCustomLineItemDiscountSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemDiscountSetMessageBuilder builder) {
        OrderCustomLineItemDiscountSetMessage orderCustomLineItemDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemDiscountSetMessage)
                .isInstanceOf(OrderCustomLineItemDiscountSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomLineItemDiscountSetMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { OrderCustomLineItemDiscountSetMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderCustomLineItemDiscountSetMessage.builder()
                        .discountedPricePerQuantity(Collections.singletonList(
                            new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { OrderCustomLineItemDiscountSetMessage.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void taxedPrice() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }
}
