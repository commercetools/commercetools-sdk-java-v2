
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
public class OutOfStockErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OutOfStockErrorBuilder builder) {
        OutOfStockError outOfStockError = builder.buildUnchecked();
        Assertions.assertThat(outOfStockError).isInstanceOf(OutOfStockError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OutOfStockError.builder().message("message") },
                new Object[] { OutOfStockError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { OutOfStockError.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void message() {
        OutOfStockError value = OutOfStockError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void lineItems() {
        OutOfStockError value = OutOfStockError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void skus() {
        OutOfStockError value = OutOfStockError.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
