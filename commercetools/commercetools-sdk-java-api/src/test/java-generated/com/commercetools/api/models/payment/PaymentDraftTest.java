
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
public class PaymentDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentDraftBuilder builder) {
        PaymentDraft paymentDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentDraft).isInstanceOf(PaymentDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentDraft.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { PaymentDraft.builder().anonymousId("anonymousId") },
                new Object[] { PaymentDraft.builder().interfaceId("interfaceId") },
                new Object[] {
                        PaymentDraft.builder().amountPlanned(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { PaymentDraft.builder()
                        .paymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl()) },
                new Object[] { PaymentDraft.builder()
                        .paymentStatus(new com.commercetools.api.models.payment.PaymentStatusDraftImpl()) },
                new Object[] { PaymentDraft.builder()
                        .transactions(Collections
                                .singletonList(new com.commercetools.api.models.payment.TransactionDraftImpl())) },
                new Object[] {
                        PaymentDraft.builder()
                                .interfaceInteractions(Collections.singletonList(
                                    new com.commercetools.api.models.type.CustomFieldsDraftImpl())) },
                new Object[] {
                        PaymentDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { PaymentDraft.builder().key("key") } };
    }

    @Test
    public void customer() {
        PaymentDraft value = PaymentDraft.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void anonymousId() {
        PaymentDraft value = PaymentDraft.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void interfaceId() {
        PaymentDraft value = PaymentDraft.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }

    @Test
    public void amountPlanned() {
        PaymentDraft value = PaymentDraft.of();
        value.setAmountPlanned(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmountPlanned()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void paymentMethodInfo() {
        PaymentDraft value = PaymentDraft.of();
        value.setPaymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
        Assertions.assertThat(value.getPaymentMethodInfo())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
    }

    @Test
    public void paymentStatus() {
        PaymentDraft value = PaymentDraft.of();
        value.setPaymentStatus(new com.commercetools.api.models.payment.PaymentStatusDraftImpl());
        Assertions.assertThat(value.getPaymentStatus())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentStatusDraftImpl());
    }

    @Test
    public void transactions() {
        PaymentDraft value = PaymentDraft.of();
        value.setTransactions(
            Collections.singletonList(new com.commercetools.api.models.payment.TransactionDraftImpl()));
        Assertions.assertThat(value.getTransactions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.TransactionDraftImpl()));
    }

    @Test
    public void interfaceInteractions() {
        PaymentDraft value = PaymentDraft.of();
        value.setInterfaceInteractions(
            Collections.singletonList(new com.commercetools.api.models.type.CustomFieldsDraftImpl()));
        Assertions.assertThat(value.getInterfaceInteractions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.CustomFieldsDraftImpl()));
    }

    @Test
    public void custom() {
        PaymentDraft value = PaymentDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void key() {
        PaymentDraft value = PaymentDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
