
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
public class HighPrecisionMoneyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(HighPrecisionMoneyBuilder builder) {
        HighPrecisionMoney highPrecisionMoney = builder.buildUnchecked();
        Assertions.assertThat(highPrecisionMoney).isInstanceOf(HighPrecisionMoney.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { HighPrecisionMoney.builder().preciseAmount(3L) },
                new Object[] { HighPrecisionMoney.builder().fractionDigits(4) } };
    }

    @Test
    public void preciseAmount() {
        HighPrecisionMoney value = HighPrecisionMoney.of();
        value.setPreciseAmount(3L);
        Assertions.assertThat(value.getPreciseAmount()).isEqualTo(3L);
    }

    @Test
    public void fractionDigits() {
        HighPrecisionMoney value = HighPrecisionMoney.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }
}
