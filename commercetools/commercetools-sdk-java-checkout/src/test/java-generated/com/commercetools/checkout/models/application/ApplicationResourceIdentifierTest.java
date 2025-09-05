
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationResourceIdentifierBuilder builder) {
        ApplicationResourceIdentifier applicationResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(applicationResourceIdentifier).isInstanceOf(ApplicationResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ApplicationResourceIdentifier.builder().id("id") },
                new Object[] { "key", ApplicationResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ApplicationResourceIdentifier value = ApplicationResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ApplicationResourceIdentifier value = ApplicationResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
