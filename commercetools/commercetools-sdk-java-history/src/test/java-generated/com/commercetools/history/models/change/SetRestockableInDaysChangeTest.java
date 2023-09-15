
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
public class SetRestockableInDaysChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetRestockableInDaysChangeBuilder builder) {
        SetRestockableInDaysChange setRestockableInDaysChange = builder.buildUnchecked();
        Assertions.assertThat(setRestockableInDaysChange).isInstanceOf(SetRestockableInDaysChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetRestockableInDaysChange.builder().change("change") },
                new Object[] { SetRestockableInDaysChange.builder().previousValue(8) },
                new Object[] { SetRestockableInDaysChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetRestockableInDaysChange value = SetRestockableInDaysChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetRestockableInDaysChange value = SetRestockableInDaysChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetRestockableInDaysChange value = SetRestockableInDaysChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
