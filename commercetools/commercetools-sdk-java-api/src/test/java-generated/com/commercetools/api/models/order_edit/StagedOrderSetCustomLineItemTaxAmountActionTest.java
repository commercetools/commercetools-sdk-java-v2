
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
public class StagedOrderSetCustomLineItemTaxAmountActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomLineItemTaxAmountActionBuilder builder) {
        StagedOrderSetCustomLineItemTaxAmountAction stagedOrderSetCustomLineItemTaxAmountAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemTaxAmountAction)
                .isInstanceOf(StagedOrderSetCustomLineItemTaxAmountAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderSetCustomLineItemTaxAmountAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        StagedOrderSetCustomLineItemTaxAmountAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderSetCustomLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { StagedOrderSetCustomLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
