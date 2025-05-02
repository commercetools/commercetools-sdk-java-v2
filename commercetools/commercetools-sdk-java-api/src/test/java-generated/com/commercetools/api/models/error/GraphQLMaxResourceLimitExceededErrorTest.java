
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLMaxResourceLimitExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLMaxResourceLimitExceededErrorBuilder builder) {
        GraphQLMaxResourceLimitExceededError graphQLMaxResourceLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMaxResourceLimitExceededError)
                .isInstanceOf(GraphQLMaxResourceLimitExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "exceededResource", GraphQLMaxResourceLimitExceededError.builder()
                .exceededResource(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) } };
    }

    @Test
    public void exceededResource() {
        GraphQLMaxResourceLimitExceededError value = GraphQLMaxResourceLimitExceededError.of();
        value.setExceededResource(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getExceededResource())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }
}
