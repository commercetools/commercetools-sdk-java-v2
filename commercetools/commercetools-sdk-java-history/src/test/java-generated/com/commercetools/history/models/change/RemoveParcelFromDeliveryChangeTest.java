
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
public class RemoveParcelFromDeliveryChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveParcelFromDeliveryChangeBuilder builder) {
        RemoveParcelFromDeliveryChange removeParcelFromDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(removeParcelFromDeliveryChange).isInstanceOf(RemoveParcelFromDeliveryChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveParcelFromDeliveryChange.builder().change("change") },
                new Object[] { RemoveParcelFromDeliveryChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ParcelImpl()) },
                new Object[] { RemoveParcelFromDeliveryChange.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void change() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ParcelImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ParcelImpl());
    }

    @Test
    public void deliveryId() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
