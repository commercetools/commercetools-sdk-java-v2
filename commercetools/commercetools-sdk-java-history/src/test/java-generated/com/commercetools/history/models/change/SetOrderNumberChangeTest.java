
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
public class SetOrderNumberChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetOrderNumberChangeBuilder builder) {
        SetOrderNumberChange setOrderNumberChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderNumberChange).isInstanceOf(SetOrderNumberChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetOrderNumberChange.builder().change("change") },
                new Object[] { SetOrderNumberChange.builder().previousValue("previousValue") },
                new Object[] { SetOrderNumberChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetOrderNumberChange value = SetOrderNumberChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderNumberChange value = SetOrderNumberChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetOrderNumberChange value = SetOrderNumberChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
