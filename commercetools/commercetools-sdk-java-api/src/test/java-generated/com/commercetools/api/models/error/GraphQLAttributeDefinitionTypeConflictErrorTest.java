
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLAttributeDefinitionTypeConflictErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLAttributeDefinitionTypeConflictErrorBuilder builder) {
        GraphQLAttributeDefinitionTypeConflictError graphQLAttributeDefinitionTypeConflictError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLAttributeDefinitionTypeConflictError)
                .isInstanceOf(GraphQLAttributeDefinitionTypeConflictError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingProductTypeId",
                        GraphQLAttributeDefinitionTypeConflictError.builder()
                                .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { "conflictingProductTypeName",
                        GraphQLAttributeDefinitionTypeConflictError.builder()
                                .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { "conflictingAttributeName", GraphQLAttributeDefinitionTypeConflictError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingProductTypeId() {
        GraphQLAttributeDefinitionTypeConflictError value = GraphQLAttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        GraphQLAttributeDefinitionTypeConflictError value = GraphQLAttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLAttributeDefinitionTypeConflictError value = GraphQLAttributeDefinitionTypeConflictError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
