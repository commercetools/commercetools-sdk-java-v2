
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeLabelActionBuilder builder) {
        TypeChangeLabelAction typeChangeLabelAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeLabelAction).isInstanceOf(TypeChangeLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fieldName", TypeChangeLabelAction.builder().fieldName("fieldName") },
                new Object[] { "label", TypeChangeLabelAction.builder()
                        .label(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeChangeLabelAction value = TypeChangeLabelAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void label() {
        TypeChangeLabelAction value = TypeChangeLabelAction.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
