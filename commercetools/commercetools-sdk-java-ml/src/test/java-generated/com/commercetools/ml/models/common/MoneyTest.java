
package com.commercetools.ml.models.common;

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
public class MoneyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MoneyBuilder builder) {
        Money money = builder.buildUnchecked();
        Assertions.assertThat(money).isInstanceOf(Money.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Money.builder().centAmount(3L) },
                new Object[] { Money.builder().currencyCode("currencyCode") } };
    }

    @Test
    public void centAmount() {
        Money value = Money.of();
        value.setCentAmount(3L);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3L);
    }

    @Test
    public void currencyCode() {
        Money value = Money.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }
}
