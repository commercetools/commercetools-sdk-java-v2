
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateFieldWithConflictingResourceErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateFieldWithConflictingResourceErrorBuilder builder) {
        DuplicateFieldWithConflictingResourceError duplicateFieldWithConflictingResourceError = builder
                .buildUnchecked();
        Assertions.assertThat(duplicateFieldWithConflictingResourceError)
                .isInstanceOf(DuplicateFieldWithConflictingResourceError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", DuplicateFieldWithConflictingResourceError.builder().message("message") },
                new Object[] { "field", DuplicateFieldWithConflictingResourceError.builder().field("field") },
                new Object[] { "duplicateValue",
                        DuplicateFieldWithConflictingResourceError.builder().duplicateValue("duplicateValue") },
                new Object[] { "conflictingResource", DuplicateFieldWithConflictingResourceError.builder()
                        .conflictingResource(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void message() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void field() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }

    @Test
    public void conflictingResource() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setConflictingResource(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getConflictingResource())
                .isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
