
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeDefinitionTypeConflictErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeDefinitionTypeConflictErrorBuilder builder) {
        AttributeDefinitionTypeConflictError attributeDefinitionTypeConflictError = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinitionTypeConflictError)
                .isInstanceOf(AttributeDefinitionTypeConflictError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AttributeDefinitionTypeConflictError.builder().message("message") },
                new Object[] { "conflictingProductTypeId",
                        AttributeDefinitionTypeConflictError.builder()
                                .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { "conflictingProductTypeName",
                        AttributeDefinitionTypeConflictError.builder()
                                .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { "conflictingAttributeName", AttributeDefinitionTypeConflictError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingProductTypeId() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
