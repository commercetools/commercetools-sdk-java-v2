package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.payment.PaymentSetCustomTypeActionImpl;

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
@JsonDeserialize(as = PaymentSetCustomTypeActionImpl.class)
public interface PaymentSetCustomTypeAction extends PaymentUpdateAction {

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
    *  <p>Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static PaymentSetCustomTypeAction of(){
        return new PaymentSetCustomTypeActionImpl();
    }
    

    public static PaymentSetCustomTypeAction of(final PaymentSetCustomTypeAction template) {
        PaymentSetCustomTypeActionImpl instance = new PaymentSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static PaymentSetCustomTypeActionBuilder builder(){
        return PaymentSetCustomTypeActionBuilder.of();
    }
    
    public static PaymentSetCustomTypeActionBuilder builder(final PaymentSetCustomTypeAction template){
        return PaymentSetCustomTypeActionBuilder.of(template);
    }
    

    default <T> T withPaymentSetCustomTypeAction(Function<PaymentSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
