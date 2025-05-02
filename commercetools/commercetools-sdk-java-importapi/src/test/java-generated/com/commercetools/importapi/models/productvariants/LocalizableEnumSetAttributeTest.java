
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizableEnumSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizableEnumSetAttributeBuilder builder) {
        LocalizableEnumSetAttribute localizableEnumSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(localizableEnumSetAttribute).isInstanceOf(LocalizableEnumSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                LocalizableEnumSetAttribute.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        LocalizableEnumSetAttribute value = LocalizableEnumSetAttribute.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
