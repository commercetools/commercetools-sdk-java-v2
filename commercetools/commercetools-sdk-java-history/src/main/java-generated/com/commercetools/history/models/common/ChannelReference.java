
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelReference channelReference = ChannelReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("channel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelReferenceImpl.class)
public interface ChannelReference extends Reference {

    /**
     * discriminator value for ChannelReference
     */
    String CHANNEL = "channel";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ChannelReference
     */
    public static ChannelReference of() {
        return new ChannelReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ChannelReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelReference of(final ChannelReference template) {
        ChannelReferenceImpl instance = new ChannelReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public ChannelReference copyDeep();

    /**
     * factory method to create a deep copy of ChannelReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelReference deepCopy(@Nullable final ChannelReference template) {
        if (template == null) {
            return null;
        }
        ChannelReferenceImpl instance = new ChannelReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for ChannelReference
     * @return builder
     */
    public static ChannelReferenceBuilder builder() {
        return ChannelReferenceBuilder.of();
    }

    /**
     * create builder for ChannelReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelReferenceBuilder builder(final ChannelReference template) {
        return ChannelReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelReference(Function<ChannelReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelReference>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelReference>";
            }
        };
    }
}
