
package com.commercetools.history.models.common;

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
public class PriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceBuilder builder) {
        Price price = builder.buildUnchecked();
        Assertions.assertThat(price).isInstanceOf(Price.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Price.builder().id("id") },
                new Object[] { Price.builder().value(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void id() {
        Price value = Price.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void value() {
        Price value = Price.of();
        value.setValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
