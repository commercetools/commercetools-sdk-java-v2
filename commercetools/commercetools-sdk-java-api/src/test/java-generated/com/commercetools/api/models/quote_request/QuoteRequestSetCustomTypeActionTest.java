
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestSetCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestSetCustomTypeActionBuilder builder) {
        QuoteRequestSetCustomTypeAction quoteRequestSetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestSetCustomTypeAction).isInstanceOf(QuoteRequestSetCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        QuoteRequestSetCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", QuoteRequestSetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        QuoteRequestSetCustomTypeAction value = QuoteRequestSetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        QuoteRequestSetCustomTypeAction value = QuoteRequestSetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
