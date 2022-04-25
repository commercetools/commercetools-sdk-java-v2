
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentUpdateImpl.class)
public interface PaymentUpdate
        extends com.commercetools.api.models.ResourceUpdate<PaymentUpdate, PaymentUpdateAction, PaymentUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<PaymentUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final PaymentUpdateAction... actions);

    public void setActions(final List<PaymentUpdateAction> actions);

    public static PaymentUpdate of() {
        return new PaymentUpdateImpl();
    }

    public static PaymentUpdate of(final PaymentUpdate template) {
        PaymentUpdateImpl instance = new PaymentUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static PaymentUpdateBuilder builder() {
        return PaymentUpdateBuilder.of();
    }

    public static PaymentUpdateBuilder builder(final PaymentUpdate template) {
        return PaymentUpdateBuilder.of(template);
    }

    default <T> T withPaymentUpdate(Function<PaymentUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentUpdate>";
            }
        };
    }
}
