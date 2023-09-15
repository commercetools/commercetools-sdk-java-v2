
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
public class SetReturnShipmentStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetReturnShipmentStateChangeBuilder builder) {
        SetReturnShipmentStateChange setReturnShipmentStateChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnShipmentStateChange).isInstanceOf(SetReturnShipmentStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetReturnShipmentStateChange.builder().change("change") },
                new Object[] { SetReturnShipmentStateChange.builder()
                        .previousValue(
                            com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised")) },
                new Object[] { SetReturnShipmentStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised")) } };
    }

    @Test
    public void change() {
        SetReturnShipmentStateChange value = SetReturnShipmentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetReturnShipmentStateChange value = SetReturnShipmentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
    }

    @Test
    public void nextValue() {
        SetReturnShipmentStateChange value = SetReturnShipmentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
    }
}
