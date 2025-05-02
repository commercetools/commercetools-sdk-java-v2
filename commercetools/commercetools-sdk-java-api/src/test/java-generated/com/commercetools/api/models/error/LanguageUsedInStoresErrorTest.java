
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LanguageUsedInStoresErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LanguageUsedInStoresErrorBuilder builder) {
        LanguageUsedInStoresError languageUsedInStoresError = builder.buildUnchecked();
        Assertions.assertThat(languageUsedInStoresError).isInstanceOf(LanguageUsedInStoresError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", LanguageUsedInStoresError.builder().message("message") } };
    }

    @Test
    public void message() {
        LanguageUsedInStoresError value = LanguageUsedInStoresError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
