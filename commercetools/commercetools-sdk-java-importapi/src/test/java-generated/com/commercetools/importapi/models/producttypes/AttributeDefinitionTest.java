
package com.commercetools.importapi.models.producttypes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeDefinitionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeDefinitionBuilder builder) {
        AttributeDefinition attributeDefinition = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinition).isInstanceOf(AttributeDefinition.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        AttributeDefinition.builder()
                                .type(new com.commercetools.importapi.models.producttypes.AttributeTypeImpl()) },
                new Object[] { "name", AttributeDefinition.builder().name("name") },
                new Object[] { "label",
                        AttributeDefinition.builder()
                                .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "isRequired", AttributeDefinition.builder().isRequired(true) },
                new Object[] { "attributeConstraint", AttributeDefinition.builder()
                        .attributeConstraint(
                            com.commercetools.importapi.models.producttypes.AttributeConstraintEnum.findEnum("None")) },
                new Object[] { "inputTip",
                        AttributeDefinition.builder()
                                .inputTip(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "inputHint",
                        AttributeDefinition.builder()
                                .inputHint(com.commercetools.importapi.models.producttypes.TextInputHint
                                        .findEnum("SingleLine")) },
                new Object[] { "isSearchable", AttributeDefinition.builder().isSearchable(true) },
                new Object[] { "level", AttributeDefinition.builder()
                        .level(com.commercetools.importapi.models.producttypes.AttributeLevel.findEnum("Variant")) } };
    }

    @Test
    public void type() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setType(new com.commercetools.importapi.models.producttypes.AttributeTypeImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.importapi.models.producttypes.AttributeTypeImpl());
    }

    @Test
    public void name() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void label() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void isRequired() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setIsRequired(true);
        Assertions.assertThat(value.getIsRequired()).isEqualTo(true);
    }

    @Test
    public void attributeConstraint() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setAttributeConstraint(
            com.commercetools.importapi.models.producttypes.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getAttributeConstraint())
                .isEqualTo(com.commercetools.importapi.models.producttypes.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void inputTip() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setInputTip(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getInputTip())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void inputHint() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setInputHint(com.commercetools.importapi.models.producttypes.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.importapi.models.producttypes.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void isSearchable() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setIsSearchable(true);
        Assertions.assertThat(value.getIsSearchable()).isEqualTo(true);
    }

    @Test
    public void level() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setLevel(com.commercetools.importapi.models.producttypes.AttributeLevel.findEnum("Variant"));
        Assertions.assertThat(value.getLevel())
                .isEqualTo(com.commercetools.importapi.models.producttypes.AttributeLevel.findEnum("Variant"));
    }
}
