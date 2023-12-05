
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
public class StagedOrderChangeCustomLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderChangeCustomLineItemQuantityActionBuilder builder) {
        StagedOrderChangeCustomLineItemQuantityAction stagedOrderChangeCustomLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderChangeCustomLineItemQuantityAction)
                .isInstanceOf(StagedOrderChangeCustomLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderChangeCustomLineItemQuantityAction.builder().customLineItemId("customLineItemId") },
                new Object[] { StagedOrderChangeCustomLineItemQuantityAction.builder()
                        .customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderChangeCustomLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderChangeCustomLineItemQuantityAction value = StagedOrderChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderChangeCustomLineItemQuantityAction value = StagedOrderChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        StagedOrderChangeCustomLineItemQuantityAction value = StagedOrderChangeCustomLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
