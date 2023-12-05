
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
public class StagedOrderChangeCustomLineItemMoneyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderChangeCustomLineItemMoneyActionBuilder builder) {
        StagedOrderChangeCustomLineItemMoneyAction stagedOrderChangeCustomLineItemMoneyAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderChangeCustomLineItemMoneyAction)
                .isInstanceOf(StagedOrderChangeCustomLineItemMoneyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderChangeCustomLineItemMoneyAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        StagedOrderChangeCustomLineItemMoneyAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderChangeCustomLineItemMoneyAction.builder()
                        .money(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderChangeCustomLineItemMoneyAction value = StagedOrderChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderChangeCustomLineItemMoneyAction value = StagedOrderChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void money() {
        StagedOrderChangeCustomLineItemMoneyAction value = StagedOrderChangeCustomLineItemMoneyAction.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
