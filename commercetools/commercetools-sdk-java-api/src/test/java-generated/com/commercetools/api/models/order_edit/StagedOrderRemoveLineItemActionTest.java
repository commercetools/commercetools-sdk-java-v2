
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemoveLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemoveLineItemActionBuilder builder) {
        StagedOrderRemoveLineItemAction stagedOrderRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveLineItemAction).isInstanceOf(StagedOrderRemoveLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", StagedOrderRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", StagedOrderRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", StagedOrderRemoveLineItemAction.builder().quantity(8L) },
                new Object[] { "externalPrice",
                        StagedOrderRemoveLineItemAction.builder()
                                .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", StagedOrderRemoveLineItemAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) },
                new Object[] { "shippingDetailsToRemove",
                        StagedOrderRemoveLineItemAction.builder()
                                .shippingDetailsToRemove(
                                    new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderRemoveLineItemAction value = StagedOrderRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderRemoveLineItemAction value = StagedOrderRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        StagedOrderRemoveLineItemAction value = StagedOrderRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        StagedOrderRemoveLineItemAction value = StagedOrderRemoveLineItemAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        StagedOrderRemoveLineItemAction value = StagedOrderRemoveLineItemAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }

    @Test
    public void shippingDetailsToRemove() {
        StagedOrderRemoveLineItemAction value = StagedOrderRemoveLineItemAction.of();
        value.setShippingDetailsToRemove(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetailsToRemove())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
