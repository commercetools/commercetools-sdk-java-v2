
package com.commercetools.history.models.common;

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
        return new Object[][] { new Object[] { Money.builder().currencyCode("currencyCode") },
                new Object[] { Money.builder().centAmount(3) }, new Object[] { Money.builder().fractionDigits(4) },
                new Object[] { Money.builder()
                        .type(com.commercetools.history.models.common.MoneyType.findEnum("centPrecision")) } };
    }

    @Test
    public void currencyCode() {
        Money value = Money.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }

    @Test
    public void centAmount() {
        Money value = Money.of();
        value.setCentAmount(3);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3);
    }

    @Test
    public void fractionDigits() {
        Money value = Money.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }

    @Test
    public void type() {
        Money value = Money.of();
        value.setType(com.commercetools.history.models.common.MoneyType.findEnum("centPrecision"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.history.models.common.MoneyType.findEnum("centPrecision"));
    }
}
