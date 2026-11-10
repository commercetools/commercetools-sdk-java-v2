
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizableEnumAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizableEnumAttributeBuilder builder) {
        LocalizableEnumAttribute localizableEnumAttribute = builder.buildUnchecked();
        Assertions.assertThat(localizableEnumAttribute).isInstanceOf(LocalizableEnumAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", LocalizableEnumAttribute.builder().value("value") } };
    }

    @Test
    public void value() {
        LocalizableEnumAttribute value = LocalizableEnumAttribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
