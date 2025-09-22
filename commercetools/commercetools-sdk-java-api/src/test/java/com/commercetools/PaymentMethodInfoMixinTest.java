package com.commercetools;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder;
import com.commercetools.api.models.payment.PaymentDraft;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentMethodInfoDraft;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
