
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReferenceAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReferenceAttributeBuilder builder) {
        ReferenceAttribute referenceAttribute = builder.buildUnchecked();
        Assertions.assertThat(referenceAttribute).isInstanceOf(ReferenceAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", ReferenceAttribute.builder()
                .value(new com.commercetools.importapi.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void value() {
        ReferenceAttribute value = ReferenceAttribute.of();
        value.setValue(new com.commercetools.importapi.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.KeyReferenceImpl());
    }
}
