
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
public class SetMaxApplicationsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetMaxApplicationsChangeBuilder builder) {
        SetMaxApplicationsChange setMaxApplicationsChange = builder.buildUnchecked();
        Assertions.assertThat(setMaxApplicationsChange).isInstanceOf(SetMaxApplicationsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetMaxApplicationsChange.builder().change("change") },
                new Object[] { SetMaxApplicationsChange.builder().previousValue(8) },
                new Object[] { SetMaxApplicationsChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetMaxApplicationsChange value = SetMaxApplicationsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMaxApplicationsChange value = SetMaxApplicationsChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetMaxApplicationsChange value = SetMaxApplicationsChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
