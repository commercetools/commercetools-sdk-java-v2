
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PayloadNotIncluded
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PayloadNotIncluded payloadNotIncluded = PayloadNotIncluded.builder()
 *             .reason("{reason}")
 *             .payloadType("{payloadType}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PayloadNotIncludedImpl.class)
public interface PayloadNotIncluded {

    /**
     *  <p>Reason the payload is not included. For example, the payload is too large, or its content is not supported by the Subscription destination.</p>
     * @return reason
     */
    @NotNull
    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Value of the <code>type</code> field in the original payload.</p>
     * @return payloadType
     */
    @NotNull
    @JsonProperty("payloadType")
    public String getPayloadType();

    /**
     *  <p>Reason the payload is not included. For example, the payload is too large, or its content is not supported by the Subscription destination.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     *  <p>Value of the <code>type</code> field in the original payload.</p>
     * @param payloadType value to be set
     */

    public void setPayloadType(final String payloadType);

    /**
     * factory method
     * @return instance of PayloadNotIncluded
     */
    public static PayloadNotIncluded of() {
        return new PayloadNotIncludedImpl();
    }

    /**
     * factory method to create a shallow copy PayloadNotIncluded
     * @param template instance to be copied
     * @return copy instance
     */
    public static PayloadNotIncluded of(final PayloadNotIncluded template) {
        PayloadNotIncludedImpl instance = new PayloadNotIncludedImpl();
        instance.setReason(template.getReason());
        instance.setPayloadType(template.getPayloadType());
        return instance;
    }

    /**
     * factory method to create a deep copy of PayloadNotIncluded
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PayloadNotIncluded deepCopy(@Nullable final PayloadNotIncluded template) {
        if (template == null) {
            return null;
        }
        PayloadNotIncludedImpl instance = new PayloadNotIncludedImpl();
        instance.setReason(template.getReason());
        instance.setPayloadType(template.getPayloadType());
        return instance;
    }

    /**
     * builder factory method for PayloadNotIncluded
     * @return builder
     */
    public static PayloadNotIncludedBuilder builder() {
        return PayloadNotIncludedBuilder.of();
    }

    /**
     * create builder for PayloadNotIncluded instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PayloadNotIncludedBuilder builder(final PayloadNotIncluded template) {
        return PayloadNotIncludedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPayloadNotIncluded(Function<PayloadNotIncluded, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PayloadNotIncluded> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PayloadNotIncluded>() {
            @Override
            public String toString() {
                return "TypeReference<PayloadNotIncluded>";
            }
        };
    }
}
