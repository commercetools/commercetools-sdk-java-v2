
package com.commercetools.api.models.shipping_method;

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
public class ShippingMethodPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodPagedQueryResponseBuilder builder) {
        ShippingMethodPagedQueryResponse shippingMethodPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodPagedQueryResponse).isInstanceOf(ShippingMethodPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodPagedQueryResponse.builder().limit(7L) },
                new Object[] { ShippingMethodPagedQueryResponse.builder().count(2L) },
                new Object[] { ShippingMethodPagedQueryResponse.builder().total(1L) },
                new Object[] { ShippingMethodPagedQueryResponse.builder().offset(3L) },
                new Object[] { ShippingMethodPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.shipping_method.ShippingMethodImpl())) } };
    }

    @Test
    public void limit() {
        ShippingMethodPagedQueryResponse value = ShippingMethodPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        ShippingMethodPagedQueryResponse value = ShippingMethodPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ShippingMethodPagedQueryResponse value = ShippingMethodPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ShippingMethodPagedQueryResponse value = ShippingMethodPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        ShippingMethodPagedQueryResponse value = ShippingMethodPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingMethodImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingMethodImpl()));
    }
}
