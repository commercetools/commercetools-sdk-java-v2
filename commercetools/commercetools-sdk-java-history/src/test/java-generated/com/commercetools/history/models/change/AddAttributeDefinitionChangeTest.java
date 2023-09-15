
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
public class AddAttributeDefinitionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddAttributeDefinitionChangeBuilder builder) {
        AddAttributeDefinitionChange addAttributeDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(addAttributeDefinitionChange).isInstanceOf(AddAttributeDefinitionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddAttributeDefinitionChange.builder().change("change") },
                new Object[] { AddAttributeDefinitionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AttributeDefinitionImpl()) } };
    }

    @Test
    public void change() {
        AddAttributeDefinitionChange value = AddAttributeDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddAttributeDefinitionChange value = AddAttributeDefinitionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AttributeDefinitionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeDefinitionImpl());
    }
}
