
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
public class RemoveAttributeDefinitionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveAttributeDefinitionChangeBuilder builder) {
        RemoveAttributeDefinitionChange removeAttributeDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(removeAttributeDefinitionChange).isInstanceOf(RemoveAttributeDefinitionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveAttributeDefinitionChange.builder().change("change") },
                new Object[] { RemoveAttributeDefinitionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AttributeDefinitionImpl()) } };
    }

    @Test
    public void change() {
        RemoveAttributeDefinitionChange value = RemoveAttributeDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveAttributeDefinitionChange value = RemoveAttributeDefinitionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AttributeDefinitionImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeDefinitionImpl());
    }
}
