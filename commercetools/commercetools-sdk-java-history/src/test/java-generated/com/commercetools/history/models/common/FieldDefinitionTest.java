
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FieldDefinitionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FieldDefinitionBuilder builder) {
        FieldDefinition fieldDefinition = builder.buildUnchecked();
        Assertions.assertThat(fieldDefinition).isInstanceOf(FieldDefinition.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        FieldDefinition.builder().type(new com.commercetools.history.models.common.FieldTypeImpl()) },
                new Object[] { "name", FieldDefinition.builder().name("name") },
                new Object[] { "label",
                        FieldDefinition.builder()
                                .label(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "required", FieldDefinition.builder().required(true) },
                new Object[] { "inputHint", FieldDefinition.builder()
                        .inputHint(
                            com.commercetools.history.models.common.TypeTextInputHint.findEnum("SingleLine")) } };
    }

    @Test
    public void type() {
        FieldDefinition value = FieldDefinition.of();
        value.setType(new com.commercetools.history.models.common.FieldTypeImpl());
        Assertions.assertThat(value.getType()).isEqualTo(new com.commercetools.history.models.common.FieldTypeImpl());
    }

    @Test
    public void name() {
        FieldDefinition value = FieldDefinition.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void label() {
        FieldDefinition value = FieldDefinition.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void required() {
        FieldDefinition value = FieldDefinition.of();
        value.setRequired(true);
        Assertions.assertThat(value.getRequired()).isEqualTo(true);
    }

    @Test
    public void inputHint() {
        FieldDefinition value = FieldDefinition.of();
        value.setInputHint(com.commercetools.history.models.common.TypeTextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.history.models.common.TypeTextInputHint.findEnum("SingleLine"));
    }
}
