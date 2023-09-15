
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
public class SetMethodInfoMethodChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetMethodInfoMethodChangeBuilder builder) {
        SetMethodInfoMethodChange setMethodInfoMethodChange = builder.buildUnchecked();
        Assertions.assertThat(setMethodInfoMethodChange).isInstanceOf(SetMethodInfoMethodChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetMethodInfoMethodChange.builder().change("change") },
                new Object[] { SetMethodInfoMethodChange.builder().previousValue("previousValue") },
                new Object[] { SetMethodInfoMethodChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMethodInfoMethodChange value = SetMethodInfoMethodChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMethodInfoMethodChange value = SetMethodInfoMethodChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMethodInfoMethodChange value = SetMethodInfoMethodChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
