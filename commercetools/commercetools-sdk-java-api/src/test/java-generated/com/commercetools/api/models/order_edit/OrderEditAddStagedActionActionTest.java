
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
public class OrderEditAddStagedActionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditAddStagedActionActionBuilder builder) {
        OrderEditAddStagedActionAction orderEditAddStagedActionAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditAddStagedActionAction).isInstanceOf(OrderEditAddStagedActionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderEditAddStagedActionAction.builder()
                .stagedAction(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()) } };
    }

    @Test
    public void stagedAction() {
        OrderEditAddStagedActionAction value = OrderEditAddStagedActionAction.of();
        value.setStagedAction(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl());
        Assertions.assertThat(value.getStagedAction())
                .isEqualTo(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl());
    }
}
