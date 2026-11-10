
package com.commercetools.api.models.shipping_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodPagedQueryResponseBuilder builder) {
        ShippingMethodPagedQueryResponse shippingMethodPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodPagedQueryResponse).isInstanceOf(ShippingMethodPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ShippingMethodPagedQueryResponse.builder().limit(7L) },
                new Object[] { "count", ShippingMethodPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ShippingMethodPagedQueryResponse.builder().total(1L) },
                new Object[] { "offset", ShippingMethodPagedQueryResponse.builder().offset(3L) },
                new Object[] { "results",
                        ShippingMethodPagedQueryResponse.builder()
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
