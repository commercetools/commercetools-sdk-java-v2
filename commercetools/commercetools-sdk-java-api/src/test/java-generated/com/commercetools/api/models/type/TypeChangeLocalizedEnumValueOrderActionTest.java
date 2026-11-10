
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeLocalizedEnumValueOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeLocalizedEnumValueOrderActionBuilder builder) {
        TypeChangeLocalizedEnumValueOrderAction typeChangeLocalizedEnumValueOrderAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeLocalizedEnumValueOrderAction)
                .isInstanceOf(TypeChangeLocalizedEnumValueOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeChangeLocalizedEnumValueOrderAction.builder().fieldName("fieldName") },
                new Object[] { "keys",
                        TypeChangeLocalizedEnumValueOrderAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void fieldName() {
        TypeChangeLocalizedEnumValueOrderAction value = TypeChangeLocalizedEnumValueOrderAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void keys() {
        TypeChangeLocalizedEnumValueOrderAction value = TypeChangeLocalizedEnumValueOrderAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
