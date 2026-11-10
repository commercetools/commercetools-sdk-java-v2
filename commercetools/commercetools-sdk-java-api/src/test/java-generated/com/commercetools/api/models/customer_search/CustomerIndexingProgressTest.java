
package com.commercetools.api.models.customer_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerIndexingProgressTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerIndexingProgressBuilder builder) {
        CustomerIndexingProgress customerIndexingProgress = builder.buildUnchecked();
        Assertions.assertThat(customerIndexingProgress).isInstanceOf(CustomerIndexingProgress.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "indexed", CustomerIndexingProgress.builder().indexed(4) },
                new Object[] { "failed", CustomerIndexingProgress.builder().failed(9) },
                new Object[] { "estimatedTotal", CustomerIndexingProgress.builder().estimatedTotal(9) } };
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
