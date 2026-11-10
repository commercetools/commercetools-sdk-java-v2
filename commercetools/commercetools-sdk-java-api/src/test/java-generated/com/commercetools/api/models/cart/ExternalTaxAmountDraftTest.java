
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalTaxAmountDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExternalTaxAmountDraftBuilder builder) {
        ExternalTaxAmountDraft externalTaxAmountDraft = builder.buildUnchecked();
        Assertions.assertThat(externalTaxAmountDraft).isInstanceOf(ExternalTaxAmountDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalGross",
                        ExternalTaxAmountDraft.builder()
                                .totalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "taxRate", ExternalTaxAmountDraft.builder()
                        .taxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void totalGross() {
        ExternalTaxAmountDraft value = ExternalTaxAmountDraft.of();
        value.setTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalGross()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void taxRate() {
        ExternalTaxAmountDraft value = ExternalTaxAmountDraft.of();
        value.setTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
