
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
public class OrderSetPurchaseOrderNumberActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetPurchaseOrderNumberActionBuilder builder) {
        OrderSetPurchaseOrderNumberAction orderSetPurchaseOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetPurchaseOrderNumberAction).isInstanceOf(OrderSetPurchaseOrderNumberAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                OrderSetPurchaseOrderNumberAction.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        OrderSetPurchaseOrderNumberAction value = OrderSetPurchaseOrderNumberAction.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
