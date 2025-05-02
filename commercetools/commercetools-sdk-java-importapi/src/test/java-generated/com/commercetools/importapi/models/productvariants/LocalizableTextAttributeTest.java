
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizableTextAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizableTextAttributeBuilder builder) {
        LocalizableTextAttribute localizableTextAttribute = builder.buildUnchecked();
        Assertions.assertThat(localizableTextAttribute).isInstanceOf(LocalizableTextAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", LocalizableTextAttribute.builder()
                .value(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void value() {
        LocalizableTextAttribute value = LocalizableTextAttribute.of();
        value.setValue(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
