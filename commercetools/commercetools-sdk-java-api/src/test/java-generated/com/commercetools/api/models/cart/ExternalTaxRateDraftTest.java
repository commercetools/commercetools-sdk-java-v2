
package com.commercetools.api.models.cart;

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
public class ExternalTaxRateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExternalTaxRateDraftBuilder builder) {
        ExternalTaxRateDraft externalTaxRateDraft = builder.buildUnchecked();
        Assertions.assertThat(externalTaxRateDraft).isInstanceOf(ExternalTaxRateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExternalTaxRateDraft.builder().name("name") },
                new Object[] { ExternalTaxRateDraft.builder().amount(0.43789625) },
                new Object[] { ExternalTaxRateDraft.builder().includedInPrice(true) },
                new Object[] { ExternalTaxRateDraft.builder().country("country") },
                new Object[] { ExternalTaxRateDraft.builder().state("state") },
                new Object[] { ExternalTaxRateDraft.builder()
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
