
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
public class TaxPortionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxPortionDraftBuilder builder) {
        TaxPortionDraft taxPortionDraft = builder.buildUnchecked();
        Assertions.assertThat(taxPortionDraft).isInstanceOf(TaxPortionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxPortionDraft.builder().name("name") },
                new Object[] { TaxPortionDraft.builder().rate(0.45292872) }, new Object[] {
                        TaxPortionDraft.builder().amount(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void name() {
        TaxPortionDraft value = TaxPortionDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void rate() {
        TaxPortionDraft value = TaxPortionDraft.of();
        value.setRate(0.45292872);
        Assertions.assertThat(value.getRate()).isEqualTo(0.45292872);
    }

    @Test
    public void amount() {
        TaxPortionDraft value = TaxPortionDraft.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
