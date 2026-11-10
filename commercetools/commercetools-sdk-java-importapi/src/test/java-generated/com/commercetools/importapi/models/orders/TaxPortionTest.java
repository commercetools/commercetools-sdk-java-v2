
package com.commercetools.importapi.models.orders;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxPortionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxPortionBuilder builder) {
        TaxPortion taxPortion = builder.buildUnchecked();
        Assertions.assertThat(taxPortion).isInstanceOf(TaxPortion.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", TaxPortion.builder().name("name") },
                new Object[] { "rate", TaxPortion.builder().rate(0.45292872) }, new Object[] { "amount",
                        TaxPortion.builder().amount(new com.commercetools.importapi.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void name() {
        TaxPortion value = TaxPortion.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void rate() {
        TaxPortion value = TaxPortion.of();
        value.setRate(0.45292872);
        Assertions.assertThat(value.getRate()).isEqualTo(0.45292872);
    }

    @Test
    public void amount() {
        TaxPortion value = TaxPortion.of();
        value.setAmount(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getAmount())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }
}
