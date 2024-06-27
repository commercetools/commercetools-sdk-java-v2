
package com.commercetools.api.models.customer_search;

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
public class CustomerSearchResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSearchResultBuilder builder) {
        CustomerSearchResult customerSearchResult = builder.buildUnchecked();
        Assertions.assertThat(customerSearchResult).isInstanceOf(CustomerSearchResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSearchResult.builder().id("id") },
                new Object[] { CustomerSearchResult.builder().relevance(0.5586561) } };
    }

    @Test
    public void id() {
        CustomerSearchResult value = CustomerSearchResult.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void relevance() {
        CustomerSearchResult value = CustomerSearchResult.of();
        value.setRelevance(0.5586561);
        Assertions.assertThat(value.getRelevance()).isEqualTo(0.5586561);
    }
}
