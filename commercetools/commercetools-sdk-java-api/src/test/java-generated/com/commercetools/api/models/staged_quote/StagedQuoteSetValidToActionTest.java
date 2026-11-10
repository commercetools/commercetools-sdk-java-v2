
package com.commercetools.api.models.staged_quote;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteSetValidToActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteSetValidToActionBuilder builder) {
        StagedQuoteSetValidToAction stagedQuoteSetValidToAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSetValidToAction).isInstanceOf(StagedQuoteSetValidToAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validTo",
                StagedQuoteSetValidToAction.builder().validTo(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validTo() {
        StagedQuoteSetValidToAction value = StagedQuoteSetValidToAction.of();
        value.setValidTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidTo()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
