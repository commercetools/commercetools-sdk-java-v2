
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLEnumKeyDoesNotExistErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLEnumKeyDoesNotExistErrorBuilder builder) {
        GraphQLEnumKeyDoesNotExistError graphQLEnumKeyDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(graphQLEnumKeyDoesNotExistError).isInstanceOf(GraphQLEnumKeyDoesNotExistError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingEnumKey",
                        GraphQLEnumKeyDoesNotExistError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] { "conflictingAttributeName", GraphQLEnumKeyDoesNotExistError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingEnumKey() {
        GraphQLEnumKeyDoesNotExistError value = GraphQLEnumKeyDoesNotExistError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLEnumKeyDoesNotExistError value = GraphQLEnumKeyDoesNotExistError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
