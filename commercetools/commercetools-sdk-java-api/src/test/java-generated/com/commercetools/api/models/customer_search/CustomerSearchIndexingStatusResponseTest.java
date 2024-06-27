
package com.commercetools.api.models.customer_search;

import java.time.ZonedDateTime;

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
public class CustomerSearchIndexingStatusResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSearchIndexingStatusResponseBuilder builder) {
        CustomerSearchIndexingStatusResponse customerSearchIndexingStatusResponse = builder.buildUnchecked();
        Assertions.assertThat(customerSearchIndexingStatusResponse)
                .isInstanceOf(CustomerSearchIndexingStatusResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSearchIndexingStatusResponse.builder()
                        .status(com.commercetools.api.models.project.CustomerIndexingStatus.findEnum("Scheduled")) },
                new Object[] { CustomerSearchIndexingStatusResponse.builder()
                        .states(new com.commercetools.api.models.customer_search.CustomerIndexingProgressImpl()) },
                new Object[] { CustomerSearchIndexingStatusResponse.builder()
                        .startedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CustomerSearchIndexingStatusResponse.builder()
                        .lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CustomerSearchIndexingStatusResponse.builder().retryCount(7) } };
    }

    @Test
    public void status() {
        CustomerSearchIndexingStatusResponse value = CustomerSearchIndexingStatusResponse.of();
        value.setStatus(com.commercetools.api.models.project.CustomerIndexingStatus.findEnum("Scheduled"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.CustomerIndexingStatus.findEnum("Scheduled"));
    }

    @Test
    public void states() {
        CustomerSearchIndexingStatusResponse value = CustomerSearchIndexingStatusResponse.of();
        value.setStates(new com.commercetools.api.models.customer_search.CustomerIndexingProgressImpl());
        Assertions.assertThat(value.getStates())
                .isEqualTo(new com.commercetools.api.models.customer_search.CustomerIndexingProgressImpl());
    }

    @Test
    public void startedAt() {
        CustomerSearchIndexingStatusResponse value = CustomerSearchIndexingStatusResponse.of();
        value.setStartedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        CustomerSearchIndexingStatusResponse value = CustomerSearchIndexingStatusResponse.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void retryCount() {
        CustomerSearchIndexingStatusResponse value = CustomerSearchIndexingStatusResponse.of();
        value.setRetryCount(7);
        Assertions.assertThat(value.getRetryCount()).isEqualTo(7);
    }
}
