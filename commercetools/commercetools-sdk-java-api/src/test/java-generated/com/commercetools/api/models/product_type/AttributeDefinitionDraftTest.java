
package com.commercetools.api.models.product_type;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class AttributeDefinitionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeDefinitionDraftBuilder builder) {
        AttributeDefinitionDraft attributeDefinitionDraft = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinitionDraft).isInstanceOf(AttributeDefinitionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AttributeDefinitionDraft.builder()
                        .type(new com.commercetools.api.models.product_type.AttributeTypeImpl()) },
                new Object[] { AttributeDefinitionDraft.builder().name("name") },
                new Object[] { AttributeDefinitionDraft.builder()
                        .label(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeDefinitionDraft.builder().isRequired(true) },
                new Object[] {
                        AttributeDefinitionDraft.builder()
                                .attributeConstraint(com.commercetools.api.models.product_type.AttributeConstraintEnum
                                        .findEnum("None")) },
                new Object[] { AttributeDefinitionDraft.builder()
                        .inputTip(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeDefinitionDraft.builder()
                        .inputHint(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine")) },
                new Object[] { AttributeDefinitionDraft.builder().isSearchable(true) } };
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
