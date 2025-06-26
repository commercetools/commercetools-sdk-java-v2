
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeDefinitionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeDefinitionDraftBuilder builder) {
        AttributeDefinitionDraft attributeDefinitionDraft = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinitionDraft).isInstanceOf(AttributeDefinitionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        AttributeDefinitionDraft.builder()
                                .type(new com.commercetools.api.models.product_type.AttributeTypeImpl()) },
                new Object[] { "name", AttributeDefinitionDraft.builder().name("name") },
                new Object[] { "label",
                        AttributeDefinitionDraft.builder()
                                .label(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "isRequired", AttributeDefinitionDraft.builder().isRequired(true) },
                new Object[] { "level", AttributeDefinitionDraft.builder()
                        .level(com.commercetools.api.models.product_type.AttributeLevelEnum.findEnum("Product")) },
                new Object[] { "attributeConstraint",
                        AttributeDefinitionDraft.builder()
                                .attributeConstraint(com.commercetools.api.models.product_type.AttributeConstraintEnum
                                        .findEnum("None")) },
                new Object[] { "inputTip",
                        AttributeDefinitionDraft.builder()
                                .inputTip(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "inputHint", AttributeDefinitionDraft.builder()
                        .inputHint(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine")) },
                new Object[] { "isSearchable", AttributeDefinitionDraft.builder().isSearchable(true) } };
    }

    @Test
    public void type() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setType(new com.commercetools.api.models.product_type.AttributeTypeImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeTypeImpl());
    }

    @Test
    public void name() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void label() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void isRequired() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setIsRequired(true);
        Assertions.assertThat(value.getIsRequired()).isEqualTo(true);
    }

    @Test
    public void level() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setLevel(com.commercetools.api.models.product_type.AttributeLevelEnum.findEnum("Product"));
        Assertions.assertThat(value.getLevel())
                .isEqualTo(com.commercetools.api.models.product_type.AttributeLevelEnum.findEnum("Product"));
    }

    @Test
    public void attributeConstraint() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setAttributeConstraint(
            com.commercetools.api.models.product_type.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getAttributeConstraint())
                .isEqualTo(com.commercetools.api.models.product_type.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void inputTip() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setInputTip(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getInputTip())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void inputHint() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setInputHint(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void isSearchable() {
        AttributeDefinitionDraft value = AttributeDefinitionDraft.of();
        value.setIsSearchable(true);
        Assertions.assertThat(value.getIsSearchable()).isEqualTo(true);
    }
}
