
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteCustomerChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteCustomerChangedMessageBuilder builder) {
        QuoteCustomerChangedMessage quoteCustomerChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteCustomerChangedMessage).isInstanceOf(QuoteCustomerChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        QuoteCustomerChangedMessage.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "previousCustomer", QuoteCustomerChangedMessage.builder()
                        .previousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void customer() {
        QuoteCustomerChangedMessage value = QuoteCustomerChangedMessage.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void previousCustomer() {
        QuoteCustomerChangedMessage value = QuoteCustomerChangedMessage.of();
        value.setPreviousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getPreviousCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
