
package com.commercetools.api.models.me;

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
public class MyPaymentDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentDraftBuilder builder) {
        MyPaymentDraft myPaymentDraft = builder.buildUnchecked();
        Assertions.assertThat(myPaymentDraft).isInstanceOf(MyPaymentDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        MyPaymentDraft.builder().amountPlanned(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { MyPaymentDraft.builder()
                        .paymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl()) },
                new Object[] { MyPaymentDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { MyPaymentDraft.builder()
                        .transaction(new com.commercetools.api.models.me.MyTransactionDraftImpl()) } };
    }

    @Test
    public void amountPlanned() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setAmountPlanned(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmountPlanned()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void paymentMethodInfo() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setPaymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
        Assertions.assertThat(value.getPaymentMethodInfo())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
    }

    @Test
    public void custom() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void transaction() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setTransaction(new com.commercetools.api.models.me.MyTransactionDraftImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.api.models.me.MyTransactionDraftImpl());
    }
}
