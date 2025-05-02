
package com.commercetools.importapi.models.producttypes;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeEnumTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeEnumTypeBuilder builder) {
        AttributeEnumType attributeEnumType = builder.buildUnchecked();
        Assertions.assertThat(attributeEnumType).isInstanceOf(AttributeEnumType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "values",
                AttributeEnumType.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.importapi.models.producttypes.AttributePlainEnumValueImpl())) } };
    }

    @Test
    public void values() {
        AttributeEnumType value = AttributeEnumType.of();
        value.setValues(Collections
                .singletonList(new com.commercetools.importapi.models.producttypes.AttributePlainEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.producttypes.AttributePlainEnumValueImpl()));
    }
}
