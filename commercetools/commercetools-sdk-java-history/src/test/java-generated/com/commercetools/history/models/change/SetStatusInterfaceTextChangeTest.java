
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
public class SetStatusInterfaceTextChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetStatusInterfaceTextChangeBuilder builder) {
        SetStatusInterfaceTextChange setStatusInterfaceTextChange = builder.buildUnchecked();
        Assertions.assertThat(setStatusInterfaceTextChange).isInstanceOf(SetStatusInterfaceTextChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetStatusInterfaceTextChange.builder().change("change") },
                new Object[] { SetStatusInterfaceTextChange.builder().previousValue("previousValue") },
                new Object[] { SetStatusInterfaceTextChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetStatusInterfaceTextChange value = SetStatusInterfaceTextChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStatusInterfaceTextChange value = SetStatusInterfaceTextChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetStatusInterfaceTextChange value = SetStatusInterfaceTextChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
