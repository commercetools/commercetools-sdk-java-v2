
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
public class SetMethodInfoInterfaceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetMethodInfoInterfaceChangeBuilder builder) {
        SetMethodInfoInterfaceChange setMethodInfoInterfaceChange = builder.buildUnchecked();
        Assertions.assertThat(setMethodInfoInterfaceChange).isInstanceOf(SetMethodInfoInterfaceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetMethodInfoInterfaceChange.builder().change("change") },
                new Object[] { SetMethodInfoInterfaceChange.builder().previousValue("previousValue") },
                new Object[] { SetMethodInfoInterfaceChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMethodInfoInterfaceChange value = SetMethodInfoInterfaceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMethodInfoInterfaceChange value = SetMethodInfoInterfaceChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMethodInfoInterfaceChange value = SetMethodInfoInterfaceChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
