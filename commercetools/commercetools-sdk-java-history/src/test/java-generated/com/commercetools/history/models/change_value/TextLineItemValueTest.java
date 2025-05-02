
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TextLineItemValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TextLineItemValueBuilder builder) {
        TextLineItemValue textLineItemValue = builder.buildUnchecked();
        Assertions.assertThat(textLineItemValue).isInstanceOf(TextLineItemValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TextLineItemValue.builder().id("id") }, new Object[] { "name",
                TextLineItemValue.builder().name(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void id() {
        TextLineItemValue value = TextLineItemValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        TextLineItemValue value = TextLineItemValue.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
