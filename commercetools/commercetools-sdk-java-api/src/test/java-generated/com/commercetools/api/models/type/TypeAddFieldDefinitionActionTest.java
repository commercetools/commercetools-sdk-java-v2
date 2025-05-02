
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeAddFieldDefinitionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeAddFieldDefinitionActionBuilder builder) {
        TypeAddFieldDefinitionAction typeAddFieldDefinitionAction = builder.buildUnchecked();
        Assertions.assertThat(typeAddFieldDefinitionAction).isInstanceOf(TypeAddFieldDefinitionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fieldDefinition", TypeAddFieldDefinitionAction.builder()
                .fieldDefinition(new com.commercetools.api.models.type.FieldDefinitionImpl()) } };
    }

    @Test
    public void fieldDefinition() {
        TypeAddFieldDefinitionAction value = TypeAddFieldDefinitionAction.of();
        value.setFieldDefinition(new com.commercetools.api.models.type.FieldDefinitionImpl());
        Assertions.assertThat(value.getFieldDefinition())
                .isEqualTo(new com.commercetools.api.models.type.FieldDefinitionImpl());
    }
}
