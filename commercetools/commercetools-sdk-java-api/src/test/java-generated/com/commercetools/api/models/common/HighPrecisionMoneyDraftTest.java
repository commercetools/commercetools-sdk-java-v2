
package com.commercetools.api.models.common;

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
public class HighPrecisionMoneyDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(HighPrecisionMoneyDraftBuilder builder) {
        HighPrecisionMoneyDraft highPrecisionMoneyDraft = builder.buildUnchecked();
        Assertions.assertThat(highPrecisionMoneyDraft).isInstanceOf(HighPrecisionMoneyDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { HighPrecisionMoneyDraft.builder().fractionDigits(4) },
                new Object[] { HighPrecisionMoneyDraft.builder().preciseAmount(3L) },
                new Object[] { HighPrecisionMoneyDraft.builder().centAmount(3L) } };
    }

    @Test
    public void fractionDigits() {
        HighPrecisionMoneyDraft value = HighPrecisionMoneyDraft.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }

    @Test
    public void preciseAmount() {
        HighPrecisionMoneyDraft value = HighPrecisionMoneyDraft.of();
        value.setPreciseAmount(3L);
        Assertions.assertThat(value.getPreciseAmount()).isEqualTo(3L);
    }

    @Test
    public void centAmount() {
        HighPrecisionMoneyDraft value = HighPrecisionMoneyDraft.of();
        value.setCentAmount(3L);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3L);
    }
}
