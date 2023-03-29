
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetAddressAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetAddressAction channelSetAddressAction = ChannelSetAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelSetAddressActionImpl.class)
public interface ChannelSetAddressAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelSetAddressAction
     */
    String SET_ADDRESS = "setAddress";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of ChannelSetAddressAction
     */
    public static ChannelSetAddressAction of() {
        return new ChannelSetAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelSetAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelSetAddressAction of(final ChannelSetAddressAction template) {
        ChannelSetAddressActionImpl instance = new ChannelSetAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelSetAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelSetAddressAction deepCopy(@Nullable final ChannelSetAddressAction template) {
        if (template == null) {
            return null;
        }
        ChannelSetAddressActionImpl instance = new ChannelSetAddressActionImpl();
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChannelSetAddressAction
     * @return builder
     */
    public static ChannelSetAddressActionBuilder builder() {
        return ChannelSetAddressActionBuilder.of();
    }

    /**
     * create builder for ChannelSetAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetAddressActionBuilder builder(final ChannelSetAddressAction template) {
        return ChannelSetAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelSetAddressAction(Function<ChannelSetAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetAddressAction>";
            }
        };
    }
}
