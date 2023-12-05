
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
public class StagedOrderSetShippingRateInputActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetShippingRateInputActionBuilder builder) {
        StagedOrderSetShippingRateInputAction stagedOrderSetShippingRateInputAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingRateInputAction)
                .isInstanceOf(StagedOrderSetShippingRateInputAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetShippingRateInputAction.builder()
                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        StagedOrderSetShippingRateInputAction value = StagedOrderSetShippingRateInputAction.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }
}
