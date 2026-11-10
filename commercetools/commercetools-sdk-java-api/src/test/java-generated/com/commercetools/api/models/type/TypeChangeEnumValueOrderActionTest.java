
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeEnumValueOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeEnumValueOrderActionBuilder builder) {
        TypeChangeEnumValueOrderAction typeChangeEnumValueOrderAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeEnumValueOrderAction).isInstanceOf(TypeChangeEnumValueOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeChangeEnumValueOrderAction.builder().fieldName("fieldName") },
                new Object[] { "keys",
                        TypeChangeEnumValueOrderAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void fieldName() {
        TypeChangeEnumValueOrderAction value = TypeChangeEnumValueOrderAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void keys() {
        TypeChangeEnumValueOrderAction value = TypeChangeEnumValueOrderAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
