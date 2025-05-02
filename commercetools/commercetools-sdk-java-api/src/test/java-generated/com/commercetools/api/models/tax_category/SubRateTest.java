
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubRateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubRateBuilder builder) {
        SubRate subRate = builder.buildUnchecked();
        Assertions.assertThat(subRate).isInstanceOf(SubRate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", SubRate.builder().name("name") },
                new Object[] { "amount", SubRate.builder().amount(0.43789625) } };
    }

    @Test
    public void name() {
        SubRate value = SubRate.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void amount() {
        SubRate value = SubRate.of();
        value.setAmount(0.43789625);
        Assertions.assertThat(value.getAmount()).isEqualTo(0.43789625);
    }
}
