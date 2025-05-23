
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
 * ChannelSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetCustomFieldAction channelSetCustomFieldAction = ChannelSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelSetCustomFieldActionImpl.class)
public interface ChannelSetCustomFieldAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ChannelSetCustomFieldAction
     */
    public static ChannelSetCustomFieldAction of() {
        return new ChannelSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelSetCustomFieldAction of(final ChannelSetCustomFieldAction template) {
        ChannelSetCustomFieldActionImpl instance = new ChannelSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ChannelSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of ChannelSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelSetCustomFieldAction deepCopy(@Nullable final ChannelSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ChannelSetCustomFieldActionImpl instance = new ChannelSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ChannelSetCustomFieldAction
     * @return builder
     */
    public static ChannelSetCustomFieldActionBuilder builder() {
        return ChannelSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ChannelSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetCustomFieldActionBuilder builder(final ChannelSetCustomFieldAction template) {
        return ChannelSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelSetCustomFieldAction(Function<ChannelSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static ChannelSetCustomFieldAction ofUnset(final String name) {
        return ChannelSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetCustomFieldAction>";
            }
        };
    }
}
