
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingDraftBuilder builder) {
        ShippingDraft shippingDraft = builder.buildUnchecked();
        Assertions.assertThat(shippingDraft).isInstanceOf(ShippingDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShippingDraft.builder().key("key") },
                new Object[] { "shippingMethod",
                        ShippingDraft.builder()
                                .shippingMethod(
                                    new com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl()) },
                new Object[] { "shippingAddress",
                        ShippingDraft.builder()
                                .shippingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingRateInput", ShippingDraft.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) },
                new Object[] { "externalTaxRate",
                        ShippingDraft.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "deliveries",
                        ShippingDraft.builder()
                                .deliveries(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl())) },
                new Object[] { "custom", ShippingDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        ShippingDraft value = ShippingDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void shippingMethod() {
        ShippingDraft value = ShippingDraft.of();
        value.setShippingMethod(new com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl());
    }

    @Test
    public void shippingAddress() {
        ShippingDraft value = ShippingDraft.of();
        value.setShippingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingRateInput() {
        ShippingDraft value = ShippingDraft.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }

    @Test
    public void externalTaxRate() {
        ShippingDraft value = ShippingDraft.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void deliveries() {
        ShippingDraft value = ShippingDraft.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
    }

    @Test
    public void custom() {
        ShippingDraft value = ShippingDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
