
package com.commercetools.api.models.order;

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
public class OrderRemoveParcelFromDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderRemoveParcelFromDeliveryActionBuilder builder) {
        OrderRemoveParcelFromDeliveryAction orderRemoveParcelFromDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderRemoveParcelFromDeliveryAction)
                .isInstanceOf(OrderRemoveParcelFromDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderRemoveParcelFromDeliveryAction.builder().parcelId("parcelId") },
                new Object[] { OrderRemoveParcelFromDeliveryAction.builder().parcelKey("parcelKey") } };
    }

    @Test
    public void parcelId() {
        OrderRemoveParcelFromDeliveryAction value = OrderRemoveParcelFromDeliveryAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderRemoveParcelFromDeliveryAction value = OrderRemoveParcelFromDeliveryAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }
}
