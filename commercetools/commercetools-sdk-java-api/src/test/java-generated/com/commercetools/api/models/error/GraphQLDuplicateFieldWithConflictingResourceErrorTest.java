
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateFieldWithConflictingResourceErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateFieldWithConflictingResourceErrorBuilder builder) {
        GraphQLDuplicateFieldWithConflictingResourceError graphQLDuplicateFieldWithConflictingResourceError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLDuplicateFieldWithConflictingResourceError)
                .isInstanceOf(GraphQLDuplicateFieldWithConflictingResourceError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "field", GraphQLDuplicateFieldWithConflictingResourceError.builder().field("field") },
                new Object[] { "duplicateValue",
                        GraphQLDuplicateFieldWithConflictingResourceError.builder().duplicateValue("duplicateValue") },
                new Object[] { "conflictingResource", GraphQLDuplicateFieldWithConflictingResourceError.builder()
                        .conflictingResource(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void field() {
        GraphQLDuplicateFieldWithConflictingResourceError value = GraphQLDuplicateFieldWithConflictingResourceError
                .of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        GraphQLDuplicateFieldWithConflictingResourceError value = GraphQLDuplicateFieldWithConflictingResourceError
                .of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }

    @Test
    public void conflictingResource() {
        GraphQLDuplicateFieldWithConflictingResourceError value = GraphQLDuplicateFieldWithConflictingResourceError
                .of();
        value.setConflictingResource(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getConflictingResource())
                .isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
