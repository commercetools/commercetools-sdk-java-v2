
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantBulkUpdateResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBulkUpdateResponseBuilder builder) {
        VariantBulkUpdateResponse variantBulkUpdateResponse = builder.buildUnchecked();
        Assertions.assertThat(variantBulkUpdateResponse).isInstanceOf(VariantBulkUpdateResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "successCount", VariantBulkUpdateResponse.builder().successCount(5) },
                new Object[] { "failureCount", VariantBulkUpdateResponse.builder().failureCount(5) },
                new Object[] { "results",
                        VariantBulkUpdateResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.variant.VariantBulkUpdateResultImpl())) } };
    }

    @Test
    public void successCount() {
        VariantBulkUpdateResponse value = VariantBulkUpdateResponse.of();
        value.setSuccessCount(5);
        Assertions.assertThat(value.getSuccessCount()).isEqualTo(5);
    }

    @Test
    public void failureCount() {
        VariantBulkUpdateResponse value = VariantBulkUpdateResponse.of();
        value.setFailureCount(5);
        Assertions.assertThat(value.getFailureCount()).isEqualTo(5);
    }

    @Test
    public void results() {
        VariantBulkUpdateResponse value = VariantBulkUpdateResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.variant.VariantBulkUpdateResultImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.variant.VariantBulkUpdateResultImpl()));
    }
}
