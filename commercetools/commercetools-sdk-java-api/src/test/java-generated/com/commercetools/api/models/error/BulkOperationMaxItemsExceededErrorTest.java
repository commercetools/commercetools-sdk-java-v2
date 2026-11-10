
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BulkOperationMaxItemsExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BulkOperationMaxItemsExceededErrorBuilder builder) {
        BulkOperationMaxItemsExceededError bulkOperationMaxItemsExceededError = builder.buildUnchecked();
        Assertions.assertThat(bulkOperationMaxItemsExceededError)
                .isInstanceOf(BulkOperationMaxItemsExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", BulkOperationMaxItemsExceededError.builder().message("message") },
                new Object[] { "limit", BulkOperationMaxItemsExceededError.builder().limit(7) },
                new Object[] { "provided", BulkOperationMaxItemsExceededError.builder().provided(2) } };
    }

    @Test
    public void message() {
        BulkOperationMaxItemsExceededError value = BulkOperationMaxItemsExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void limit() {
        BulkOperationMaxItemsExceededError value = BulkOperationMaxItemsExceededError.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void provided() {
        BulkOperationMaxItemsExceededError value = BulkOperationMaxItemsExceededError.of();
        value.setProvided(2);
        Assertions.assertThat(value.getProvided()).isEqualTo(2);
    }
}
