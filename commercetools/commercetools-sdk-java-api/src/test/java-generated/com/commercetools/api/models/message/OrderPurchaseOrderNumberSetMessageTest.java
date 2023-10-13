
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
public class OrderPurchaseOrderNumberSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPurchaseOrderNumberSetMessageBuilder builder) {
        OrderPurchaseOrderNumberSetMessage orderPurchaseOrderNumberSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPurchaseOrderNumberSetMessage)
                .isInstanceOf(OrderPurchaseOrderNumberSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        OrderPurchaseOrderNumberSetMessage.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { OrderPurchaseOrderNumberSetMessage.builder()
                        .oldPurchaseOrderNumber("oldPurchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessage value = OrderPurchaseOrderNumberSetMessage.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void oldPurchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessage value = OrderPurchaseOrderNumberSetMessage.of();
        value.setOldPurchaseOrderNumber("oldPurchaseOrderNumber");
        Assertions.assertThat(value.getOldPurchaseOrderNumber()).isEqualTo("oldPurchaseOrderNumber");
    }
}
