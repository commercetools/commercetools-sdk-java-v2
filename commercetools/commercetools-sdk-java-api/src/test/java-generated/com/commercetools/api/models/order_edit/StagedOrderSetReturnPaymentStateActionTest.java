
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
public class StagedOrderSetReturnPaymentStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetReturnPaymentStateActionBuilder builder) {
        StagedOrderSetReturnPaymentStateAction stagedOrderSetReturnPaymentStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnPaymentStateAction)
                .isInstanceOf(StagedOrderSetReturnPaymentStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetReturnPaymentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { StagedOrderSetReturnPaymentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { StagedOrderSetReturnPaymentStateAction.builder()
                        .paymentState(
                            com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable")) } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnPaymentStateAction value = StagedOrderSetReturnPaymentStateAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnPaymentStateAction value = StagedOrderSetReturnPaymentStateAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void paymentState() {
        StagedOrderSetReturnPaymentStateAction value = StagedOrderSetReturnPaymentStateAction.of();
        value.setPaymentState(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
    }
}
