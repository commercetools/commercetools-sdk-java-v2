
package com.commercetools.api.models.business_unit_search;

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
public class BusinessUnitSearchResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSearchResultBuilder builder) {
        BusinessUnitSearchResult businessUnitSearchResult = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSearchResult).isInstanceOf(BusinessUnitSearchResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitSearchResult.builder().id("id") },
                new Object[] { BusinessUnitSearchResult.builder().relevance(0.5586561) } };
    }

    @Test
    public void id() {
        BusinessUnitSearchResult value = BusinessUnitSearchResult.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void relevance() {
        BusinessUnitSearchResult value = BusinessUnitSearchResult.of();
        value.setRelevance(0.5586561);
        Assertions.assertThat(value.getRelevance()).isEqualTo(0.5586561);
    }
}
