
package com.commercetools.api.models.order_edit;

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
public class StagedOrderRemoveDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderRemoveDeliveryActionBuilder builder) {
        StagedOrderRemoveDeliveryAction stagedOrderRemoveDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveDeliveryAction).isInstanceOf(StagedOrderRemoveDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderRemoveDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderRemoveDeliveryAction.builder().deliveryKey("deliveryKey") } };
    }

    @Test
    public void deliveryId() {
        StagedOrderRemoveDeliveryAction value = StagedOrderRemoveDeliveryAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderRemoveDeliveryAction value = StagedOrderRemoveDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }
}
