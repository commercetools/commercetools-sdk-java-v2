
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Channel. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelResourceIdentifier channelResourceIdentifier = ChannelResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("channel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelResourceIdentifierImpl.class)
public interface ChannelResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Channel> {

    /**
     * discriminator value for ChannelResourceIdentifier
     */
    String CHANNEL = "channel";

    /**
     *  <p>Unique identifier of the referenced Channel. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Channel. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Channel. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Channel. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ChannelResourceIdentifier
     */
    public static ChannelResourceIdentifier of() {
        return new ChannelResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ChannelResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelResourceIdentifier of(final ChannelResourceIdentifier template) {
        ChannelResourceIdentifierImpl instance = new ChannelResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public ChannelResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ChannelResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelResourceIdentifier deepCopy(@Nullable final ChannelResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ChannelResourceIdentifierImpl instance = new ChannelResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ChannelResourceIdentifier
     * @return builder
     */
    public static ChannelResourceIdentifierBuilder builder() {
        return ChannelResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ChannelResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelResourceIdentifierBuilder builder(final ChannelResourceIdentifier template) {
        return ChannelResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelResourceIdentifier(Function<ChannelResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelResourceIdentifier>";
            }
        };
    }
}
