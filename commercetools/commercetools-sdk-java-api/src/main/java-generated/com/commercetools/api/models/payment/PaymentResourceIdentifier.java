
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Payment">Payment</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentResourceIdentifierImpl.class)
public interface PaymentResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Payment> {

    String PAYMENT = "payment";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Payment">Payment</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:Payment">Payment</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static PaymentResourceIdentifier of() {
        return new PaymentResourceIdentifierImpl();
    }

    public static PaymentResourceIdentifier of(final PaymentResourceIdentifier template) {
        PaymentResourceIdentifierImpl instance = new PaymentResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentResourceIdentifierBuilder builder() {
        return PaymentResourceIdentifierBuilder.of();
    }

    public static PaymentResourceIdentifierBuilder builder(final PaymentResourceIdentifier template) {
        return PaymentResourceIdentifierBuilder.of(template);
    }

    default <T> T withPaymentResourceIdentifier(Function<PaymentResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentResourceIdentifier>";
            }
        };
    }
}
