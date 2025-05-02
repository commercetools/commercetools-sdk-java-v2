
package com.commercetools.api.models.business_unit_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitIndexingProgressTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitIndexingProgressBuilder builder) {
        BusinessUnitIndexingProgress businessUnitIndexingProgress = builder.buildUnchecked();
        Assertions.assertThat(businessUnitIndexingProgress).isInstanceOf(BusinessUnitIndexingProgress.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "indexed", BusinessUnitIndexingProgress.builder().indexed(4) },
                new Object[] { "failed", BusinessUnitIndexingProgress.builder().failed(9) },
                new Object[] { "estimatedTotal", BusinessUnitIndexingProgress.builder().estimatedTotal(9) } };
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
