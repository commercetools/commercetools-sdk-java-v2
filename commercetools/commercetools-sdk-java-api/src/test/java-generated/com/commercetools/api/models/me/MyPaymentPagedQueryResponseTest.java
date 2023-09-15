
package com.commercetools.api.models.me;

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
public class MyPaymentPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentPagedQueryResponseBuilder builder) {
        MyPaymentPagedQueryResponse myPaymentPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(myPaymentPagedQueryResponse).isInstanceOf(MyPaymentPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentPagedQueryResponse.builder().limit(7L) },
                new Object[] { MyPaymentPagedQueryResponse.builder().count(2L) },
                new Object[] { MyPaymentPagedQueryResponse.builder().total(1L) },
                new Object[] { MyPaymentPagedQueryResponse.builder().offset(3L) },
                new Object[] { MyPaymentPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentImpl())) } };
    }

    @Test
    public void limit() {
        MyPaymentPagedQueryResponse value = MyPaymentPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        MyPaymentPagedQueryResponse value = MyPaymentPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        MyPaymentPagedQueryResponse value = MyPaymentPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        MyPaymentPagedQueryResponse value = MyPaymentPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        MyPaymentPagedQueryResponse value = MyPaymentPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentImpl()));
    }
}
