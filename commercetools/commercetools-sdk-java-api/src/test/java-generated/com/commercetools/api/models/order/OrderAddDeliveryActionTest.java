
package com.commercetools.api.models.order;

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
public class OrderAddDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderAddDeliveryActionBuilder builder) {
        OrderAddDeliveryAction orderAddDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddDeliveryAction).isInstanceOf(OrderAddDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderAddDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { OrderAddDeliveryAction.builder().shippingKey("shippingKey") },
                new Object[] { OrderAddDeliveryAction.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { OrderAddDeliveryAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { OrderAddDeliveryAction.builder()
                        .parcels(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl())) },
                new Object[] { OrderAddDeliveryAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void deliveryKey() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void shippingKey() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void items() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void address() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void parcels() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setParcels(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
    }

    @Test
    public void custom() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
