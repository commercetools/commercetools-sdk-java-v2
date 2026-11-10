
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReferenceSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReferenceSetAttributeBuilder builder) {
        ReferenceSetAttribute referenceSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(referenceSetAttribute).isInstanceOf(ReferenceSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", ReferenceSetAttribute.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl())) } };
    }

    @Test
    public void value() {
        ReferenceSetAttribute value = ReferenceSetAttribute.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
    }
}
