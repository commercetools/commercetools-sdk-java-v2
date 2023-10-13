
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
public class SetShippingRateInputChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShippingRateInputChangeBuilder builder) {
        SetShippingRateInputChange setShippingRateInputChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingRateInputChange).isInstanceOf(SetShippingRateInputChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShippingRateInputChange.builder().change("change") },
                new Object[] { SetShippingRateInputChange.builder().previousValue("previousValue") },
                new Object[] { SetShippingRateInputChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetShippingRateInputChange value = SetShippingRateInputChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingRateInputChange value = SetShippingRateInputChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetShippingRateInputChange value = SetShippingRateInputChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
