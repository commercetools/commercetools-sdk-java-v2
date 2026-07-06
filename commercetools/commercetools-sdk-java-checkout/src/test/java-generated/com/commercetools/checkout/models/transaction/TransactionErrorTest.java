
package com.commercetools.checkout.models.transaction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionErrorBuilder builder) {
        TransactionError transactionError = builder.buildUnchecked();
        Assertions.assertThat(transactionError).isInstanceOf(TransactionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", TransactionError.builder().code("code") },
                new Object[] { "message", TransactionError.builder().message("message") } };
    }

    @Test
    public void code() {
        TransactionError value = TransactionError.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void message() {
        TransactionError value = TransactionError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
