
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
public class StagedOrderSetLineItemTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetLineItemTaxRateActionBuilder builder) {
        StagedOrderSetLineItemTaxRateAction stagedOrderSetLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemTaxRateAction)
                .isInstanceOf(StagedOrderSetLineItemTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetLineItemTaxRateAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderSetLineItemTaxRateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderSetLineItemTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { StagedOrderSetLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
