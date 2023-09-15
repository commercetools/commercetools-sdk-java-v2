
package com.commercetools.api.models.project;

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
public class SearchIndexingConfigurationValuesTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchIndexingConfigurationValuesBuilder builder) {
        SearchIndexingConfigurationValues searchIndexingConfigurationValues = builder.buildUnchecked();
        Assertions.assertThat(searchIndexingConfigurationValues).isInstanceOf(SearchIndexingConfigurationValues.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SearchIndexingConfigurationValues.builder()
                        .status(com.commercetools.api.models.project.SearchIndexingConfigurationStatus
                                .findEnum("Activated")) },
                new Object[] { SearchIndexingConfigurationValues.builder()
                        .lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { SearchIndexingConfigurationValues.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) } };
    }

    @Test
    public void status() {
        SearchIndexingConfigurationValues value = SearchIndexingConfigurationValues.of();
        value.setStatus(com.commercetools.api.models.project.SearchIndexingConfigurationStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(
                    com.commercetools.api.models.project.SearchIndexingConfigurationStatus.findEnum("Activated"));
    }

    @Test
    public void lastModifiedAt() {
        SearchIndexingConfigurationValues value = SearchIndexingConfigurationValues.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        SearchIndexingConfigurationValues value = SearchIndexingConfigurationValues.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }
}
