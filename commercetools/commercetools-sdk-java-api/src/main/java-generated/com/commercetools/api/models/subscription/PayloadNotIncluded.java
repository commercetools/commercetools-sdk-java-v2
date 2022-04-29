
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PayloadNotIncludedImpl.class)
public interface PayloadNotIncluded {

    @NotNull
    @JsonProperty("reason")
    public String getReason();

    @NotNull
    @JsonProperty("payloadType")
    public String getPayloadType();

    public void setReason(final String reason);

    public void setPayloadType(final String payloadType);

    public static PayloadNotIncluded of() {
        return new PayloadNotIncludedImpl();
    }

    public static PayloadNotIncluded of(final PayloadNotIncluded template) {
        PayloadNotIncludedImpl instance = new PayloadNotIncludedImpl();
        instance.setReason(template.getReason());
        instance.setPayloadType(template.getPayloadType());
        return instance;
    }

    public static PayloadNotIncludedBuilder builder() {
        return PayloadNotIncludedBuilder.of();
    }

    public static PayloadNotIncludedBuilder builder(final PayloadNotIncluded template) {
        return PayloadNotIncludedBuilder.of(template);
    }

    default <T> T withPayloadNotIncluded(Function<PayloadNotIncluded, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PayloadNotIncluded> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PayloadNotIncluded>() {
            @Override
            public String toString() {
                return "TypeReference<PayloadNotIncluded>";
            }
        };
    }
}
