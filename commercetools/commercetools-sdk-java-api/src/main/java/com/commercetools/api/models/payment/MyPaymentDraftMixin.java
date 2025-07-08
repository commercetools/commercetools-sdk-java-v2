
package com.commercetools.api.models.payment;

public interface MyPaymentDraftMixin {

    public void setPaymentMethodInfo(final PaymentMethodInfoDraft paymentMethodInfo);

    public default void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo) {
        this.setPaymentMethodInfo(paymentMethodInfo.toDraft());
    }
}
