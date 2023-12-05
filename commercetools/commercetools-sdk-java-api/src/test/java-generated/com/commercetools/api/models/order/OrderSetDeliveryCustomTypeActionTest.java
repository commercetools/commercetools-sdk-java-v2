
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
public class OrderSetDeliveryCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetDeliveryCustomTypeActionBuilder builder) {
        OrderSetDeliveryCustomTypeAction orderSetDeliveryCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryCustomTypeAction).isInstanceOf(OrderSetDeliveryCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetDeliveryCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { OrderSetDeliveryCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { OrderSetDeliveryCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { OrderSetDeliveryCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
