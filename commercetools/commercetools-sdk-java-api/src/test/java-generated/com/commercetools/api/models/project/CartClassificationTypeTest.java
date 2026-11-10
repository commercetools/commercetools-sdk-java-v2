
package com.commercetools.api.models.project;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartClassificationTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartClassificationTypeBuilder builder) {
        CartClassificationType cartClassificationType = builder.buildUnchecked();
        Assertions.assertThat(cartClassificationType).isInstanceOf(CartClassificationType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "values",
                CartClassificationType.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl())) } };
    }

    @Test
    public void values() {
        CartClassificationType value = CartClassificationType.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()));
    }
}
