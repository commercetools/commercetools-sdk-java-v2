
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestLabelBuilder builder) {
        QuoteRequestLabel quoteRequestLabel = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestLabel).isInstanceOf(QuoteRequestLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", QuoteRequestLabel.builder().key("key") }, new Object[] {
                "customer",
                QuoteRequestLabel.builder().customer(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void key() {
        QuoteRequestLabel value = QuoteRequestLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customer() {
        QuoteRequestLabel value = QuoteRequestLabel.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
