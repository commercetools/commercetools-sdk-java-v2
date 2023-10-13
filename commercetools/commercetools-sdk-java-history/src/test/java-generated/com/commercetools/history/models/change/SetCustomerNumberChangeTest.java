
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
public class SetCustomerNumberChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomerNumberChangeBuilder builder) {
        SetCustomerNumberChange setCustomerNumberChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomerNumberChange).isInstanceOf(SetCustomerNumberChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomerNumberChange.builder().change("change") },
                new Object[] { SetCustomerNumberChange.builder().previousValue("previousValue") },
                new Object[] { SetCustomerNumberChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCustomerNumberChange value = SetCustomerNumberChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomerNumberChange value = SetCustomerNumberChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomerNumberChange value = SetCustomerNumberChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
