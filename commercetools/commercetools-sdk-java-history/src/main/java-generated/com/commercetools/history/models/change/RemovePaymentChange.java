
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
@JsonDeserialize(as = RemovePaymentChangeImpl.class)
public interface RemovePaymentChange extends Change {

    String REMOVE_PAYMENT_CHANGE = "RemovePaymentChange";

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

    public static RemovePaymentChange of() {
        return new RemovePaymentChangeImpl();
    }

    public static RemovePaymentChange of(final RemovePaymentChange template) {
        RemovePaymentChangeImpl instance = new RemovePaymentChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemovePaymentChangeBuilder builder() {
        return RemovePaymentChangeBuilder.of();
    }

    public static RemovePaymentChangeBuilder builder(final RemovePaymentChange template) {
        return RemovePaymentChangeBuilder.of(template);
    }

    default <T> T withRemovePaymentChange(Function<RemovePaymentChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemovePaymentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemovePaymentChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemovePaymentChange>";
            }
        };
    }
}
