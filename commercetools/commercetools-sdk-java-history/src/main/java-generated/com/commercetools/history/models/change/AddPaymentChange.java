
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.PaymentInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddPaymentChangeImpl.class)
public interface AddPaymentChange extends Change {

    String ADD_PAYMENT_CHANGE = "AddPaymentChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public PaymentInfo getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public PaymentInfo getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final PaymentInfo nextValue);

    public void setPreviousValue(final PaymentInfo previousValue);

    public static AddPaymentChange of() {
        return new AddPaymentChangeImpl();
    }

    public static AddPaymentChange of(final AddPaymentChange template) {
        AddPaymentChangeImpl instance = new AddPaymentChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static AddPaymentChangeBuilder builder() {
        return AddPaymentChangeBuilder.of();
    }

    public static AddPaymentChangeBuilder builder(final AddPaymentChange template) {
        return AddPaymentChangeBuilder.of(template);
    }

    default <T> T withAddPaymentChange(Function<AddPaymentChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddPaymentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPaymentChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPaymentChange>";
            }
        };
    }
}
