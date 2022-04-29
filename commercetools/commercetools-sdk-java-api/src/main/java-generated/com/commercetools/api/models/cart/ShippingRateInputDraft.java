
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ClassificationShippingRateInputDraftImpl.class, name = ClassificationShippingRateInputDraft.CLASSIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ScoreShippingRateInputDraftImpl.class, name = ScoreShippingRateInputDraft.SCORE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputDraftImpl.class, visible = true)
@JsonDeserialize(as = ShippingRateInputDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateInputDraft {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder classificationBuilder() {
        return com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder.of();
    }

    public static com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder scoreBuilder() {
        return com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder.of();
    }

    default <T> T withShippingRateInputDraft(Function<ShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateInputDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateInputDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateInputDraft>";
            }
        };
    }
}
