
package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment_method.PaymentMethodToken;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.type.CustomFieldsMixin;

import java.util.Optional;

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
                .custom(Optional.ofNullable(getCustom()).map(CustomFieldsMixin::toDraft).orElse(null))
                .build();
    }
}
