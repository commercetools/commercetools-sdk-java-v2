
package com.commercetools.api.models.variant_attributes;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAttributesVariantTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAttributesVariantBuilder builder) {
        VariantAttributesVariant variantAttributesVariant = builder.buildUnchecked();
        Assertions.assertThat(variantAttributesVariant).isInstanceOf(VariantAttributesVariant.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantAttributesVariant.builder().id("id") },
                new Object[] { "sku", VariantAttributesVariant.builder().sku("sku") },
                new Object[] { "key", VariantAttributesVariant.builder().key("key") },
                new Object[] { "availability", VariantAttributesVariant.builder()
                        .availability(
                            new com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityImpl()) },
                new Object[] { "attributes", VariantAttributesVariant.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void id() {
        VariantAttributesVariant value = VariantAttributesVariant.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void sku() {
        VariantAttributesVariant value = VariantAttributesVariant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        VariantAttributesVariant value = VariantAttributesVariant.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void availability() {
        VariantAttributesVariant value = VariantAttributesVariant.of();
        value.setAvailability(new com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityImpl());
        Assertions.assertThat(value.getAvailability())
                .isEqualTo(new com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityImpl());
    }

    @Test
    public void attributes() {
        VariantAttributesVariant value = VariantAttributesVariant.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
