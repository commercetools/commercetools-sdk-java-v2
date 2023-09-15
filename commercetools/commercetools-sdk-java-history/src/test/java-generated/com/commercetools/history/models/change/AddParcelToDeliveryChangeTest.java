
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
public class AddParcelToDeliveryChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddParcelToDeliveryChangeBuilder builder) {
        AddParcelToDeliveryChange addParcelToDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(addParcelToDeliveryChange).isInstanceOf(AddParcelToDeliveryChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddParcelToDeliveryChange.builder().change("change") },
                new Object[] { AddParcelToDeliveryChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ParcelImpl()) },
                new Object[] { AddParcelToDeliveryChange.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void change() {
        AddParcelToDeliveryChange value = AddParcelToDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddParcelToDeliveryChange value = AddParcelToDeliveryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ParcelImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.ParcelImpl());
    }

    @Test
    public void deliveryId() {
        AddParcelToDeliveryChange value = AddParcelToDeliveryChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
