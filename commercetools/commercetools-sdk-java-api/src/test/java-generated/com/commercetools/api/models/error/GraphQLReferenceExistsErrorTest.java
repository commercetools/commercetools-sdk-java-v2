
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLReferenceExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLReferenceExistsErrorBuilder builder) {
        GraphQLReferenceExistsError graphQLReferenceExistsError = builder.buildUnchecked();
        Assertions.assertThat(graphQLReferenceExistsError).isInstanceOf(GraphQLReferenceExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "referencedBy", GraphQLReferenceExistsError.builder()
                .referencedBy(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) } };
    }

    @Test
    public void referencedBy() {
        GraphQLReferenceExistsError value = GraphQLReferenceExistsError.of();
        value.setReferencedBy(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getReferencedBy())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }
}
