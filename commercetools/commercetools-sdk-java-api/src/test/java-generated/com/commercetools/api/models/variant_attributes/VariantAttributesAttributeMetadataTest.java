
package com.commercetools.api.models.variant_attributes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAttributesAttributeMetadataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAttributesAttributeMetadataBuilder builder) {
        VariantAttributesAttributeMetadata variantAttributesAttributeMetadata = builder.buildUnchecked();
        Assertions.assertThat(variantAttributesAttributeMetadata)
                .isInstanceOf(VariantAttributesAttributeMetadata.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", VariantAttributesAttributeMetadata.builder().name("name") },
                new Object[] { "label",
                        VariantAttributesAttributeMetadata.builder()
                                .label(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "type", VariantAttributesAttributeMetadata.builder().type("type") } };
    }

    @Test
    public void name() {
        VariantAttributesAttributeMetadata value = VariantAttributesAttributeMetadata.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void label() {
        VariantAttributesAttributeMetadata value = VariantAttributesAttributeMetadata.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void type() {
        VariantAttributesAttributeMetadata value = VariantAttributesAttributeMetadata.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
