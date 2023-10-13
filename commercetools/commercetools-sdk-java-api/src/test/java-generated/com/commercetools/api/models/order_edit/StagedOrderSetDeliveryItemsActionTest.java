
package com.commercetools.api.models.order_edit;

import java.util.Collections;

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
public class StagedOrderSetDeliveryItemsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetDeliveryItemsActionBuilder builder) {
        StagedOrderSetDeliveryItemsAction stagedOrderSetDeliveryItemsAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryItemsAction).isInstanceOf(StagedOrderSetDeliveryItemsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetDeliveryItemsAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderSetDeliveryItemsAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderSetDeliveryItemsAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryItemsAction value = StagedOrderSetDeliveryItemsAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryItemsAction value = StagedOrderSetDeliveryItemsAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void items() {
        StagedOrderSetDeliveryItemsAction value = StagedOrderSetDeliveryItemsAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }
}
