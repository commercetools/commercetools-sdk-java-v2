
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Payment">Payment</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentReferenceImpl.class)
public interface PaymentReference extends Reference, com.commercetools.api.models.Identifiable<Payment> {

    String PAYMENT = "payment";

    /**
    *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for Payments.</p>
    */
    @Valid
    @JsonProperty("obj")
    public Payment getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Payment">Payment</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Payment obj);

    public void setId(final String id);

    public static PaymentReference of() {
        return new PaymentReferenceImpl();
    }

    public static PaymentReference of(final PaymentReference template) {
        PaymentReferenceImpl instance = new PaymentReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static PaymentReferenceBuilder builder() {
        return PaymentReferenceBuilder.of();
    }

    public static PaymentReferenceBuilder builder(final PaymentReference template) {
        return PaymentReferenceBuilder.of(template);
    }

    default <T> T withPaymentReference(Function<PaymentReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentReference>";
            }
        };
    }
}
