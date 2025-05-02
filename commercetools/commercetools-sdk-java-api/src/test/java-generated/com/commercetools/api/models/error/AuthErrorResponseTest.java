
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AuthErrorResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AuthErrorResponseBuilder builder) {
        AuthErrorResponse authErrorResponse = builder.buildUnchecked();
        Assertions.assertThat(authErrorResponse).isInstanceOf(AuthErrorResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "error", AuthErrorResponse.builder().error("error") },
                new Object[] { "error_description",
                        AuthErrorResponse.builder().error_description("error_description") },
                new Object[] { "errors", AuthErrorResponse.builder()
                        .errors(
                            Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void error() {
        AuthErrorResponse value = AuthErrorResponse.of();
        value.setError("error");
        Assertions.assertThat(value.getError()).isEqualTo("error");
    }

    @Test
    public void errorDescription() {
        AuthErrorResponse value = AuthErrorResponse.of();
        value.setErrorDescription("error_description");
        Assertions.assertThat(value.getErrorDescription()).isEqualTo("error_description");
    }

    @Test
    public void errors() {
        AuthErrorResponse value = AuthErrorResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }
}
