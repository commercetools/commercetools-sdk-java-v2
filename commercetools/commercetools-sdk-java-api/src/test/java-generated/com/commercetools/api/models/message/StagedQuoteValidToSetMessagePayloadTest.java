
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteValidToSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteValidToSetMessagePayloadBuilder builder) {
        StagedQuoteValidToSetMessagePayload stagedQuoteValidToSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteValidToSetMessagePayload)
                .isInstanceOf(StagedQuoteValidToSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validTo",
                StagedQuoteValidToSetMessagePayload.builder().validTo(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validTo() {
        StagedQuoteValidToSetMessagePayload value = StagedQuoteValidToSetMessagePayload.of();
        value.setValidTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidTo()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
