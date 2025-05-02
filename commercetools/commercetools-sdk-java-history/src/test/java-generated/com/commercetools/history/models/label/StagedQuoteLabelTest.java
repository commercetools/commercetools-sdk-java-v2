
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteLabelBuilder builder) {
        StagedQuoteLabel stagedQuoteLabel = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteLabel).isInstanceOf(StagedQuoteLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StagedQuoteLabel.builder().key("key") },
                new Object[] { "customer",
                        StagedQuoteLabel.builder()
                                .customer(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "quoteRequest", StagedQuoteLabel.builder()
                        .quoteRequest(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void key() {
        StagedQuoteLabel value = StagedQuoteLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customer() {
        StagedQuoteLabel value = StagedQuoteLabel.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void quoteRequest() {
        StagedQuoteLabel value = StagedQuoteLabel.of();
        value.setQuoteRequest(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
