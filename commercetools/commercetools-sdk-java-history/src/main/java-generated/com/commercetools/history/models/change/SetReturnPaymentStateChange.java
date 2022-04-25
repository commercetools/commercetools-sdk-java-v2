
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ReturnPaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetReturnPaymentStateChangeImpl.class)
public interface SetReturnPaymentStateChange extends Change {

    String SET_RETURN_PAYMENT_STATE_CHANGE = "SetReturnPaymentStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setReturnPaymentState</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("nextValue")
    public ReturnPaymentState getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public ReturnPaymentState getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ReturnPaymentState nextValue);

    public void setPreviousValue(final ReturnPaymentState previousValue);

    public static SetReturnPaymentStateChange of() {
        return new SetReturnPaymentStateChangeImpl();
    }

    public static SetReturnPaymentStateChange of(final SetReturnPaymentStateChange template) {
        SetReturnPaymentStateChangeImpl instance = new SetReturnPaymentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetReturnPaymentStateChangeBuilder builder() {
        return SetReturnPaymentStateChangeBuilder.of();
    }

    public static SetReturnPaymentStateChangeBuilder builder(final SetReturnPaymentStateChange template) {
        return SetReturnPaymentStateChangeBuilder.of(template);
    }

    default <T> T withSetReturnPaymentStateChange(Function<SetReturnPaymentStateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnPaymentStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnPaymentStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnPaymentStateChange>";
            }
        };
    }
}
