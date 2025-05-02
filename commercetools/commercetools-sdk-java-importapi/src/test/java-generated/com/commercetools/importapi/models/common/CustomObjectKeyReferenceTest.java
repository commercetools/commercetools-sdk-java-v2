
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomObjectKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomObjectKeyReferenceBuilder builder) {
        CustomObjectKeyReference customObjectKeyReference = builder.buildUnchecked();
        Assertions.assertThat(customObjectKeyReference).isInstanceOf(CustomObjectKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "container", CustomObjectKeyReference.builder().container("container") } };
    }

    @Test
    public void container() {
        CustomObjectKeyReference value = CustomObjectKeyReference.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }
}
