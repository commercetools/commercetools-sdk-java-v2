
package com.commercetools.api.models.quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteSetCustomFieldActionBuilder builder) {
        QuoteSetCustomFieldAction quoteSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(quoteSetCustomFieldAction).isInstanceOf(QuoteSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", QuoteSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", QuoteSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        QuoteSetCustomFieldAction value = QuoteSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        QuoteSetCustomFieldAction value = QuoteSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
