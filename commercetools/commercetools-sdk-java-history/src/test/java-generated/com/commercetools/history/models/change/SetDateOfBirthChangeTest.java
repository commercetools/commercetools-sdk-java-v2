
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
public class SetDateOfBirthChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetDateOfBirthChangeBuilder builder) {
        SetDateOfBirthChange setDateOfBirthChange = builder.buildUnchecked();
        Assertions.assertThat(setDateOfBirthChange).isInstanceOf(SetDateOfBirthChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetDateOfBirthChange.builder().change("change") },
                new Object[] { SetDateOfBirthChange.builder().previousValue("previousValue") },
                new Object[] { SetDateOfBirthChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetDateOfBirthChange value = SetDateOfBirthChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDateOfBirthChange value = SetDateOfBirthChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetDateOfBirthChange value = SetDateOfBirthChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
