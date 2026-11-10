
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceFunctionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceFunctionBuilder builder) {
        PriceFunction priceFunction = builder.buildUnchecked();
        Assertions.assertThat(priceFunction).isInstanceOf(PriceFunction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "currencyCode", PriceFunction.builder().currencyCode("currencyCode") },
                new Object[] { "function", PriceFunction.builder().function("function") } };
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
