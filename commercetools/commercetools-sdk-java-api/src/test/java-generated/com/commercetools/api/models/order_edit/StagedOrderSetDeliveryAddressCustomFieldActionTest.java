
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
public class StagedOrderSetDeliveryAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder) {
        StagedOrderSetDeliveryAddressCustomFieldAction stagedOrderSetDeliveryAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetDeliveryAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetDeliveryAddressCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderSetDeliveryAddressCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderSetDeliveryAddressCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetDeliveryAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
