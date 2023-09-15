
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
public class FieldDefinitionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(FieldDefinitionBuilder builder) {
        FieldDefinition fieldDefinition = builder.buildUnchecked();
        Assertions.assertThat(fieldDefinition).isInstanceOf(FieldDefinition.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        FieldDefinition.builder().type(new com.commercetools.history.models.common.FieldTypeImpl()) },
                new Object[] { FieldDefinition.builder().name("name") },
                new Object[] { FieldDefinition.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { FieldDefinition.builder()
                        .inputHint(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine")) } };
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
    public void inputHint() {
        FieldDefinition value = FieldDefinition.of();
        value.setInputHint(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
    }
}
