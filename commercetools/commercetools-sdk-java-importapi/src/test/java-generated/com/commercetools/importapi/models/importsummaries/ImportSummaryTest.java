
package com.commercetools.importapi.models.importsummaries;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportSummaryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportSummaryBuilder builder) {
        ImportSummary importSummary = builder.buildUnchecked();
        Assertions.assertThat(importSummary).isInstanceOf(ImportSummary.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "states",
                        ImportSummary.builder()
                                .states(new com.commercetools.importapi.models.importsummaries.OperationStatesImpl()) },
                new Object[] { "total", ImportSummary.builder().total(1L) } };
    }

    @Test
    public void states() {
        ImportSummary value = ImportSummary.of();
        value.setStates(new com.commercetools.importapi.models.importsummaries.OperationStatesImpl());
        Assertions.assertThat(value.getStates())
                .isEqualTo(new com.commercetools.importapi.models.importsummaries.OperationStatesImpl());
    }

    @Test
    public void total() {
        ImportSummary value = ImportSummary.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }
}
