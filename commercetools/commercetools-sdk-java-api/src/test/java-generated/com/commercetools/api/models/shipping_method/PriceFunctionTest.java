
package com.commercetools.api.models.shipping_method;

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
public class PriceFunctionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceFunctionBuilder builder) {
        PriceFunction priceFunction = builder.buildUnchecked();
        Assertions.assertThat(priceFunction).isInstanceOf(PriceFunction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PriceFunction.builder().currencyCode("currencyCode") },
                new Object[] { PriceFunction.builder().function("function") } };
    }

    @Test
    public void currencyCode() {
        PriceFunction value = PriceFunction.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }

    @Test
    public void function() {
        PriceFunction value = PriceFunction.of();
        value.setFunction("function");
        Assertions.assertThat(value.getFunction()).isEqualTo("function");
    }
}
