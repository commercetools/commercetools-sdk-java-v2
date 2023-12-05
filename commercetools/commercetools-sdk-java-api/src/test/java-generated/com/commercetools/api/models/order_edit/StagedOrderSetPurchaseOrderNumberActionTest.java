
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
public class StagedOrderSetPurchaseOrderNumberActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetPurchaseOrderNumberActionBuilder builder) {
        StagedOrderSetPurchaseOrderNumberAction stagedOrderSetPurchaseOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetPurchaseOrderNumberAction)
                .isInstanceOf(StagedOrderSetPurchaseOrderNumberAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                StagedOrderSetPurchaseOrderNumberAction.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        StagedOrderSetPurchaseOrderNumberAction value = StagedOrderSetPurchaseOrderNumberAction.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
