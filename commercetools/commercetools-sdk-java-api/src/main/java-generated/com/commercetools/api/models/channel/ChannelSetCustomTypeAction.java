
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetCustomTypeAction channelSetCustomTypeAction = ChannelSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelSetCustomTypeActionImpl.class)
public interface ChannelSetCustomTypeAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Channel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Channel.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Channel.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the Channel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Channel.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Channel.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ChannelSetCustomTypeAction
     */
    public static ChannelSetCustomTypeAction of() {
        return new ChannelSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelSetCustomTypeAction of(final ChannelSetCustomTypeAction template) {
        ChannelSetCustomTypeActionImpl instance = new ChannelSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelSetCustomTypeAction deepCopy(@Nullable final ChannelSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ChannelSetCustomTypeActionImpl instance = new ChannelSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ChannelSetCustomTypeAction
     * @return builder
     */
    public static ChannelSetCustomTypeActionBuilder builder() {
        return ChannelSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ChannelSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetCustomTypeActionBuilder builder(final ChannelSetCustomTypeAction template) {
        return ChannelSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelSetCustomTypeAction(Function<ChannelSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetCustomTypeAction>";
            }
        };
    }
}
