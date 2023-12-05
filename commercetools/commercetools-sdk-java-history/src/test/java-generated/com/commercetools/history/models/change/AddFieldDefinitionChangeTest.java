
package com.commercetools.history.models.change;

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
public class AddFieldDefinitionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddFieldDefinitionChangeBuilder builder) {
        AddFieldDefinitionChange addFieldDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(addFieldDefinitionChange).isInstanceOf(AddFieldDefinitionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddFieldDefinitionChange.builder().change("change") },
                new Object[] { AddFieldDefinitionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.FieldDefinitionImpl()) } };
    }

    @Test
    public void change() {
        AddFieldDefinitionChange value = AddFieldDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddFieldDefinitionChange value = AddFieldDefinitionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.FieldDefinitionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.FieldDefinitionImpl());
    }
}
