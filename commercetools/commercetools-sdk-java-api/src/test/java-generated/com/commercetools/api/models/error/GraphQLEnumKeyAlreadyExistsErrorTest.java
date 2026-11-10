
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLEnumKeyAlreadyExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLEnumKeyAlreadyExistsErrorBuilder builder) {
        GraphQLEnumKeyAlreadyExistsError graphQLEnumKeyAlreadyExistsError = builder.buildUnchecked();
        Assertions.assertThat(graphQLEnumKeyAlreadyExistsError).isInstanceOf(GraphQLEnumKeyAlreadyExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingEnumKey",
                        GraphQLEnumKeyAlreadyExistsError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] { "conflictingAttributeName", GraphQLEnumKeyAlreadyExistsError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingEnumKey() {
        GraphQLEnumKeyAlreadyExistsError value = GraphQLEnumKeyAlreadyExistsError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLEnumKeyAlreadyExistsError value = GraphQLEnumKeyAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
