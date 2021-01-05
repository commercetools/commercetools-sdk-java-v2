package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentReferenceImpl.class)
public interface PaymentReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public Payment getObj();

    public void setObj(final Payment obj);

    public static PaymentReference of(){
        return new PaymentReferenceImpl();
    }
    

    public static PaymentReference of(final PaymentReference template) {
        PaymentReferenceImpl instance = new PaymentReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static PaymentReferenceBuilder builder(){
        return PaymentReferenceBuilder.of();
    }
    
    public static PaymentReferenceBuilder builder(final PaymentReference template){
        return PaymentReferenceBuilder.of(template);
    }
    

    default <T> T withPaymentReference(Function<PaymentReference, T> helper) {
        return helper.apply(this);
    }
}
