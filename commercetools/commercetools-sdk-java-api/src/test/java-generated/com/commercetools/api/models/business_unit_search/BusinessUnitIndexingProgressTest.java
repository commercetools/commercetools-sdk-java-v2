
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
public class BusinessUnitIndexingProgressTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitIndexingProgressBuilder builder) {
        BusinessUnitIndexingProgress businessUnitIndexingProgress = builder.buildUnchecked();
        Assertions.assertThat(businessUnitIndexingProgress).isInstanceOf(BusinessUnitIndexingProgress.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitIndexingProgress.builder().indexed(4) },
                new Object[] { BusinessUnitIndexingProgress.builder().failed(9) },
                new Object[] { BusinessUnitIndexingProgress.builder().estimatedTotal(9) } };
    }

    @Test
    public void indexed() {
        BusinessUnitIndexingProgress value = BusinessUnitIndexingProgress.of();
        value.setIndexed(4);
        Assertions.assertThat(value.getIndexed()).isEqualTo(4);
    }

    @Test
    public void failed() {
        BusinessUnitIndexingProgress value = BusinessUnitIndexingProgress.of();
        value.setFailed(9);
        Assertions.assertThat(value.getFailed()).isEqualTo(9);
    }

    @Test
    public void estimatedTotal() {
        BusinessUnitIndexingProgress value = BusinessUnitIndexingProgress.of();
        value.setEstimatedTotal(9);
        Assertions.assertThat(value.getEstimatedTotal()).isEqualTo(9);
    }
}
