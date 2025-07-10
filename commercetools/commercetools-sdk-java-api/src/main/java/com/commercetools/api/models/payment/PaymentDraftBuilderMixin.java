
package com.commercetools.api.models.payment;

import javax.annotation.Nullable;

public interface PaymentDraftBuilderMixin {

    public PaymentDraftBuilder paymentMethodInfo(
            @Nullable final com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo);

    public default PaymentDraftBuilder paymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        return paymentMethodInfo(paymentMethodInfo.toDraft());
    }
}
