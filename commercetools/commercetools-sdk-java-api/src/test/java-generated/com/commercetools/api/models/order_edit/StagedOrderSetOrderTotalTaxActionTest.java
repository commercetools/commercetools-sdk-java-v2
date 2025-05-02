
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetOrderTotalTaxActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetOrderTotalTaxActionBuilder builder) {
        StagedOrderSetOrderTotalTaxAction stagedOrderSetOrderTotalTaxAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetOrderTotalTaxAction).isInstanceOf(StagedOrderSetOrderTotalTaxAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalTotalGross",
                        StagedOrderSetOrderTotalTaxAction.builder()
                                .externalTotalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTaxPortions", StagedOrderSetOrderTotalTaxAction.builder()
                        .externalTaxPortions(
                            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl())) } };
    }

    @Test
    public void externalTotalGross() {
        StagedOrderSetOrderTotalTaxAction value = StagedOrderSetOrderTotalTaxAction.of();
        value.setExternalTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalTotalGross())
                .isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTaxPortions() {
        StagedOrderSetOrderTotalTaxAction value = StagedOrderSetOrderTotalTaxAction.of();
        value.setExternalTaxPortions(
            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
        Assertions.assertThat(value.getExternalTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
    }
}
