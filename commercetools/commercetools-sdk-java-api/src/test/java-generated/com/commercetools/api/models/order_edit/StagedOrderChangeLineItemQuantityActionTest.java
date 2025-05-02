
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeLineItemQuantityActionBuilder builder) {
        StagedOrderChangeLineItemQuantityAction stagedOrderChangeLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeLineItemQuantityAction)
                .isInstanceOf(StagedOrderChangeLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        StagedOrderChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", StagedOrderChangeLineItemQuantityAction.builder().quantity(8L) },
                new Object[] { "externalPrice",
                        StagedOrderChangeLineItemQuantityAction.builder()
                                .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", StagedOrderChangeLineItemQuantityAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderChangeLineItemQuantityAction value = StagedOrderChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderChangeLineItemQuantityAction value = StagedOrderChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        StagedOrderChangeLineItemQuantityAction value = StagedOrderChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        StagedOrderChangeLineItemQuantityAction value = StagedOrderChangeLineItemQuantityAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        StagedOrderChangeLineItemQuantityAction value = StagedOrderChangeLineItemQuantityAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }
}
