
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
public class StagedOrderRemoveParcelFromDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderRemoveParcelFromDeliveryActionBuilder builder) {
        StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveParcelFromDeliveryAction)
                .isInstanceOf(StagedOrderRemoveParcelFromDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderRemoveParcelFromDeliveryAction.builder().parcelId("parcelId") },
                new Object[] { StagedOrderRemoveParcelFromDeliveryAction.builder().parcelKey("parcelKey") } };
    }

    @Test
    public void parcelId() {
        StagedOrderRemoveParcelFromDeliveryAction value = StagedOrderRemoveParcelFromDeliveryAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderRemoveParcelFromDeliveryAction value = StagedOrderRemoveParcelFromDeliveryAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }
}
