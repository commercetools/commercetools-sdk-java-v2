
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
public class StagedOrderSetLineItemPriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetLineItemPriceActionBuilder builder) {
        StagedOrderSetLineItemPriceAction stagedOrderSetLineItemPriceAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemPriceAction).isInstanceOf(StagedOrderSetLineItemPriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetLineItemPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderSetLineItemPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderSetLineItemPriceAction.builder()
                        .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemPriceAction value = StagedOrderSetLineItemPriceAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemPriceAction value = StagedOrderSetLineItemPriceAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalPrice() {
        StagedOrderSetLineItemPriceAction value = StagedOrderSetLineItemPriceAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
