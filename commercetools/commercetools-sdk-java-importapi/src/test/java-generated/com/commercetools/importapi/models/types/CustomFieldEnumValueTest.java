
package com.commercetools.importapi.models.types;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldEnumValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldEnumValueBuilder builder) {
        CustomFieldEnumValue customFieldEnumValue = builder.buildUnchecked();
        Assertions.assertThat(customFieldEnumValue).isInstanceOf(CustomFieldEnumValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomFieldEnumValue.builder().key("key") },
                new Object[] { "label", CustomFieldEnumValue.builder().label("label") } };
    }

    @Test
    public void key() {
        CustomFieldEnumValue value = CustomFieldEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        CustomFieldEnumValue value = CustomFieldEnumValue.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
