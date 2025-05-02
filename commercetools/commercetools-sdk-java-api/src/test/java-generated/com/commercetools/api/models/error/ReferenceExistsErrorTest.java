
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReferenceExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReferenceExistsErrorBuilder builder) {
        ReferenceExistsError referenceExistsError = builder.buildUnchecked();
        Assertions.assertThat(referenceExistsError).isInstanceOf(ReferenceExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ReferenceExistsError.builder().message("message") },
                new Object[] { "referencedBy",
                        ReferenceExistsError.builder()
                                .referencedBy(
                                    com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) } };
    }

    @Test
    public void message() {
        ReferenceExistsError value = ReferenceExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void referencedBy() {
        ReferenceExistsError value = ReferenceExistsError.of();
        value.setReferencedBy(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getReferencedBy())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }
}
