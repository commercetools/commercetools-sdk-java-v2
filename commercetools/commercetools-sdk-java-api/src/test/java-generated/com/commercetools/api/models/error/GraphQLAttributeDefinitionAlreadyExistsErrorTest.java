
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLAttributeDefinitionAlreadyExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLAttributeDefinitionAlreadyExistsErrorBuilder builder) {
        GraphQLAttributeDefinitionAlreadyExistsError graphQLAttributeDefinitionAlreadyExistsError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLAttributeDefinitionAlreadyExistsError)
                .isInstanceOf(GraphQLAttributeDefinitionAlreadyExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingProductTypeId",
                        GraphQLAttributeDefinitionAlreadyExistsError.builder()
                                .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { "conflictingProductTypeName",
                        GraphQLAttributeDefinitionAlreadyExistsError.builder()
                                .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { "conflictingAttributeName", GraphQLAttributeDefinitionAlreadyExistsError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingProductTypeId() {
        GraphQLAttributeDefinitionAlreadyExistsError value = GraphQLAttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        GraphQLAttributeDefinitionAlreadyExistsError value = GraphQLAttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLAttributeDefinitionAlreadyExistsError value = GraphQLAttributeDefinitionAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
