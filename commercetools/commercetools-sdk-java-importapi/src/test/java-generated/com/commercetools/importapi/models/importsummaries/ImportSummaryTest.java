
package com.commercetools.importapi.models.importsummaries;

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
public class ImportSummaryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportSummaryBuilder builder) {
        ImportSummary importSummary = builder.buildUnchecked();
        Assertions.assertThat(importSummary).isInstanceOf(ImportSummary.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportSummary.builder()
                        .states(new com.commercetools.importapi.models.importsummaries.OperationStatesImpl()) },
                new Object[] { ImportSummary.builder().total(1L) } };
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
