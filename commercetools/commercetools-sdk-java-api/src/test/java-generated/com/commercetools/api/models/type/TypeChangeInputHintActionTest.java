
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeInputHintActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeInputHintActionBuilder builder) {
        TypeChangeInputHintAction typeChangeInputHintAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeInputHintAction).isInstanceOf(TypeChangeInputHintAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeChangeInputHintAction.builder().fieldName("fieldName") },
                new Object[] { "inputHint", TypeChangeInputHintAction.builder()
                        .inputHint(com.commercetools.api.models.type.TypeTextInputHint.findEnum("SingleLine")) } };
    }

    @Test
    public void fieldName() {
        TypeChangeInputHintAction value = TypeChangeInputHintAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void inputHint() {
        TypeChangeInputHintAction value = TypeChangeInputHintAction.of();
        value.setInputHint(com.commercetools.api.models.type.TypeTextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.api.models.type.TypeTextInputHint.findEnum("SingleLine"));
    }
}
