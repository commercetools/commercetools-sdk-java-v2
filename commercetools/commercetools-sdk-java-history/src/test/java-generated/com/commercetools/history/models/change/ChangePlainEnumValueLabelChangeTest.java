
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
public class ChangePlainEnumValueLabelChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangePlainEnumValueLabelChangeBuilder builder) {
        ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changePlainEnumValueLabelChange).isInstanceOf(ChangePlainEnumValueLabelChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangePlainEnumValueLabelChange.builder().change("change") },
                new Object[] { ChangePlainEnumValueLabelChange.builder().previousValue("previousValue") },
                new Object[] { ChangePlainEnumValueLabelChange.builder().nextValue("nextValue") },
                new Object[] { ChangePlainEnumValueLabelChange.builder().attributeName("attributeName") },
                new Object[] { ChangePlainEnumValueLabelChange.builder().valueKey("valueKey") } };
    }

    @Test
    public void change() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void attributeName() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void valueKey() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setValueKey("valueKey");
        Assertions.assertThat(value.getValueKey()).isEqualTo("valueKey");
    }
}
