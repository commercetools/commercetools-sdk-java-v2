
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeKeyActionBuilder builder) {
        TypeChangeKeyAction typeChangeKeyAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeKeyAction).isInstanceOf(TypeChangeKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TypeChangeKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        TypeChangeKeyAction value = TypeChangeKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
