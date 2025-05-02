
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCartTotalTaxActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCartTotalTaxActionBuilder builder) {
        CartSetCartTotalTaxAction cartSetCartTotalTaxAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCartTotalTaxAction).isInstanceOf(CartSetCartTotalTaxAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalTotalGross",
                        CartSetCartTotalTaxAction.builder()
                                .externalTotalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTaxPortions", CartSetCartTotalTaxAction.builder()
                        .externalTaxPortions(
                            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl())) } };
    }

    @Test
    public void externalTotalGross() {
        CartSetCartTotalTaxAction value = CartSetCartTotalTaxAction.of();
        value.setExternalTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalTotalGross())
                .isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTaxPortions() {
        CartSetCartTotalTaxAction value = CartSetCartTotalTaxAction.of();
        value.setExternalTaxPortions(
            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
        Assertions.assertThat(value.getExternalTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
    }
}
