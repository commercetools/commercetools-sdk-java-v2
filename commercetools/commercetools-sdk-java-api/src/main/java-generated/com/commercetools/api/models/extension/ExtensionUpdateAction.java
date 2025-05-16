
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ExtensionUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionUpdateAction extensionUpdateAction = ExtensionUpdateAction.changeDestinationBuilder()
 *             destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ExtensionUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ExtensionUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ExtensionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ExtensionUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ExtensionUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ExtensionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionUpdateAction deepCopy(@Nullable final ExtensionUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ExtensionUpdateActionImpl)) {
            return template.copyDeep();
        }
        ExtensionUpdateActionImpl instance = new ExtensionUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeDestination subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.ExtensionChangeDestinationActionBuilder changeDestinationBuilder() {
        return com.commercetools.api.models.extension.ExtensionChangeDestinationActionBuilder.of();
    }

    /**
     * builder for changeTriggers subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.ExtensionChangeTriggersActionBuilder changeTriggersBuilder() {
        return com.commercetools.api.models.extension.ExtensionChangeTriggersActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.ExtensionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.extension.ExtensionSetKeyActionBuilder.of();
    }

    /**
     * builder for setTimeoutInMs subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionBuilder setTimeoutInMsBuilder() {
        return com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionUpdateAction(Function<ExtensionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionUpdateAction>";
            }
        };
    }
}
