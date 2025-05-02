
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizableTextSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizableTextSetAttributeBuilder builder) {
        LocalizableTextSetAttribute localizableTextSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(localizableTextSetAttribute).isInstanceOf(LocalizableTextSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", LocalizableTextSetAttribute.builder()
                .value(
                    Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void value() {
        LocalizableTextSetAttribute value = LocalizableTextSetAttribute.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl()));
    }
}
