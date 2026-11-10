
package com.commercetools;

import static org.junit.jupiter.api.Assertions.*;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentMethodInfoDraft;

import org.junit.jupiter.api.Test;

public class PaymentMethodInfoMixinTest {
    @Test
    public void noCustomFieldTest() {
        var paymentMethodInfo = PaymentMethodInfo.builder()
                .paymentInterface("interface")
                .method("method")
                .name(LocalizedString.of())
                .build();

        assertInstanceOf(PaymentMethodInfoDraft.class, paymentMethodInfo.toDraft());
    }
}
