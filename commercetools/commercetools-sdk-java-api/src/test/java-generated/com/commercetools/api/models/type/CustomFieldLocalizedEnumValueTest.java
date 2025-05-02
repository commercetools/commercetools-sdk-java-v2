
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldLocalizedEnumValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldLocalizedEnumValueBuilder builder) {
        CustomFieldLocalizedEnumValue customFieldLocalizedEnumValue = builder.buildUnchecked();
        Assertions.assertThat(customFieldLocalizedEnumValue).isInstanceOf(CustomFieldLocalizedEnumValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomFieldLocalizedEnumValue.builder().key("key") },
                new Object[] { "label", CustomFieldLocalizedEnumValue.builder()
                        .label(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        CustomFieldLocalizedEnumValue value = CustomFieldLocalizedEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        CustomFieldLocalizedEnumValue value = CustomFieldLocalizedEnumValue.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
