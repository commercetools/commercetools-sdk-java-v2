
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLConcurrentModificationErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLConcurrentModificationErrorBuilder builder) {
        GraphQLConcurrentModificationError graphQLConcurrentModificationError = builder.buildUnchecked();
        Assertions.assertThat(graphQLConcurrentModificationError)
                .isInstanceOf(GraphQLConcurrentModificationError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "currentVersion", GraphQLConcurrentModificationError.builder().currentVersion(4L) } };
    }

    @Test
    public void currentVersion() {
        GraphQLConcurrentModificationError value = GraphQLConcurrentModificationError.of();
        value.setCurrentVersion(4L);
        Assertions.assertThat(value.getCurrentVersion()).isEqualTo(4L);
    }
}
