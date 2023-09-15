
package com.commercetools.history.models.change_value;

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
public class FieldDefinitionOrderValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(FieldDefinitionOrderValueBuilder builder) {
        FieldDefinitionOrderValue fieldDefinitionOrderValue = builder.buildUnchecked();
        Assertions.assertThat(fieldDefinitionOrderValue).isInstanceOf(FieldDefinitionOrderValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { FieldDefinitionOrderValue.builder().name("name") },
                new Object[] { FieldDefinitionOrderValue.builder()
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
