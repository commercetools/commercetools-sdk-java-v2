
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartAddCustomShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartAddCustomShippingMethodActionBuilder builder) {
        CartAddCustomShippingMethodAction cartAddCustomShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddCustomShippingMethodAction).isInstanceOf(CartAddCustomShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", CartAddCustomShippingMethodAction.builder().shippingKey("shippingKey") },
                new Object[] { "shippingMethodName",
                        CartAddCustomShippingMethodAction.builder().shippingMethodName("shippingMethodName") },
                new Object[] { "shippingAddress",
                        CartAddCustomShippingMethodAction.builder()
                                .shippingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingRate", CartAddCustomShippingMethodAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { "shippingRateInput", CartAddCustomShippingMethodAction.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) },
                new Object[] { "taxCategory", CartAddCustomShippingMethodAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate",
                        CartAddCustomShippingMethodAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "deliveries",
                        CartAddCustomShippingMethodAction.builder()
                                .deliveries(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl())) },
                new Object[] { "custom", CartAddCustomShippingMethodAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void shippingMethodName() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void shippingAddress() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setShippingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingRate() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void shippingRateInput() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }

    @Test
    public void taxCategory() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void deliveries() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
    }

    @Test
    public void custom() {
        CartAddCustomShippingMethodAction value = CartAddCustomShippingMethodAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
