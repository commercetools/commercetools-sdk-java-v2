
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
public class RemoveFieldDefinitionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveFieldDefinitionChangeBuilder builder) {
        RemoveFieldDefinitionChange removeFieldDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(removeFieldDefinitionChange).isInstanceOf(RemoveFieldDefinitionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveFieldDefinitionChange.builder().change("change") },
                new Object[] { RemoveFieldDefinitionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.FieldDefinitionImpl()) } };
    }

    @Test
    public void change() {
        RemoveFieldDefinitionChange value = RemoveFieldDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveFieldDefinitionChange value = RemoveFieldDefinitionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.FieldDefinitionImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.FieldDefinitionImpl());
    }
}
