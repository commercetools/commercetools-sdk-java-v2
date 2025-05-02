
package com.commercetools.history.models.graph_ql;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLErrorBuilder builder) {
        GraphQLError graphQLError = builder.buildUnchecked();
        Assertions.assertThat(graphQLError).isInstanceOf(GraphQLError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", GraphQLError.builder().message("message") },
                new Object[] { "locations",
                        GraphQLError.builder()
                                .locations(Collections.singletonList(
                                    new com.commercetools.history.models.graph_ql.GraphQLErrorLocationImpl())) },
                new Object[] { "path", GraphQLError.builder().path(Collections.singletonList("path")) },
                new Object[] { "extensions", GraphQLError.builder().extensions("extensions") } };
    }

    @Test
    public void message() {
        GraphQLError value = GraphQLError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void locations() {
        GraphQLError value = GraphQLError.of();
        value.setLocations(
            Collections.singletonList(new com.commercetools.history.models.graph_ql.GraphQLErrorLocationImpl()));
        Assertions.assertThat(value.getLocations())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.graph_ql.GraphQLErrorLocationImpl()));
    }

    @Test
    public void path() {
        GraphQLError value = GraphQLError.of();
        value.setPath(Collections.singletonList("path"));
        Assertions.assertThat(value.getPath()).isEqualTo(Collections.singletonList("path"));
    }

    @Test
    public void extensions() {
        GraphQLError value = GraphQLError.of();
        value.setExtensions("extensions");
        Assertions.assertThat(value.getExtensions()).isEqualTo("extensions");
    }
}
