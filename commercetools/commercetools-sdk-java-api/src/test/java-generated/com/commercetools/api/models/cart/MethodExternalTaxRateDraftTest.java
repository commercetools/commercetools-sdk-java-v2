
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodExternalTaxRateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MethodExternalTaxRateDraftBuilder builder) {
        MethodExternalTaxRateDraft methodExternalTaxRateDraft = builder.buildUnchecked();
        Assertions.assertThat(methodExternalTaxRateDraft).isInstanceOf(MethodExternalTaxRateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodKey",
                        MethodExternalTaxRateDraft.builder().shippingMethodKey("shippingMethodKey") },
                new Object[] { "taxRate", MethodExternalTaxRateDraft.builder()
                        .taxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingMethodKey() {
        MethodExternalTaxRateDraft value = MethodExternalTaxRateDraft.of();
        value.setShippingMethodKey("shippingMethodKey");
        Assertions.assertThat(value.getShippingMethodKey()).isEqualTo("shippingMethodKey");
    }

    @Test
    public void taxRate() {
        MethodExternalTaxRateDraft value = MethodExternalTaxRateDraft.of();
        value.setTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
