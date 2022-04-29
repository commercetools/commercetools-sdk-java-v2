
package com.commercetools;

import java.util.Locale;

import com.commercetools.api.models.common.*;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.*;

import org.assertj.core.api.Assertions;
import org.javamoney.moneta.FastMoney;
import org.junit.jupiter.api.Test;

public class OrderEditTest {
    @Test
    public void testOrderEdit() {
        OrderEditUpdate update = OrderEditUpdate.builder()
                .version(1L)
                .actions(OrderEditAddStagedActionAction.builder()
                        .stagedAction(StagedOrderAddCustomLineItemActionBuilder.of()
                                .name(LocalizedString.of(Locale.ENGLISH, "foo"))
                                .slug("foo")
                                .money(CentPrecisionMoneyDraftBuilder.of().centAmount(100L).currencyCode("EUR").build())
                                .quantity(1L)
                                .build())
                        .build())
                .plusActions(OrderEditAddStagedActionAction.builder()
                        .stagedAction(StagedOrderAddLineItemActionBuilder.of().sku("abc").quantity(1L).build())
                        .build())
                .build();
        Assertions.assertThat(update.getActions()).hasSize(2);
        Assertions.assertThat(update.getActions().get(0)).isInstanceOf(OrderEditAddStagedActionAction.class);
    }

    @Test
    public void testOrderEditActionLambda() {
        OrderEditUpdate update = OrderEditUpdate.builder()
                .version(1L)
                .withActions(actionBuilder -> actionBuilder.addStagedActionBuilder()
                        .stagedAction(stagedActionBuilder -> stagedActionBuilder.addCustomLineItemBuilder()
                                .name(LocalizedString.of(Locale.ENGLISH, "foo"))
                                .slug("foo")
                                .money(CentPrecisionMoneyDraftBuilder.of().centAmount(100L).currencyCode("EUR").build())
                                .quantity(1L)))
                .plusActions(actionBuilder -> actionBuilder.addStagedActionBuilder()
                        .stagedAction(
                            stagedActionBuilder -> stagedActionBuilder.addLineItemBuilder().sku("abc").quantity(1L)))
                .build();
        Assertions.assertThat(update.getActions()).hasSize(2);
        Assertions.assertThat(update.getActions().get(0)).isInstanceOf(OrderEditAddStagedActionAction.class);
    }

    @Test
    public void testOrderEditActionBuilder() {
        OrderEditUpdate update = OrderEditUpdate.builder()
                .version(1L)
                .actions(OrderEditUpdateAction.addStagedActionBuilder()
                        .stagedAction(StagedOrderUpdateAction.addCustomLineItemBuilder()
                                .name(LocalizedString.of(Locale.ENGLISH, "foo"))
                                .slug("foo")
                                .money(CentPrecisionMoneyDraftBuilder.of().centAmount(100L).currencyCode("EUR").build())
                                .quantity(1L)
                                .build())
                        .build())
                .plusActions(OrderEditUpdateAction.addStagedActionBuilder()
                        .stagedAction(StagedOrderAddLineItemActionBuilder.of().sku("abc").quantity(1L).build())
                        .build())
                .build();
        Assertions.assertThat(update.getActions()).hasSize(2);
        Assertions.assertThat(update.getActions().get(0)).isInstanceOf(OrderEditAddStagedActionAction.class);
    }

    @Test
    public void testOrderEditMoneyUtil() {
        OrderEditUpdate update = OrderEditUpdate.builder()
                .version(1L)
                .actions(OrderEditUpdateAction.addStagedActionBuilder()
                        .stagedAction(StagedOrderUpdateAction.addCustomLineItemBuilder()
                                .name(LocalizedString.of(Locale.ENGLISH, "foo"))
                                .slug("foo")
                                .money(MoneyUtil.of(FastMoney.of(100.3, "USD")))
                                .quantity(1L)
                                .build())
                        .build())
                .plusActions(OrderEditUpdateAction.addStagedActionBuilder()
                        .stagedAction(StagedOrderAddLineItemActionBuilder.of().sku("abc").quantity(1L).build())
                        .build())
                .build();
        Assertions.assertThat(update.getActions()).hasSize(2);
        Assertions.assertThat(update.getActions().get(0)).isInstanceOf(OrderEditAddStagedActionAction.class);
    }
}
