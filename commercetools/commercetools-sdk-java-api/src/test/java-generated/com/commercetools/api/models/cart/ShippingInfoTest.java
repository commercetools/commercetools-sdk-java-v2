
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingInfoBuilder builder) {
        ShippingInfo shippingInfo = builder.buildUnchecked();
        Assertions.assertThat(shippingInfo).isInstanceOf(ShippingInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodName", ShippingInfo.builder().shippingMethodName("shippingMethodName") },
                new Object[] { "price",
                        ShippingInfo.builder()
                                .price(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "shippingRate",
                        ShippingInfo.builder()
                                .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateImpl()) },
                new Object[] { "taxedPrice",
                        ShippingInfo.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { "taxRate",
                        ShippingInfo.builder().taxRate(new com.commercetools.api.models.tax_category.TaxRateImpl()) },
                new Object[] { "taxCategory", ShippingInfo.builder()
                        .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl()) },
                new Object[] { "shippingMethod",
                        ShippingInfo.builder()
                                .shippingMethod(
                                    new com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl()) },
                new Object[] { "deliveries", ShippingInfo.builder()
                        .deliveries(Collections.singletonList(new com.commercetools.api.models.order.DeliveryImpl())) },
                new Object[] { "discountedPrice",
                        ShippingInfo.builder()
                                .discountedPrice(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl()) },
                new Object[] { "shippingMethodState", ShippingInfo.builder()
                        .shippingMethodState(
                            com.commercetools.api.models.cart.ShippingMethodState.findEnum("DoesNotMatchCart")) } };
    }

    @Test
    public void shippingMethodName() {
        ShippingInfo value = ShippingInfo.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void price() {
        ShippingInfo value = ShippingInfo.of();
        value.setPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void shippingRate() {
        ShippingInfo value = ShippingInfo.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateImpl());
    }

    @Test
    public void taxedPrice() {
        ShippingInfo value = ShippingInfo.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void taxRate() {
        ShippingInfo value = ShippingInfo.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateImpl());
    }

    @Test
    public void taxCategory() {
        ShippingInfo value = ShippingInfo.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
    }

    @Test
    public void shippingMethod() {
        ShippingInfo value = ShippingInfo.of();
        value.setShippingMethod(new com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl());
    }

    @Test
    public void deliveries() {
        ShippingInfo value = ShippingInfo.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.api.models.order.DeliveryImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryImpl()));
    }

    @Test
    public void discountedPrice() {
        ShippingInfo value = ShippingInfo.of();
        value.setDiscountedPrice(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getDiscountedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl());
    }

    @Test
    public void shippingMethodState() {
        ShippingInfo value = ShippingInfo.of();
        value.setShippingMethodState(
            com.commercetools.api.models.cart.ShippingMethodState.findEnum("DoesNotMatchCart"));
        Assertions.assertThat(value.getShippingMethodState())
                .isEqualTo(com.commercetools.api.models.cart.ShippingMethodState.findEnum("DoesNotMatchCart"));
    }
}
