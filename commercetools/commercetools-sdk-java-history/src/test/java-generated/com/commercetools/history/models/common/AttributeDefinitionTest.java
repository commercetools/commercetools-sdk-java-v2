
package com.commercetools.history.models.common;

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
public class AttributeDefinitionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeDefinitionBuilder builder) {
        AttributeDefinition attributeDefinition = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinition).isInstanceOf(AttributeDefinition.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AttributeDefinition.builder()
                        .type(new com.commercetools.history.models.common.AttributeTypeImpl()) },
                new Object[] { AttributeDefinition.builder().name("name") },
                new Object[] { AttributeDefinition.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeDefinition.builder().isRequired(true) },
                new Object[] { AttributeDefinition.builder()
                        .attributeConstraint(
                            com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None")) },
                new Object[] { AttributeDefinition.builder()
                        .inputTip(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeDefinition.builder()
                        .inputHint(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine")) },
                new Object[] { AttributeDefinition.builder().isSearchable(true) } };
    }

    @Test
    public void type() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setType(new com.commercetools.history.models.common.AttributeTypeImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.history.models.common.AttributeTypeImpl());
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
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
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
        value.setAttributeConstraint(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getAttributeConstraint())
                .isEqualTo(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void inputTip() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setInputTip(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getInputTip())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void inputHint() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setInputHint(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void isSearchable() {
        AttributeDefinition value = AttributeDefinition.of();
        value.setIsSearchable(true);
        Assertions.assertThat(value.getIsSearchable()).isEqualTo(true);
    }
}
