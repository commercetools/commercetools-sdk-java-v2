
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantReferenceBuilder builder) {
        VariantReference variantReference = builder.buildUnchecked();
        Assertions.assertThat(variantReference).isInstanceOf(VariantReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        VariantReference.builder().obj(new com.commercetools.api.models.variant.VariantImpl()) },
                new Object[] { "id", VariantReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        VariantReference value = VariantReference.of();
        value.setObj(new com.commercetools.api.models.variant.VariantImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.variant.VariantImpl());
    }

    @Test
    public void id() {
        VariantReference value = VariantReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
