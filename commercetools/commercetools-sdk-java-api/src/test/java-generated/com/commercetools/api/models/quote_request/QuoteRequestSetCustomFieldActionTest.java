
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestSetCustomFieldActionBuilder builder) {
        QuoteRequestSetCustomFieldAction quoteRequestSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestSetCustomFieldAction).isInstanceOf(QuoteRequestSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", QuoteRequestSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", QuoteRequestSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        QuoteRequestSetCustomFieldAction value = QuoteRequestSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        QuoteRequestSetCustomFieldAction value = QuoteRequestSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
