
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemPriceActionBuilder builder) {
        StagedOrderSetLineItemPriceAction stagedOrderSetLineItemPriceAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemPriceAction).isInstanceOf(StagedOrderSetLineItemPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", StagedOrderSetLineItemPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", StagedOrderSetLineItemPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalPrice", StagedOrderSetLineItemPriceAction.builder()
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
