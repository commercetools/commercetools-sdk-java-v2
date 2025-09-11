
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Used by the <span>Import API</span> to identify a Channel.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelKeyReference channelKeyReference = ChannelKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("channel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelKeyReferenceImpl.class)
public interface ChannelKeyReference extends KeyReference {

    /**
     * discriminator value for ChannelKeyReference
     */
    String CHANNEL = "channel";

    /**
     *  <p>User-defined unique identifier of the referenced Channel.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the referenced Channel.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ChannelKeyReference
     */
    public static ChannelKeyReference of() {
        return new ChannelKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ChannelKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelKeyReference of(final ChannelKeyReference template) {
        ChannelKeyReferenceImpl instance = new ChannelKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ChannelKeyReference copyDeep();

    /**
     * factory method to create a deep copy of ChannelKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelKeyReference deepCopy(@Nullable final ChannelKeyReference template) {
        if (template == null) {
            return null;
        }
        ChannelKeyReferenceImpl instance = new ChannelKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ChannelKeyReference
     * @return builder
     */
    public static ChannelKeyReferenceBuilder builder() {
        return ChannelKeyReferenceBuilder.of();
    }

    /**
     * create builder for ChannelKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelKeyReferenceBuilder builder(final ChannelKeyReference template) {
        return ChannelKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelKeyReference(Function<ChannelKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelKeyReference>";
            }
        };
    }
}
