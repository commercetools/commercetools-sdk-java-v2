
package com.commercetools.api.models.message;

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
public class OrderPurchaseOrderNumberSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPurchaseOrderNumberSetMessagePayloadBuilder builder) {
        OrderPurchaseOrderNumberSetMessagePayload orderPurchaseOrderNumberSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderPurchaseOrderNumberSetMessagePayload)
                .isInstanceOf(OrderPurchaseOrderNumberSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderPurchaseOrderNumberSetMessagePayload.builder()
                        .purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { OrderPurchaseOrderNumberSetMessagePayload.builder()
                        .oldPurchaseOrderNumber("oldPurchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessagePayload value = OrderPurchaseOrderNumberSetMessagePayload.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void oldPurchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessagePayload value = OrderPurchaseOrderNumberSetMessagePayload.of();
        value.setOldPurchaseOrderNumber("oldPurchaseOrderNumber");
        Assertions.assertThat(value.getOldPurchaseOrderNumber()).isEqualTo("oldPurchaseOrderNumber");
    }
}
