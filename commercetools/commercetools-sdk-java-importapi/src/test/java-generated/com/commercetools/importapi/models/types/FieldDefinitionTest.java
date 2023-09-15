
package com.commercetools.importapi.models.types;

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
                        FieldDefinition.builder().type(new com.commercetools.importapi.models.types.FieldTypeImpl()) },
                new Object[] { FieldDefinition.builder().name("name") },
                new Object[] { FieldDefinition.builder()
                        .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { FieldDefinition.builder().required(true) },
                new Object[] { FieldDefinition.builder()
                        .inputHint(
                            com.commercetools.importapi.models.types.TypeTextInputHint.findEnum("SingleLine")) } };
    }

    @Test
    public void type() {
        FieldDefinition value = FieldDefinition.of();
        value.setType(new com.commercetools.importapi.models.types.FieldTypeImpl());
        Assertions.assertThat(value.getType()).isEqualTo(new com.commercetools.importapi.models.types.FieldTypeImpl());
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
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
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
        value.setInputHint(com.commercetools.importapi.models.types.TypeTextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.importapi.models.types.TypeTextInputHint.findEnum("SingleLine"));
    }
}
