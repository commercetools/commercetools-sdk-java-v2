
package com.commercetools.api.models.error;

import java.util.Collections;

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
public class PriceChangedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceChangedErrorBuilder builder) {
        PriceChangedError priceChangedError = builder.buildUnchecked();
        Assertions.assertThat(priceChangedError).isInstanceOf(PriceChangedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PriceChangedError.builder().message("message") },
                new Object[] { PriceChangedError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { PriceChangedError.builder().shipping(true) } };
    }

    @Test
    public void message() {
        PriceChangedError value = PriceChangedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void lineItems() {
        PriceChangedError value = PriceChangedError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void shipping() {
        PriceChangedError value = PriceChangedError.of();
        value.setShipping(true);
        Assertions.assertThat(value.getShipping()).isEqualTo(true);
    }
}
