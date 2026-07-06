
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationReferenceBuilder builder) {
        ApplicationReference applicationReference = builder.buildUnchecked();
        Assertions.assertThat(applicationReference).isInstanceOf(ApplicationReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ApplicationReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ApplicationReference value = ApplicationReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
