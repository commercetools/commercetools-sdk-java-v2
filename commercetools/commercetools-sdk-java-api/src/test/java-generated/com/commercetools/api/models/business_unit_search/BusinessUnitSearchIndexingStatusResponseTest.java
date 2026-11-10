
package com.commercetools.api.models.business_unit_search;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSearchIndexingStatusResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSearchIndexingStatusResponseBuilder builder) {
        BusinessUnitSearchIndexingStatusResponse businessUnitSearchIndexingStatusResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSearchIndexingStatusResponse)
                .isInstanceOf(BusinessUnitSearchIndexingStatusResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status",
                        BusinessUnitSearchIndexingStatusResponse.builder()
                                .status(com.commercetools.api.models.project.BusinessUnitIndexingStatus
                                        .findEnum("Scheduled")) },
                new Object[] { "states", BusinessUnitSearchIndexingStatusResponse.builder()
                        .states(
                            new com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressImpl()) },
                new Object[] { "startedAt",
                        BusinessUnitSearchIndexingStatusResponse.builder()
                                .startedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        BusinessUnitSearchIndexingStatusResponse.builder()
                                .lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "retryCount", BusinessUnitSearchIndexingStatusResponse.builder().retryCount(7) } };
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
