
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
public class SetExpectedDeliveryChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetExpectedDeliveryChangeBuilder builder) {
        SetExpectedDeliveryChange setExpectedDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(setExpectedDeliveryChange).isInstanceOf(SetExpectedDeliveryChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetExpectedDeliveryChange.builder().change("change") },
                new Object[] { SetExpectedDeliveryChange.builder().previousValue("previousValue") },
                new Object[] { SetExpectedDeliveryChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetExpectedDeliveryChange value = SetExpectedDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetExpectedDeliveryChange value = SetExpectedDeliveryChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetExpectedDeliveryChange value = SetExpectedDeliveryChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
