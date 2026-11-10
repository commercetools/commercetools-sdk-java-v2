
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestChangeCustomerActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestChangeCustomerActionBuilder builder) {
        QuoteRequestChangeCustomerAction quoteRequestChangeCustomerAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestChangeCustomerAction).isInstanceOf(QuoteRequestChangeCustomerAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", QuoteRequestChangeCustomerAction.builder()
                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void customer() {
        QuoteRequestChangeCustomerAction value = QuoteRequestChangeCustomerAction.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
