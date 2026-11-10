
package com.commercetools.checkout.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ErrorResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ErrorResponseBuilder builder) {
        ErrorResponse errorResponse = builder.buildUnchecked();
        Assertions.assertThat(errorResponse).isInstanceOf(ErrorResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "statusCode", ErrorResponse.builder().statusCode(8) },
                new Object[] { "message", ErrorResponse.builder().message("message") },
                new Object[] { "errors",
                        ErrorResponse.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.checkout.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void statusCode() {
        ErrorResponse value = ErrorResponse.of();
        value.setStatusCode(8);
        Assertions.assertThat(value.getStatusCode()).isEqualTo(8);
    }

    @Test
    public void message() {
        ErrorResponse value = ErrorResponse.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void errors() {
        ErrorResponse value = ErrorResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.checkout.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.checkout.models.error.ErrorObjectImpl()));
    }
}
