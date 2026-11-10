
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomBuilder builder) {
        Custom custom = builder.buildUnchecked();
        Assertions.assertThat(custom).isInstanceOf(Custom.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        Custom.builder().type(new com.commercetools.importapi.models.common.TypeKeyReferenceImpl()) },
                new Object[] { "fields", Custom.builder()
                        .fields(new com.commercetools.importapi.models.customfields.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        Custom value = Custom.of();
        value.setType(new com.commercetools.importapi.models.common.TypeKeyReferenceImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.importapi.models.common.TypeKeyReferenceImpl());
    }

    @Test
    public void fields() {
        Custom value = Custom.of();
        value.setFields(new com.commercetools.importapi.models.customfields.FieldContainerImpl());
        Assertions.assertThat(value.getFields())
                .isEqualTo(new com.commercetools.importapi.models.customfields.FieldContainerImpl());
    }
}
