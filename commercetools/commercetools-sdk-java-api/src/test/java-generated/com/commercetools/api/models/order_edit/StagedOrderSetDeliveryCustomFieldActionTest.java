
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
public class StagedOrderSetDeliveryCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetDeliveryCustomFieldActionBuilder builder) {
        StagedOrderSetDeliveryCustomFieldAction stagedOrderSetDeliveryCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryCustomFieldAction)
                .isInstanceOf(StagedOrderSetDeliveryCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetDeliveryCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderSetDeliveryCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderSetDeliveryCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetDeliveryCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
