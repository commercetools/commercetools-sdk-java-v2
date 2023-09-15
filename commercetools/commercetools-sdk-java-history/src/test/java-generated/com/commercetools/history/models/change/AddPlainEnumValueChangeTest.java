
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
public class AddPlainEnumValueChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddPlainEnumValueChangeBuilder builder) {
        AddPlainEnumValueChange addPlainEnumValueChange = builder.buildUnchecked();
        Assertions.assertThat(addPlainEnumValueChange).isInstanceOf(AddPlainEnumValueChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddPlainEnumValueChange.builder().change("change") },
                new Object[] { AddPlainEnumValueChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.EnumValueImpl()) },
                new Object[] { AddPlainEnumValueChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        AddPlainEnumValueChange value = AddPlainEnumValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddPlainEnumValueChange value = AddPlainEnumValueChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.EnumValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.EnumValueImpl());
    }

    @Test
    public void attributeName() {
        AddPlainEnumValueChange value = AddPlainEnumValueChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
