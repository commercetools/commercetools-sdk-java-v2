
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ScoreShippingRateInputDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ScoreShippingRateInputDraftBuilder builder) {
        ScoreShippingRateInputDraft scoreShippingRateInputDraft = builder.buildUnchecked();
        Assertions.assertThat(scoreShippingRateInputDraft).isInstanceOf(ScoreShippingRateInputDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "score", ScoreShippingRateInputDraft.builder().score(9L) } };
    }

    @Test
    public void score() {
        ScoreShippingRateInputDraft value = ScoreShippingRateInputDraft.of();
        value.setScore(9L);
        Assertions.assertThat(value.getScore()).isEqualTo(9L);
    }
}
