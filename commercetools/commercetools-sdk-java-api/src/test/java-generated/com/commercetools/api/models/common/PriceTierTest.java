
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
public class PriceTierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceTierBuilder builder) {
        PriceTier priceTier = builder.buildUnchecked();
        Assertions.assertThat(priceTier).isInstanceOf(PriceTier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PriceTier.builder().minimumQuantity(1L) },
                new Object[] { PriceTier.builder().value(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void minimumQuantity() {
        PriceTier value = PriceTier.of();
        value.setMinimumQuantity(1L);
        Assertions.assertThat(value.getMinimumQuantity()).isEqualTo(1L);
    }

    @Test
    public void value() {
        PriceTier value = PriceTier.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
