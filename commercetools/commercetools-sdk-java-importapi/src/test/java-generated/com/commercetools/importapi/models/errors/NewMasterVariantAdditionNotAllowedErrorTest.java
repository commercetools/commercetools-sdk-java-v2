
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NewMasterVariantAdditionNotAllowedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NewMasterVariantAdditionNotAllowedErrorBuilder builder) {
        NewMasterVariantAdditionNotAllowedError newMasterVariantAdditionNotAllowedError = builder.buildUnchecked();
        Assertions.assertThat(newMasterVariantAdditionNotAllowedError)
                .isInstanceOf(NewMasterVariantAdditionNotAllowedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", NewMasterVariantAdditionNotAllowedError.builder().message("message") } };
    }

    @Test
    public void message() {
        NewMasterVariantAdditionNotAllowedError value = NewMasterVariantAdditionNotAllowedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
