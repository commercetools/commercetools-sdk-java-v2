
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLEditPreviewFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLEditPreviewFailedErrorBuilder builder) {
        GraphQLEditPreviewFailedError graphQLEditPreviewFailedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLEditPreviewFailedError).isInstanceOf(GraphQLEditPreviewFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "result", GraphQLEditPreviewFailedError.builder()
                .result(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl()) } };
    }

    @Test
    public void result() {
        GraphQLEditPreviewFailedError value = GraphQLEditPreviewFailedError.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl());
    }
}
