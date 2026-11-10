
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionPredicateEvaluationFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionPredicateEvaluationFailedErrorBuilder builder) {
        ExtensionPredicateEvaluationFailedError extensionPredicateEvaluationFailedError = builder.buildUnchecked();
        Assertions.assertThat(extensionPredicateEvaluationFailedError)
                .isInstanceOf(ExtensionPredicateEvaluationFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ExtensionPredicateEvaluationFailedError.builder().message("message") },
                new Object[] { "errorByExtension", ExtensionPredicateEvaluationFailedError.builder()
                        .errorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl()) } };
    }

    @Test
    public void message() {
        ExtensionPredicateEvaluationFailedError value = ExtensionPredicateEvaluationFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void errorByExtension() {
        ExtensionPredicateEvaluationFailedError value = ExtensionPredicateEvaluationFailedError.of();
        value.setErrorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl());
        Assertions.assertThat(value.getErrorByExtension())
                .isEqualTo(new com.commercetools.api.models.error.ErrorByExtensionImpl());
    }
}
