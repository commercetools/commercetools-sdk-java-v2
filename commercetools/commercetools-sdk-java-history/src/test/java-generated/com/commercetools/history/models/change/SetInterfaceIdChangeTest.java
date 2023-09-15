
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
public class SetInterfaceIdChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetInterfaceIdChangeBuilder builder) {
        SetInterfaceIdChange setInterfaceIdChange = builder.buildUnchecked();
        Assertions.assertThat(setInterfaceIdChange).isInstanceOf(SetInterfaceIdChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetInterfaceIdChange.builder().change("change") },
                new Object[] { SetInterfaceIdChange.builder().previousValue("previousValue") },
                new Object[] { SetInterfaceIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetInterfaceIdChange value = SetInterfaceIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetInterfaceIdChange value = SetInterfaceIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetInterfaceIdChange value = SetInterfaceIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
