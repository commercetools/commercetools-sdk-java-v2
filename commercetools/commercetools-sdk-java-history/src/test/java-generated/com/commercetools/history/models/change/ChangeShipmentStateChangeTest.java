
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
public class ChangeShipmentStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeShipmentStateChangeBuilder builder) {
        ChangeShipmentStateChange changeShipmentStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeShipmentStateChange).isInstanceOf(ChangeShipmentStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeShipmentStateChange.builder().change("change") },
                new Object[] { ChangeShipmentStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped")) },
                new Object[] { ChangeShipmentStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped")) } };
    }

    @Test
    public void change() {
        ChangeShipmentStateChange value = ChangeShipmentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeShipmentStateChange value = ChangeShipmentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void nextValue() {
        ChangeShipmentStateChange value = ChangeShipmentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
    }
}
