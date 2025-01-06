
package com.commercetools.api.models.business_unit_search;

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
public class BusinessUnitSearchIndexingStatusResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSearchIndexingStatusResponseBuilder builder) {
        BusinessUnitSearchIndexingStatusResponse businessUnitSearchIndexingStatusResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSearchIndexingStatusResponse)
                .isInstanceOf(BusinessUnitSearchIndexingStatusResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        BusinessUnitSearchIndexingStatusResponse.builder()
                                .status(com.commercetools.api.models.project.BusinessUnitIndexingStatus
                                        .findEnum("Scheduled")) },
                new Object[] { BusinessUnitSearchIndexingStatusResponse.builder()
                        .states(
                            new com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressImpl()) },
                new Object[] { BusinessUnitSearchIndexingStatusResponse.builder()
                        .startedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { BusinessUnitSearchIndexingStatusResponse.builder()
                        .lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { BusinessUnitSearchIndexingStatusResponse.builder().retryCount(7) } };
    }

    @Test
    public void status() {
        BusinessUnitSearchIndexingStatusResponse value = BusinessUnitSearchIndexingStatusResponse.of();
        value.setStatus(com.commercetools.api.models.project.BusinessUnitIndexingStatus.findEnum("Scheduled"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.BusinessUnitIndexingStatus.findEnum("Scheduled"));
    }

    @Test
    public void states() {
        BusinessUnitSearchIndexingStatusResponse value = BusinessUnitSearchIndexingStatusResponse.of();
        value.setStates(new com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressImpl());
        Assertions.assertThat(value.getStates())
                .isEqualTo(new com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressImpl());
    }

    @Test
    public void startedAt() {
        BusinessUnitSearchIndexingStatusResponse value = BusinessUnitSearchIndexingStatusResponse.of();
        value.setStartedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        BusinessUnitSearchIndexingStatusResponse value = BusinessUnitSearchIndexingStatusResponse.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void retryCount() {
        BusinessUnitSearchIndexingStatusResponse value = BusinessUnitSearchIndexingStatusResponse.of();
        value.setRetryCount(7);
        Assertions.assertThat(value.getRetryCount()).isEqualTo(7);
    }
}
