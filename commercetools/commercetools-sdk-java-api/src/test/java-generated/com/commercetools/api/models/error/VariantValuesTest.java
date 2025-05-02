
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantValuesTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantValuesBuilder builder) {
        VariantValues variantValues = builder.buildUnchecked();
        Assertions.assertThat(variantValues).isInstanceOf(VariantValues.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", VariantValues.builder().sku("sku") }, new Object[] { "prices",
                VariantValues.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { "attributes", VariantValues.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void sku() {
        VariantValues value = VariantValues.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void prices() {
        VariantValues value = VariantValues.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void attributes() {
        VariantValues value = VariantValues.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
