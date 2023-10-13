
package com.commercetools.api.models.order_edit;

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
public class OrderEditSetStagedActionsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditSetStagedActionsActionBuilder builder) {
        OrderEditSetStagedActionsAction orderEditSetStagedActionsAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditSetStagedActionsAction).isInstanceOf(OrderEditSetStagedActionsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderEditSetStagedActionsAction.builder()
                .stagedActions(Collections
                        .singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl())) } };
    }

    @Test
    public void stagedActions() {
        OrderEditSetStagedActionsAction value = OrderEditSetStagedActionsAction.of();
        value.setStagedActions(
            Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
        Assertions.assertThat(value.getStagedActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
    }
}
