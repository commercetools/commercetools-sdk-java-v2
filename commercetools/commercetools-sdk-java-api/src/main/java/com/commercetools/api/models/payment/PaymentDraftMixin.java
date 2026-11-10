
package com.commercetools.api.models.payment;

import com.commercetools.api.models.WithKey;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.type.CustomFieldsDraft;

public interface PaymentDraftMixin extends WithKey {

    public default PaymentResourceIdentifier toResourceIdentifier() {
        if (getKey() != null)
            return PaymentResourceIdentifier.builder().key(getKey()).build();
        return null;
    }

    public void setCustom(final CustomFieldsDraft custom);

    public default void setCustom(final CustomFields custom) {
        this.setCustom(custom.toDraft());
    }

    public void setPaymentMethodInfo(final PaymentMethodInfoDraft paymentMethodInfo);

    public default void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo) {
        this.setPaymentMethodInfo(paymentMethodInfo.toDraft());
    }
}
