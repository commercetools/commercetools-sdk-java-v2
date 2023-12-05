
package com.commercetools.api.models.cart;

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
public class TaxPortionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxPortionBuilder builder) {
        TaxPortion taxPortion = builder.buildUnchecked();
        Assertions.assertThat(taxPortion).isInstanceOf(TaxPortion.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxPortion.builder().name("name") },
                new Object[] { TaxPortion.builder().rate(0.45292872) }, new Object[] { TaxPortion.builder()
                        .amount(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) } };
    }

    @Test
    public void name() {
        TaxPortion value = TaxPortion.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void rate() {
        TaxPortion value = TaxPortion.of();
        value.setRate(0.45292872);
        Assertions.assertThat(value.getRate()).isEqualTo(0.45292872);
    }

    @Test
    public void amount() {
        TaxPortion value = TaxPortion.of();
        value.setAmount(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getAmount())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }
}
