
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generic type holding specific ShippingRateInputDraft types.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateInputDraft shippingRateInputDraft = ShippingRateInputDraft.classificationBuilder()
 *             key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputDraftImpl.class, visible = true)
@JsonDeserialize(as = ShippingRateInputDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingRateInputDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public ShippingRateInputDraft copyDeep();

    /**
     * factory method to create a deep copy of ShippingRateInputDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRateInputDraft deepCopy(@Nullable final ShippingRateInputDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ShippingRateInputDraftImpl)) {
            return template.copyDeep();
        }
        ShippingRateInputDraftImpl instance = new ShippingRateInputDraftImpl();
        return instance;
    }

    /**
     * builder for classification subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder classificationBuilder() {
        return com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder.of();
    }

    /**
     * builder for score subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder scoreBuilder() {
        return com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRateInputDraft(Function<ShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateInputDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateInputDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateInputDraft>";
            }
        };
    }
}
