
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetPurchaseOrderNumberActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetPurchaseOrderNumberActionBuilder builder) {
        StagedOrderSetPurchaseOrderNumberAction stagedOrderSetPurchaseOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetPurchaseOrderNumberAction)
                .isInstanceOf(StagedOrderSetPurchaseOrderNumberAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "purchaseOrderNumber",
                StagedOrderSetPurchaseOrderNumberAction.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        StagedOrderSetPurchaseOrderNumberAction value = StagedOrderSetPurchaseOrderNumberAction.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
