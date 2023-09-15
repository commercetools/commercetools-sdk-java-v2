
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
public class StagedOrderSetLineItemTotalPriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetLineItemTotalPriceActionBuilder builder) {
        StagedOrderSetLineItemTotalPriceAction stagedOrderSetLineItemTotalPriceAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemTotalPriceAction)
                .isInstanceOf(StagedOrderSetLineItemTotalPriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetLineItemTotalPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderSetLineItemTotalPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderSetLineItemTotalPriceAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemTotalPriceAction value = StagedOrderSetLineItemTotalPriceAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemTotalPriceAction value = StagedOrderSetLineItemTotalPriceAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTotalPrice() {
        StagedOrderSetLineItemTotalPriceAction value = StagedOrderSetLineItemTotalPriceAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }
}
