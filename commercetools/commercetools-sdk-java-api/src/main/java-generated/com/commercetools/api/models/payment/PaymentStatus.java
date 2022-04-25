
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentStatusImpl.class)
public interface PaymentStatus {

    /**
    *  <p>A code describing the current status returned by the interface that processes the payment.</p>
    */

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    /**
    *  <p>A text describing the current status returned by the interface that processes the payment.</p>
    */

    @JsonProperty("interfaceText")
    public String getInterfaceText();

    @Valid
    @JsonProperty("state")
    public StateReference getState();

    public void setInterfaceCode(final String interfaceCode);

    public void setInterfaceText(final String interfaceText);

    public void setState(final StateReference state);

    public static PaymentStatus of() {
        return new PaymentStatusImpl();
    }

    public static PaymentStatus of(final PaymentStatus template) {
        PaymentStatusImpl instance = new PaymentStatusImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(template.getState());
        return instance;
    }

    public static PaymentStatusBuilder builder() {
        return PaymentStatusBuilder.of();
    }

    public static PaymentStatusBuilder builder(final PaymentStatus template) {
        return PaymentStatusBuilder.of(template);
    }

    default <T> T withPaymentStatus(Function<PaymentStatus, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatus>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatus>";
            }
        };
    }
}
