
package com.commercetools.api.models.tax_category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxRateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxRateDraftBuilder builder) {
        TaxRateDraft taxRateDraft = builder.buildUnchecked();
        Assertions.assertThat(taxRateDraft).isInstanceOf(TaxRateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", TaxRateDraft.builder().name("name") },
                new Object[] { "amount", TaxRateDraft.builder().amount(0.43789625) },
                new Object[] { "includedInPrice", TaxRateDraft.builder().includedInPrice(true) },
                new Object[] { "country", TaxRateDraft.builder().country("country") },
                new Object[] { "state", TaxRateDraft.builder().state("state") },
                new Object[] { "subRates",
                        TaxRateDraft.builder()
                                .subRates(Collections
                                        .singletonList(new com.commercetools.api.models.tax_category.SubRateImpl())) },
                new Object[] { "key", TaxRateDraft.builder().key("key") } };
    }

    @Test
    public void name() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void amount() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setAmount(0.43789625);
        Assertions.assertThat(value.getAmount()).isEqualTo(0.43789625);
    }

    @Test
    public void includedInPrice() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setIncludedInPrice(true);
        Assertions.assertThat(value.getIncludedInPrice()).isEqualTo(true);
    }

    @Test
    public void country() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void subRates() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setSubRates(Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl()));
        Assertions.assertThat(value.getSubRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl()));
    }

    @Test
    public void key() {
        TaxRateDraft value = TaxRateDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
