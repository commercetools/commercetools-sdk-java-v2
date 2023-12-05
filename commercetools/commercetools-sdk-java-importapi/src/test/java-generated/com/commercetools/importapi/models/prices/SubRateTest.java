
package com.commercetools.importapi.models.prices;

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
public class SubRateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubRateBuilder builder) {
        SubRate subRate = builder.buildUnchecked();
        Assertions.assertThat(subRate).isInstanceOf(SubRate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubRate.builder().name("name") },
                new Object[] { SubRate.builder().amount(0.43789625) } };
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
