
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeRemoveEnumValuesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeRemoveEnumValuesActionBuilder builder) {
        TypeRemoveEnumValuesAction typeRemoveEnumValuesAction = builder.buildUnchecked();
        Assertions.assertThat(typeRemoveEnumValuesAction).isInstanceOf(TypeRemoveEnumValuesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeRemoveEnumValuesAction.builder().fieldName("fieldName") },
                new Object[] { "keys", TypeRemoveEnumValuesAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void fieldName() {
        TypeRemoveEnumValuesAction value = TypeRemoveEnumValuesAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void keys() {
        TypeRemoveEnumValuesAction value = TypeRemoveEnumValuesAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
