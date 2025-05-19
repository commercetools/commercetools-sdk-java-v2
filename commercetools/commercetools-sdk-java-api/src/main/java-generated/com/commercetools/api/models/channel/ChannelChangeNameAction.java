
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ChannelChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelChangeNameAction channelChangeNameAction = ChannelChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelChangeNameActionImpl.class)
public interface ChannelChangeNameAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ChannelChangeNameAction
     */
    public static ChannelChangeNameAction of() {
        return new ChannelChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelChangeNameAction of(final ChannelChangeNameAction template) {
        ChannelChangeNameActionImpl instance = new ChannelChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public ChannelChangeNameAction copyDeep();

    /**
     * factory method to create a deep copy of ChannelChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelChangeNameAction deepCopy(@Nullable final ChannelChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ChannelChangeNameActionImpl instance = new ChannelChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for ChannelChangeNameAction
     * @return builder
     */
    public static ChannelChangeNameActionBuilder builder() {
        return ChannelChangeNameActionBuilder.of();
    }

    /**
     * create builder for ChannelChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelChangeNameActionBuilder builder(final ChannelChangeNameAction template) {
        return ChannelChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelChangeNameAction(Function<ChannelChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelChangeNameAction>";
            }
        };
    }
}
