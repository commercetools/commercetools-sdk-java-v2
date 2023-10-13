
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
public class StagedOrderSetShippingMethodTaxAmountActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetShippingMethodTaxAmountActionBuilder builder) {
        StagedOrderSetShippingMethodTaxAmountAction stagedOrderSetShippingMethodTaxAmountAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingMethodTaxAmountAction)
                .isInstanceOf(StagedOrderSetShippingMethodTaxAmountAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetShippingMethodTaxAmountAction.builder().shippingKey("shippingKey") },
                new Object[] { StagedOrderSetShippingMethodTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        StagedOrderSetShippingMethodTaxAmountAction value = StagedOrderSetShippingMethodTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxAmount() {
        StagedOrderSetShippingMethodTaxAmountAction value = StagedOrderSetShippingMethodTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }
}
