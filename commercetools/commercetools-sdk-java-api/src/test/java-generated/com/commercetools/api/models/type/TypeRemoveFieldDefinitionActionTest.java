
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeRemoveFieldDefinitionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeRemoveFieldDefinitionActionBuilder builder) {
        TypeRemoveFieldDefinitionAction typeRemoveFieldDefinitionAction = builder.buildUnchecked();
        Assertions.assertThat(typeRemoveFieldDefinitionAction).isInstanceOf(TypeRemoveFieldDefinitionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeRemoveFieldDefinitionAction.builder().fieldName("fieldName") } };
    }

    @Test
    public void fieldName() {
        TypeRemoveFieldDefinitionAction value = TypeRemoveFieldDefinitionAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }
}
