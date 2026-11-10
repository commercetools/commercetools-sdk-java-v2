
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeRemoveLocalizedEnumValuesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeRemoveLocalizedEnumValuesActionBuilder builder) {
        TypeRemoveLocalizedEnumValuesAction typeRemoveLocalizedEnumValuesAction = builder.buildUnchecked();
        Assertions.assertThat(typeRemoveLocalizedEnumValuesAction)
                .isInstanceOf(TypeRemoveLocalizedEnumValuesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeRemoveLocalizedEnumValuesAction.builder().fieldName("fieldName") },
                new Object[] { "keys",
                        TypeRemoveLocalizedEnumValuesAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void fieldName() {
        TypeRemoveLocalizedEnumValuesAction value = TypeRemoveLocalizedEnumValuesAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void keys() {
        TypeRemoveLocalizedEnumValuesAction value = TypeRemoveLocalizedEnumValuesAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
