
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLReferencedResourceNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLReferencedResourceNotFoundErrorBuilder builder) {
        GraphQLReferencedResourceNotFoundError graphQLReferencedResourceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(graphQLReferencedResourceNotFoundError)
                .isInstanceOf(GraphQLReferencedResourceNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "typeId", GraphQLReferencedResourceNotFoundError.builder()
                        .typeId(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) },
                new Object[] { "id", GraphQLReferencedResourceNotFoundError.builder().id("id") },
                new Object[] { "key", GraphQLReferencedResourceNotFoundError.builder().key("key") } };
    }

    @Test
    public void typeId() {
        GraphQLReferencedResourceNotFoundError value = GraphQLReferencedResourceNotFoundError.of();
        value.setTypeId(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }

    @Test
    public void id() {
        GraphQLReferencedResourceNotFoundError value = GraphQLReferencedResourceNotFoundError.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        GraphQLReferencedResourceNotFoundError value = GraphQLReferencedResourceNotFoundError.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
