
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteValidToSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteValidToSetMessageBuilder builder) {
        StagedQuoteValidToSetMessage stagedQuoteValidToSetMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteValidToSetMessage).isInstanceOf(StagedQuoteValidToSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validTo",
                StagedQuoteValidToSetMessage.builder().validTo(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validTo() {
        StagedQuoteValidToSetMessage value = StagedQuoteValidToSetMessage.of();
        value.setValidTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidTo()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
