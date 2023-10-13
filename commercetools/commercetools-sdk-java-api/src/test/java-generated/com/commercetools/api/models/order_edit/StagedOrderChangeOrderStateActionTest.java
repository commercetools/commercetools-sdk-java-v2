
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
public class StagedOrderChangeOrderStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderChangeOrderStateActionBuilder builder) {
        StagedOrderChangeOrderStateAction stagedOrderChangeOrderStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeOrderStateAction).isInstanceOf(StagedOrderChangeOrderStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderChangeOrderStateAction.builder()
                .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        StagedOrderChangeOrderStateAction value = StagedOrderChangeOrderStateAction.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
