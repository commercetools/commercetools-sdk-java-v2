
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FieldDefinitionOrderValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FieldDefinitionOrderValueBuilder builder) {
        FieldDefinitionOrderValue fieldDefinitionOrderValue = builder.buildUnchecked();
        Assertions.assertThat(fieldDefinitionOrderValue).isInstanceOf(FieldDefinitionOrderValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", FieldDefinitionOrderValue.builder().name("name") },
                new Object[] { "label", FieldDefinitionOrderValue.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        FieldDefinitionOrderValue value = FieldDefinitionOrderValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void label() {
        FieldDefinitionOrderValue value = FieldDefinitionOrderValue.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
