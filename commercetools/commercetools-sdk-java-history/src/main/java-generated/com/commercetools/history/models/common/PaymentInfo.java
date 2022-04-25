
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentInfoImpl.class)
public interface PaymentInfo {

    @NotNull
    @Valid
    @JsonProperty("payments")
    public List<Reference> getPayments();

    @JsonIgnore
    public void setPayments(final Reference... payments);

    public void setPayments(final List<Reference> payments);

    public static PaymentInfo of() {
        return new PaymentInfoImpl();
    }

    public static PaymentInfo of(final PaymentInfo template) {
        PaymentInfoImpl instance = new PaymentInfoImpl();
        instance.setPayments(template.getPayments());
        return instance;
    }

    public static PaymentInfoBuilder builder() {
        return PaymentInfoBuilder.of();
    }

    public static PaymentInfoBuilder builder(final PaymentInfo template) {
        return PaymentInfoBuilder.of(template);
    }

    default <T> T withPaymentInfo(Function<PaymentInfo, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInfo>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInfo>";
            }
        };
    }
}
