
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
public class CentPrecisionMoneyDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CentPrecisionMoneyDraftBuilder builder) {
        CentPrecisionMoneyDraft centPrecisionMoneyDraft = builder.buildUnchecked();
        Assertions.assertThat(centPrecisionMoneyDraft).isInstanceOf(CentPrecisionMoneyDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CentPrecisionMoneyDraft.builder().fractionDigits(4) } };
    }

    @Test
    public void fractionDigits() {
        CentPrecisionMoneyDraft value = CentPrecisionMoneyDraft.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }
}
