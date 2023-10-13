
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
public class StagedOrderSetLineItemTaxAmountActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetLineItemTaxAmountActionBuilder builder) {
        StagedOrderSetLineItemTaxAmountAction stagedOrderSetLineItemTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemTaxAmountAction)
                .isInstanceOf(StagedOrderSetLineItemTaxAmountAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetLineItemTaxAmountAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderSetLineItemTaxAmountAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderSetLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { StagedOrderSetLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
