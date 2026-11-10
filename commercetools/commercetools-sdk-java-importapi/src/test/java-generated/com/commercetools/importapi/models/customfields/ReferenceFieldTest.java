
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReferenceFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReferenceFieldBuilder builder) {
        ReferenceField referenceField = builder.buildUnchecked();
        Assertions.assertThat(referenceField).isInstanceOf(ReferenceField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                ReferenceField.builder().value(new com.commercetools.importapi.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void value() {
        ReferenceField value = ReferenceField.of();
        value.setValue(new com.commercetools.importapi.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.KeyReferenceImpl());
    }
}
