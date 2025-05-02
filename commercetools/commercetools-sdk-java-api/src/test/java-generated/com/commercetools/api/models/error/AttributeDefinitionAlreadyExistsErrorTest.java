
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeDefinitionAlreadyExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeDefinitionAlreadyExistsErrorBuilder builder) {
        AttributeDefinitionAlreadyExistsError attributeDefinitionAlreadyExistsError = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinitionAlreadyExistsError)
                .isInstanceOf(AttributeDefinitionAlreadyExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AttributeDefinitionAlreadyExistsError.builder().message("message") },
                new Object[] { "conflictingProductTypeId",
                        AttributeDefinitionAlreadyExistsError.builder()
                                .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { "conflictingProductTypeName",
                        AttributeDefinitionAlreadyExistsError.builder()
                                .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { "conflictingAttributeName", AttributeDefinitionAlreadyExistsError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingProductTypeId() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
