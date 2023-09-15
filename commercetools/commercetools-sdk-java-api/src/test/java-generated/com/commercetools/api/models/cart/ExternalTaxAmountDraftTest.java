
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
public class ExternalTaxAmountDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExternalTaxAmountDraftBuilder builder) {
        ExternalTaxAmountDraft externalTaxAmountDraft = builder.buildUnchecked();
        Assertions.assertThat(externalTaxAmountDraft).isInstanceOf(ExternalTaxAmountDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ExternalTaxAmountDraft.builder()
                        .totalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { ExternalTaxAmountDraft.builder()
                        .taxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void totalGross() {
        ExternalTaxAmountDraft value = ExternalTaxAmountDraft.of();
        value.setTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalGross()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void taxRate() {
        ExternalTaxAmountDraft value = ExternalTaxAmountDraft.of();
        value.setTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
