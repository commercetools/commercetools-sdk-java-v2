
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLExtensionNoResponseErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLExtensionNoResponseErrorBuilder builder) {
        GraphQLExtensionNoResponseError graphQLExtensionNoResponseError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExtensionNoResponseError).isInstanceOf(GraphQLExtensionNoResponseError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "extensionId", GraphQLExtensionNoResponseError.builder().extensionId("extensionId") },
                new Object[] { "extensionKey",
                        GraphQLExtensionNoResponseError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void extensionId() {
        GraphQLExtensionNoResponseError value = GraphQLExtensionNoResponseError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        GraphQLExtensionNoResponseError value = GraphQLExtensionNoResponseError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
