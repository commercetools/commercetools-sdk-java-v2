
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
public class AddEnumValueChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddEnumValueChangeBuilder builder) {
        AddEnumValueChange addEnumValueChange = builder.buildUnchecked();
        Assertions.assertThat(addEnumValueChange).isInstanceOf(AddEnumValueChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddEnumValueChange.builder().change("change") },
                new Object[] { AddEnumValueChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.EnumValueImpl()) },
                new Object[] { AddEnumValueChange.builder().fieldName("fieldName") } };
    }

    @Test
    public void change() {
        AddEnumValueChange value = AddEnumValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddEnumValueChange value = AddEnumValueChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.EnumValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.EnumValueImpl());
    }

    @Test
    public void fieldName() {
        AddEnumValueChange value = AddEnumValueChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }
}
