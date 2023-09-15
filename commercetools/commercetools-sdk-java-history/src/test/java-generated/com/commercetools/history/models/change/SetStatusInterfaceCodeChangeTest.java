
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
public class SetStatusInterfaceCodeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetStatusInterfaceCodeChangeBuilder builder) {
        SetStatusInterfaceCodeChange setStatusInterfaceCodeChange = builder.buildUnchecked();
        Assertions.assertThat(setStatusInterfaceCodeChange).isInstanceOf(SetStatusInterfaceCodeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetStatusInterfaceCodeChange.builder().change("change") },
                new Object[] { SetStatusInterfaceCodeChange.builder().previousValue("previousValue") },
                new Object[] { SetStatusInterfaceCodeChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetStatusInterfaceCodeChange value = SetStatusInterfaceCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStatusInterfaceCodeChange value = SetStatusInterfaceCodeChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetStatusInterfaceCodeChange value = SetStatusInterfaceCodeChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
