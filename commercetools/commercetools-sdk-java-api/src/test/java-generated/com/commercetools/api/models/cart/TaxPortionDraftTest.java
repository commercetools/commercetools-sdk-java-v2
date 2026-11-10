
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxPortionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxPortionDraftBuilder builder) {
        TaxPortionDraft taxPortionDraft = builder.buildUnchecked();
        Assertions.assertThat(taxPortionDraft).isInstanceOf(TaxPortionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", TaxPortionDraft.builder().name("name") },
                new Object[] { "rate", TaxPortionDraft.builder().rate(0.45292872) }, new Object[] { "amount",
                        TaxPortionDraft.builder().amount(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void name() {
        TaxPortionDraft value = TaxPortionDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void rate() {
        TaxPortionDraft value = TaxPortionDraft.of();
        value.setRate(0.45292872);
        Assertions.assertThat(value.getRate()).isEqualTo(0.45292872);
    }

    @Test
    public void amount() {
        TaxPortionDraft value = TaxPortionDraft.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
