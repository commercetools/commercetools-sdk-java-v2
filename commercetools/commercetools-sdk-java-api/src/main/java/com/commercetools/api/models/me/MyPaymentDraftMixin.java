
package com.commercetools.api.models.me;

import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentMethodInfoDraft;

public interface MyPaymentDraftMixin {

    public void setPaymentMethodInfo(final PaymentMethodInfoDraft paymentMethodInfo);

    public default void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo) {
        this.setPaymentMethodInfo(paymentMethodInfo.toDraft());
    }
}
