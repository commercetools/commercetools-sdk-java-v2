
package com.commercetools.api.models.tax_category;

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
public class TaxRateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxRateDraftBuilder builder) {
        TaxRateDraft taxRateDraft = builder.buildUnchecked();
        Assertions.assertThat(taxRateDraft).isInstanceOf(TaxRateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxRateDraft.builder().name("name") },
                new Object[] { TaxRateDraft.builder().amount(0.43789625) },
                new Object[] { TaxRateDraft.builder().includedInPrice(true) },
                new Object[] { TaxRateDraft.builder().country("country") },
                new Object[] { TaxRateDraft.builder().state("state") },
                new Object[] {
                        TaxRateDraft.builder()
                                .subRates(Collections
                                        .singletonList(new com.commercetools.api.models.tax_category.SubRateImpl())) },
                new Object[] { TaxRateDraft.builder().key("key") } };
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
