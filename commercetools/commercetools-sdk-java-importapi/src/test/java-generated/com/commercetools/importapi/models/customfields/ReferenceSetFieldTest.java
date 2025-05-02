
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReferenceSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReferenceSetFieldBuilder builder) {
        ReferenceSetField referenceSetField = builder.buildUnchecked();
        Assertions.assertThat(referenceSetField).isInstanceOf(ReferenceSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", ReferenceSetField.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl())) } };
    }

    @Test
    public void value() {
        ReferenceSetField value = ReferenceSetField.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
    }
}
