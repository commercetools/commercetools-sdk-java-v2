
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicatePriceScopeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicatePriceScopeErrorBuilder builder) {
        DuplicatePriceScopeError duplicatePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(duplicatePriceScopeError).isInstanceOf(DuplicatePriceScopeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", DuplicatePriceScopeError.builder().message("message") },
                new Object[] { "conflictingPrice", DuplicatePriceScopeError.builder()
                        .conflictingPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void message() {
        DuplicatePriceScopeError value = DuplicatePriceScopeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingPrice() {
        DuplicatePriceScopeError value = DuplicatePriceScopeError.of();
        value.setConflictingPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getConflictingPrice())
                .isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
