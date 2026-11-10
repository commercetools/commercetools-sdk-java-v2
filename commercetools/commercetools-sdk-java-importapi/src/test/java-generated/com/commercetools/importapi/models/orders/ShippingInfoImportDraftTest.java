
package com.commercetools.importapi.models.orders;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingInfoImportDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingInfoImportDraftBuilder builder) {
        ShippingInfoImportDraft shippingInfoImportDraft = builder.buildUnchecked();
        Assertions.assertThat(shippingInfoImportDraft).isInstanceOf(ShippingInfoImportDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodName",
                        ShippingInfoImportDraft.builder().shippingMethodName("shippingMethodName") },
                new Object[] { "price",
                        ShippingInfoImportDraft.builder()
                                .price(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { "shippingRate",
                        ShippingInfoImportDraft.builder()
                                .shippingRate(new com.commercetools.importapi.models.orders.ShippingRateDraftImpl()) },
                new Object[] { "taxRate",
                        ShippingInfoImportDraft.builder()
                                .taxRate(new com.commercetools.importapi.models.prices.TaxRateImpl()) },
                new Object[] { "taxCategory", ShippingInfoImportDraft.builder()
                        .taxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl()) },
                new Object[] { "shippingMethod",
                        ShippingInfoImportDraft.builder()
                                .shippingMethod(
                                    new com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl()) },
                new Object[] { "deliveries",
                        ShippingInfoImportDraft.builder()
                                .deliveries(Collections
                                        .singletonList(new com.commercetools.importapi.models.orders.DeliveryImpl())) },
                new Object[] { "discountedPrice",
                        ShippingInfoImportDraft.builder()
                                .discountedPrice(
                                    new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl()) },
                new Object[] { "shippingMethodState",
                        ShippingInfoImportDraft.builder()
                                .shippingMethodState(com.commercetools.importapi.models.orders.ShippingMethodState
                                        .findEnum("DoesNotMatchCart")) } };
    }

    @Test
    public void shippingMethodName() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void price() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setPrice(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getPrice())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void shippingRate() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingRate(new com.commercetools.importapi.models.orders.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.importapi.models.orders.ShippingRateDraftImpl());
    }

    @Test
    public void taxRate() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setTaxRate(new com.commercetools.importapi.models.prices.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.importapi.models.prices.TaxRateImpl());
    }

    @Test
    public void taxCategory() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setTaxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
    }

    @Test
    public void shippingMethod() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethod(new com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl());
    }

    @Test
    public void deliveries() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryImpl()));
    }

    @Test
    public void discountedPrice() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setDiscountedPrice(new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl());
        Assertions.assertThat(value.getDiscountedPrice())
                .isEqualTo(new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl());
    }

    @Test
    public void shippingMethodState() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethodState(
            com.commercetools.importapi.models.orders.ShippingMethodState.findEnum("DoesNotMatchCart"));
        Assertions.assertThat(value.getShippingMethodState())
                .isEqualTo(com.commercetools.importapi.models.orders.ShippingMethodState.findEnum("DoesNotMatchCart"));
    }
}
