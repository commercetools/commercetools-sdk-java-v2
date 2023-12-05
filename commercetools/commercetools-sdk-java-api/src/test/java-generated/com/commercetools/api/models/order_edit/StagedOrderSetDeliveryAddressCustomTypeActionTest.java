
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
public class StagedOrderSetDeliveryAddressCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder) {
        StagedOrderSetDeliveryAddressCustomTypeAction stagedOrderSetDeliveryAddressCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryAddressCustomTypeAction)
                .isInstanceOf(StagedOrderSetDeliveryAddressCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetDeliveryAddressCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderSetDeliveryAddressCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderSetDeliveryAddressCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetDeliveryAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
