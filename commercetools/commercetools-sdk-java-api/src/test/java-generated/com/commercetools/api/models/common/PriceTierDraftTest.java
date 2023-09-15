
package com.commercetools.api.models.common;

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
public class PriceTierDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceTierDraftBuilder builder) {
        PriceTierDraft priceTierDraft = builder.buildUnchecked();
        Assertions.assertThat(priceTierDraft).isInstanceOf(PriceTierDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PriceTierDraft.builder().minimumQuantity(1L) },
                new Object[] { PriceTierDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void minimumQuantity() {
        PriceTierDraft value = PriceTierDraft.of();
        value.setMinimumQuantity(1L);
        Assertions.assertThat(value.getMinimumQuantity()).isEqualTo(1L);
    }

    @Test
    public void value() {
        PriceTierDraft value = PriceTierDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
