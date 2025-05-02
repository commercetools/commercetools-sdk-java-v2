
package com.commercetools.history.models.graph_ql;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLErrorLocationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLErrorLocationBuilder builder) {
        GraphQLErrorLocation graphQLErrorLocation = builder.buildUnchecked();
        Assertions.assertThat(graphQLErrorLocation).isInstanceOf(GraphQLErrorLocation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "line", GraphQLErrorLocation.builder().line(6L) },
                new Object[] { "column", GraphQLErrorLocation.builder().column(2L) } };
    }

    @Test
    public void line() {
        GraphQLErrorLocation value = GraphQLErrorLocation.of();
        value.setLine(6L);
        Assertions.assertThat(value.getLine()).isEqualTo(6L);
    }

    @Test
    public void column() {
        GraphQLErrorLocation value = GraphQLErrorLocation.of();
        value.setColumn(2L);
        Assertions.assertThat(value.getColumn()).isEqualTo(2L);
    }
}
