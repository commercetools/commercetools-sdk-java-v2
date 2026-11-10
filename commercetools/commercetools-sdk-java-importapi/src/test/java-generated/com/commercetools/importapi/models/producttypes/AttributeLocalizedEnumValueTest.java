
package com.commercetools.importapi.models.producttypes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeLocalizedEnumValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeLocalizedEnumValueBuilder builder) {
        AttributeLocalizedEnumValue attributeLocalizedEnumValue = builder.buildUnchecked();
        Assertions.assertThat(attributeLocalizedEnumValue).isInstanceOf(AttributeLocalizedEnumValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AttributeLocalizedEnumValue.builder().key("key") },
                new Object[] { "label", AttributeLocalizedEnumValue.builder()
                        .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        AttributeLocalizedEnumValue value = AttributeLocalizedEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        AttributeLocalizedEnumValue value = AttributeLocalizedEnumValue.of();
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
