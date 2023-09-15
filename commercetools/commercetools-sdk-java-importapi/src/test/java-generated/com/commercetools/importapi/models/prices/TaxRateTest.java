
package com.commercetools.importapi.models.prices;

import java.util.Collections;

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
public class TaxRateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxRateBuilder builder) {
        TaxRate taxRate = builder.buildUnchecked();
        Assertions.assertThat(taxRate).isInstanceOf(TaxRate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxRate.builder().id("id") },
                new Object[] { TaxRate.builder().name("name") }, new Object[] { TaxRate.builder().amount(0.43789625) },
                new Object[] { TaxRate.builder().includedInPrice(true) },
                new Object[] { TaxRate.builder().country("country") },
                new Object[] { TaxRate.builder().state("state") },
                new Object[] { TaxRate.builder()
                        .subRates(
                            Collections.singletonList(new com.commercetools.importapi.models.prices.SubRateImpl())) } };
    }

    @Test
    public void id() {
        TaxRate value = TaxRate.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        TaxRate value = TaxRate.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void amount() {
        TaxRate value = TaxRate.of();
        value.setAmount(0.43789625);
        Assertions.assertThat(value.getAmount()).isEqualTo(0.43789625);
    }

    @Test
    public void includedInPrice() {
        TaxRate value = TaxRate.of();
        value.setIncludedInPrice(true);
        Assertions.assertThat(value.getIncludedInPrice()).isEqualTo(true);
    }

    @Test
    public void country() {
        TaxRate value = TaxRate.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        TaxRate value = TaxRate.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void subRates() {
        TaxRate value = TaxRate.of();
        value.setSubRates(Collections.singletonList(new com.commercetools.importapi.models.prices.SubRateImpl()));
        Assertions.assertThat(value.getSubRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.prices.SubRateImpl()));
    }
}
