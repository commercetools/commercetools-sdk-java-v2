
package com.commercetools.api.models.quote_request;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class QuoteRequestChangeCustomerActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestChangeCustomerActionBuilder builder) {
        QuoteRequestChangeCustomerAction quoteRequestChangeCustomerAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestChangeCustomerAction).isInstanceOf(QuoteRequestChangeCustomerAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestChangeCustomerAction.builder()
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
