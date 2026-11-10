
package com.commercetools.api.models.variant_attributes;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAttributesTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAttributesBuilder builder) {
        VariantAttributes variantAttributes = builder.buildUnchecked();
        Assertions.assertThat(variantAttributes).isInstanceOf(VariantAttributes.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productId", VariantAttributes.builder().productId("productId") },
                new Object[] { "productKey", VariantAttributes.builder().productKey("productKey") },
                new Object[] { "attributes", VariantAttributes.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataImpl())) },
                new Object[] { "variants", VariantAttributes.builder()
                        .variants(Collections.singletonList(
                            new com.commercetools.api.models.variant_attributes.VariantAttributesVariantImpl())) } };
    }

    @Test
    public void productId() {
        VariantAttributes value = VariantAttributes.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void productKey() {
        VariantAttributes value = VariantAttributes.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void attributes() {
        VariantAttributes value = VariantAttributes.of();
        value.setAttributes(Collections.singletonList(
            new com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataImpl()));
    }

    @Test
    public void variants() {
        VariantAttributes value = VariantAttributes.of();
        value.setVariants(Collections
                .singletonList(new com.commercetools.api.models.variant_attributes.VariantAttributesVariantImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.variant_attributes.VariantAttributesVariantImpl()));
    }
}
