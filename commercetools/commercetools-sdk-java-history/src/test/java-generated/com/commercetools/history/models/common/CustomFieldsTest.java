
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldsBuilder builder) {
        CustomFields customFields = builder.buildUnchecked();
        Assertions.assertThat(customFields).isInstanceOf(CustomFields.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        CustomFields.builder().type(new com.commercetools.history.models.common.TypeReferenceImpl()) },
                new Object[] { "fields", CustomFields.builder()
                        .fields(new com.commercetools.history.models.common.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        CustomFields value = CustomFields.of();
        value.setType(new com.commercetools.history.models.common.TypeReferenceImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.history.models.common.TypeReferenceImpl());
    }

    @Test
    public void fields() {
        CustomFields value = CustomFields.of();
        value.setFields(new com.commercetools.history.models.common.FieldContainerImpl());
        Assertions.assertThat(value.getFields())
                .isEqualTo(new com.commercetools.history.models.common.FieldContainerImpl());
    }
}
