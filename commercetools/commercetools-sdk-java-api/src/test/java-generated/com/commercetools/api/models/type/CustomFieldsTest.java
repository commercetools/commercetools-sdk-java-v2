
package com.commercetools.api.models.type;

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
                        CustomFields.builder().type(new com.commercetools.api.models.type.TypeReferenceImpl()) },
                new Object[] { "fields",
                        CustomFields.builder().fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        CustomFields value = CustomFields.of();
        value.setType(new com.commercetools.api.models.type.TypeReferenceImpl());
        Assertions.assertThat(value.getType()).isEqualTo(new com.commercetools.api.models.type.TypeReferenceImpl());
    }

    @Test
    public void fields() {
        CustomFields value = CustomFields.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
