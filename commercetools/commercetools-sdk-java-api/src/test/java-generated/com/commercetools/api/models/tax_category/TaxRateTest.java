
package com.commercetools.api.models.tax_category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxRateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxRateBuilder builder) {
        TaxRate taxRate = builder.buildUnchecked();
        Assertions.assertThat(taxRate).isInstanceOf(TaxRate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TaxRate.builder().id("id") },
                new Object[] { "key", TaxRate.builder().key("key") },
                new Object[] { "name", TaxRate.builder().name("name") },
                new Object[] { "amount", TaxRate.builder().amount(0.43789625) },
                new Object[] { "includedInPrice", TaxRate.builder().includedInPrice(true) },
                new Object[] { "country", TaxRate.builder().country("country") },
                new Object[] { "state", TaxRate.builder().state("state") },
                new Object[] { "subRates", TaxRate.builder()
                        .subRates(
                            Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl())) } };
    }

    @Test
    public void id() {
        TaxRate value = TaxRate.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        TaxRate value = TaxRate.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
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
        value.setSubRates(Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl()));
        Assertions.assertThat(value.getSubRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl()));
    }
}
