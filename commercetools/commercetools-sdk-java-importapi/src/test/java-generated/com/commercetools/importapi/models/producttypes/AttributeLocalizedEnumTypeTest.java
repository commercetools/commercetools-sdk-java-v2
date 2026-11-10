
package com.commercetools.importapi.models.producttypes;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeLocalizedEnumTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeLocalizedEnumTypeBuilder builder) {
        AttributeLocalizedEnumType attributeLocalizedEnumType = builder.buildUnchecked();
        Assertions.assertThat(attributeLocalizedEnumType).isInstanceOf(AttributeLocalizedEnumType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "values",
                AttributeLocalizedEnumType.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl())) } };
    }

    @Test
    public void values() {
        AttributeLocalizedEnumType value = AttributeLocalizedEnumType.of();
        value.setValues(Collections
                .singletonList(new com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl()));
    }
}
