
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalTaxRateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExternalTaxRateDraftBuilder builder) {
        ExternalTaxRateDraft externalTaxRateDraft = builder.buildUnchecked();
        Assertions.assertThat(externalTaxRateDraft).isInstanceOf(ExternalTaxRateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ExternalTaxRateDraft.builder().name("name") },
                new Object[] { "amount", ExternalTaxRateDraft.builder().amount(0.43789625) },
                new Object[] { "includedInPrice", ExternalTaxRateDraft.builder().includedInPrice(true) },
                new Object[] { "country", ExternalTaxRateDraft.builder().country("country") },
                new Object[] { "state", ExternalTaxRateDraft.builder().state("state") },
                new Object[] { "subRates", ExternalTaxRateDraft.builder()
                        .subRates(
                            Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl())) } };
    }

    @Test
    public void name() {
        ExternalTaxRateDraft value = ExternalTaxRateDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void amount() {
        ExternalTaxRateDraft value = ExternalTaxRateDraft.of();
        value.setAmount(0.43789625);
        Assertions.assertThat(value.getAmount()).isEqualTo(0.43789625);
    }

    @Test
    public void includedInPrice() {
        ExternalTaxRateDraft value = ExternalTaxRateDraft.of();
        value.setIncludedInPrice(true);
        Assertions.assertThat(value.getIncludedInPrice()).isEqualTo(true);
    }

    @Test
    public void country() {
        ExternalTaxRateDraft value = ExternalTaxRateDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        ExternalTaxRateDraft value = ExternalTaxRateDraft.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void subRates() {
        ExternalTaxRateDraft value = ExternalTaxRateDraft.of();
        value.setSubRates(Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl()));
        Assertions.assertThat(value.getSubRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.tax_category.SubRateImpl()));
    }
}
