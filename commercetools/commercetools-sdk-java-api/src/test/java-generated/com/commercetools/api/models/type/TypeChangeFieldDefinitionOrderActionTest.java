
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeFieldDefinitionOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeFieldDefinitionOrderActionBuilder builder) {
        TypeChangeFieldDefinitionOrderAction typeChangeFieldDefinitionOrderAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeFieldDefinitionOrderAction)
                .isInstanceOf(TypeChangeFieldDefinitionOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fieldNames",
                TypeChangeFieldDefinitionOrderAction.builder().fieldNames(Collections.singletonList("fieldNames")) } };
    }

    @Test
    public void fieldNames() {
        TypeChangeFieldDefinitionOrderAction value = TypeChangeFieldDefinitionOrderAction.of();
        value.setFieldNames(Collections.singletonList("fieldNames"));
        Assertions.assertThat(value.getFieldNames()).isEqualTo(Collections.singletonList("fieldNames"));
    }
}
