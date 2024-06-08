
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChannelChangeKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelChangeKeyAction channelChangeKeyAction = ChannelChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelChangeKeyActionImpl.class)
public interface ChannelChangeKeyAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelChangeKeyAction
     */
    String CHANGE_KEY = "changeKey";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ChannelChangeKeyAction
     */
    public static ChannelChangeKeyAction of() {
        return new ChannelChangeKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelChangeKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelChangeKeyAction of(final ChannelChangeKeyAction template) {
        ChannelChangeKeyActionImpl instance = new ChannelChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelChangeKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelChangeKeyAction deepCopy(@Nullable final ChannelChangeKeyAction template) {
        if (template == null) {
            return null;
        }
        ChannelChangeKeyActionImpl instance = new ChannelChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ChannelChangeKeyAction
     * @return builder
     */
    public static ChannelChangeKeyActionBuilder builder() {
        return ChannelChangeKeyActionBuilder.of();
    }

    /**
     * create builder for ChannelChangeKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelChangeKeyActionBuilder builder(final ChannelChangeKeyAction template) {
        return ChannelChangeKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelChangeKeyAction(Function<ChannelChangeKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelChangeKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelChangeKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelChangeKeyAction>";
            }
        };
    }
}
