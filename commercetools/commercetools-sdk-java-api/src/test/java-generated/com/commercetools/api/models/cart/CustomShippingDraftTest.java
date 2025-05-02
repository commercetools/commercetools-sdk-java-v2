
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomShippingDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomShippingDraftBuilder builder) {
        CustomShippingDraft customShippingDraft = builder.buildUnchecked();
        Assertions.assertThat(customShippingDraft).isInstanceOf(CustomShippingDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomShippingDraft.builder().key("key") },
                new Object[] { "shippingMethodName",
                        CustomShippingDraft.builder().shippingMethodName("shippingMethodName") },
                new Object[] { "shippingAddress",
                        CustomShippingDraft.builder()
                                .shippingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingRate", CustomShippingDraft.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { "shippingRateInput", CustomShippingDraft.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) },
                new Object[] { "taxCategory", CustomShippingDraft.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate",
                        CustomShippingDraft.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "deliveries",
                        CustomShippingDraft.builder()
                                .deliveries(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl())) },
                new Object[] { "custom", CustomShippingDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void shippingMethodName() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void shippingAddress() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setShippingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingRate() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void shippingRateInput() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }

    @Test
    public void taxCategory() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void deliveries() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
    }

    @Test
    public void custom() {
        CustomShippingDraft value = CustomShippingDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
