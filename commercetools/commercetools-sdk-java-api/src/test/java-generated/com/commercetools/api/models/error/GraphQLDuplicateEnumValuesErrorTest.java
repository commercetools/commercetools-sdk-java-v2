
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateEnumValuesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateEnumValuesErrorBuilder builder) {
        GraphQLDuplicateEnumValuesError graphQLDuplicateEnumValuesError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateEnumValuesError).isInstanceOf(GraphQLDuplicateEnumValuesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "duplicates",
                GraphQLDuplicateEnumValuesError.builder().duplicates(Collections.singletonList("duplicates")) } };
    }

    @Test
    public void duplicates() {
        GraphQLDuplicateEnumValuesError value = GraphQLDuplicateEnumValuesError.of();
        value.setDuplicates(Collections.singletonList("duplicates"));
        Assertions.assertThat(value.getDuplicates()).isEqualTo(Collections.singletonList("duplicates"));
    }
}
