
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
public class CustomerIndexingProgressTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerIndexingProgressBuilder builder) {
        CustomerIndexingProgress customerIndexingProgress = builder.buildUnchecked();
        Assertions.assertThat(customerIndexingProgress).isInstanceOf(CustomerIndexingProgress.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerIndexingProgress.builder().indexed(4) },
                new Object[] { CustomerIndexingProgress.builder().failed(9) },
                new Object[] { CustomerIndexingProgress.builder().estimatedTotal(9) } };
    }

    @Test
    public void indexed() {
        CustomerIndexingProgress value = CustomerIndexingProgress.of();
        value.setIndexed(4);
        Assertions.assertThat(value.getIndexed()).isEqualTo(4);
    }

    @Test
    public void failed() {
        CustomerIndexingProgress value = CustomerIndexingProgress.of();
        value.setFailed(9);
        Assertions.assertThat(value.getFailed()).isEqualTo(9);
    }

    @Test
    public void estimatedTotal() {
        CustomerIndexingProgress value = CustomerIndexingProgress.of();
        value.setEstimatedTotal(9);
        Assertions.assertThat(value.getEstimatedTotal()).isEqualTo(9);
    }
}
