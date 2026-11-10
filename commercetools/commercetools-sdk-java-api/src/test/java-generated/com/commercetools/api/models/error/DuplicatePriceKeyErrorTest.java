
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicatePriceKeyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicatePriceKeyErrorBuilder builder) {
        DuplicatePriceKeyError duplicatePriceKeyError = builder.buildUnchecked();
        Assertions.assertThat(duplicatePriceKeyError).isInstanceOf(DuplicatePriceKeyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", DuplicatePriceKeyError.builder().message("message") },
                new Object[] { "conflictingPrice", DuplicatePriceKeyError.builder()
                        .conflictingPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void message() {
        DuplicatePriceKeyError value = DuplicatePriceKeyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingPrice() {
        DuplicatePriceKeyError value = DuplicatePriceKeyError.of();
        value.setConflictingPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getConflictingPrice())
                .isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
