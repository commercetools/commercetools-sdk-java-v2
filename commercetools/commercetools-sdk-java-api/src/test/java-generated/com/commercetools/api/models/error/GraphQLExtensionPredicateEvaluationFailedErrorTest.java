
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLExtensionPredicateEvaluationFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLExtensionPredicateEvaluationFailedErrorBuilder builder) {
        GraphQLExtensionPredicateEvaluationFailedError graphQLExtensionPredicateEvaluationFailedError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLExtensionPredicateEvaluationFailedError)
                .isInstanceOf(GraphQLExtensionPredicateEvaluationFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "errorByExtension", GraphQLExtensionPredicateEvaluationFailedError.builder()
                        .errorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl()) } };
    }

    @Test
    public void errorByExtension() {
        GraphQLExtensionPredicateEvaluationFailedError value = GraphQLExtensionPredicateEvaluationFailedError.of();
        value.setErrorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl());
        Assertions.assertThat(value.getErrorByExtension())
                .isEqualTo(new com.commercetools.api.models.error.ErrorByExtensionImpl());
    }
}
