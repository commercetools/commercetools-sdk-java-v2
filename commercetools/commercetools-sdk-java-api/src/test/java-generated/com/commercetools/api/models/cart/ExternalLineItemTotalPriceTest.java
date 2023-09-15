
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
public class ExternalLineItemTotalPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExternalLineItemTotalPriceBuilder builder) {
        ExternalLineItemTotalPrice externalLineItemTotalPrice = builder.buildUnchecked();
        Assertions.assertThat(externalLineItemTotalPrice).isInstanceOf(ExternalLineItemTotalPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ExternalLineItemTotalPrice.builder()
                        .price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { ExternalLineItemTotalPrice.builder()
                        .totalPrice(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void price() {
        ExternalLineItemTotalPrice value = ExternalLineItemTotalPrice.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void totalPrice() {
        ExternalLineItemTotalPrice value = ExternalLineItemTotalPrice.of();
        value.setTotalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
