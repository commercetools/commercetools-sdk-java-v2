
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a payment by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentKeyReferenceImpl.class)
public interface PaymentKeyReference extends KeyReference {

    String PAYMENT = "payment";

    public static PaymentKeyReference of() {
        return new PaymentKeyReferenceImpl();
    }

    public static PaymentKeyReference of(final PaymentKeyReference template) {
        PaymentKeyReferenceImpl instance = new PaymentKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentKeyReferenceBuilder builder() {
        return PaymentKeyReferenceBuilder.of();
    }

    public static PaymentKeyReferenceBuilder builder(final PaymentKeyReference template) {
        return PaymentKeyReferenceBuilder.of(template);
    }

    default <T> T withPaymentKeyReference(Function<PaymentKeyReference, T> helper) {
        return helper.apply(this);
    }
}
