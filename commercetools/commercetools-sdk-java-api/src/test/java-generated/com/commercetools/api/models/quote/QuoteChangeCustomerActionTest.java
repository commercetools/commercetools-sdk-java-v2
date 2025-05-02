
package com.commercetools.api.models.quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteChangeCustomerActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteChangeCustomerActionBuilder builder) {
        QuoteChangeCustomerAction quoteChangeCustomerAction = builder.buildUnchecked();
        Assertions.assertThat(quoteChangeCustomerAction).isInstanceOf(QuoteChangeCustomerAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", QuoteChangeCustomerAction.builder()
                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void customer() {
        QuoteChangeCustomerAction value = QuoteChangeCustomerAction.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
