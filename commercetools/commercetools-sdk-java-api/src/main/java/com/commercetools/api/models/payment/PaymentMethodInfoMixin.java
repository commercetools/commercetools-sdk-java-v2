
package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment_method.PaymentMethodToken;
import com.commercetools.api.models.type.CustomFields;

public interface PaymentMethodInfoMixin {

    public String getPaymentInterface();

    public String getMethod();

    public LocalizedString getName();

    public PaymentMethodToken getToken();

    public String getInterfaceAccount();

    public CustomFields getCustom();

    public default PaymentMethodInfoDraft toDraft() {
        return PaymentMethodInfoDraft.builder()
                .name(getName())
                .method(getMethod())
                .paymentInterface(getPaymentInterface())
                .token(getToken())
                .interfaceAccount(getInterfaceAccount())
                .custom(getCustom().toDraft())
                .build();
    }
}
