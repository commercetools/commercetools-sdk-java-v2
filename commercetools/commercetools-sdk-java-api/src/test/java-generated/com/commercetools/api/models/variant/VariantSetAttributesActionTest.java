
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAttributesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAttributesActionBuilder builder) {
        VariantSetAttributesAction variantSetAttributesAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAttributesAction).isInstanceOf(VariantSetAttributesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributes",
                        VariantSetAttributesAction.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "staged", VariantSetAttributesAction.builder().staged(true) } };
    }

    @Test
    public void attributes() {
        VariantSetAttributesAction value = VariantSetAttributesAction.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void staged() {
        VariantSetAttributesAction value = VariantSetAttributesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
