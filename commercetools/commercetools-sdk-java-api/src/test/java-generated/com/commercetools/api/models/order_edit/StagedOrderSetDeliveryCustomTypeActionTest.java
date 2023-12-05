
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
public class StagedOrderSetDeliveryCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetDeliveryCustomTypeActionBuilder builder) {
        StagedOrderSetDeliveryCustomTypeAction stagedOrderSetDeliveryCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryCustomTypeAction)
                .isInstanceOf(StagedOrderSetDeliveryCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetDeliveryCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderSetDeliveryCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderSetDeliveryCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetDeliveryCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
