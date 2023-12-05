
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
public class ChangeEnumValueLabelChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeEnumValueLabelChangeBuilder builder) {
        ChangeEnumValueLabelChange changeEnumValueLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changeEnumValueLabelChange).isInstanceOf(ChangeEnumValueLabelChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeEnumValueLabelChange.builder().change("change") },
                new Object[] { ChangeEnumValueLabelChange.builder().previousValue("previousValue") },
                new Object[] { ChangeEnumValueLabelChange.builder().nextValue("nextValue") },
                new Object[] { ChangeEnumValueLabelChange.builder().fieldName("fieldName") },
                new Object[] { ChangeEnumValueLabelChange.builder().valueKey("valueKey") } };
    }

    @Test
    public void change() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void fieldName() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void valueKey() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setValueKey("valueKey");
        Assertions.assertThat(value.getValueKey()).isEqualTo("valueKey");
    }
}
