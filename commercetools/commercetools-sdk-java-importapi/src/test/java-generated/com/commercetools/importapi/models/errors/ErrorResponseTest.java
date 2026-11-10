
package com.commercetools.importapi.models.errors;

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
                new Object[] { "error", ErrorResponse.builder().error("error") },
                new Object[] { "error_description", ErrorResponse.builder().error_description("error_description") },
                new Object[] { "errors",
                        ErrorResponse.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.importapi.models.errors.ErrorObjectImpl())) } };
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
    public void error() {
        ErrorResponse value = ErrorResponse.of();
        value.setError("error");
        Assertions.assertThat(value.getError()).isEqualTo("error");
    }

    @Test
    public void errorDescription() {
        ErrorResponse value = ErrorResponse.of();
        value.setErrorDescription("error_description");
        Assertions.assertThat(value.getErrorDescription()).isEqualTo("error_description");
    }

    @Test
    public void errors() {
        ErrorResponse value = ErrorResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl()));
    }
}
