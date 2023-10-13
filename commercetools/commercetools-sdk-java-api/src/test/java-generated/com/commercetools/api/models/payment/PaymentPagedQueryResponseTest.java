
package com.commercetools.api.models.payment;

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
public class PaymentPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentPagedQueryResponseBuilder builder) {
        PaymentPagedQueryResponse paymentPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(paymentPagedQueryResponse).isInstanceOf(PaymentPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentPagedQueryResponse.builder().limit(7L) },
                new Object[] { PaymentPagedQueryResponse.builder().count(2L) },
                new Object[] { PaymentPagedQueryResponse.builder().total(1L) },
                new Object[] { PaymentPagedQueryResponse.builder().offset(3L) },
                new Object[] { PaymentPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.payment.PaymentImpl())) } };
    }

    @Test
    public void limit() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.payment.PaymentImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.PaymentImpl()));
    }
}
