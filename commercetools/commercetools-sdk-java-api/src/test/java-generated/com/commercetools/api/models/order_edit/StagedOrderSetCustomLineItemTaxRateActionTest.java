
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
public class StagedOrderSetCustomLineItemTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomLineItemTaxRateActionBuilder builder) {
        StagedOrderSetCustomLineItemTaxRateAction stagedOrderSetCustomLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemTaxRateAction)
                .isInstanceOf(StagedOrderSetCustomLineItemTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderSetCustomLineItemTaxRateAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        StagedOrderSetCustomLineItemTaxRateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderSetCustomLineItemTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { StagedOrderSetCustomLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
