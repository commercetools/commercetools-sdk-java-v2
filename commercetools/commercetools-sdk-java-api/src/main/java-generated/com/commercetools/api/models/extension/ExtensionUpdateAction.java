
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionChangeDestinationActionImpl.class, name = ExtensionChangeDestinationAction.CHANGE_DESTINATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionChangeTriggersActionImpl.class, name = ExtensionChangeTriggersAction.CHANGE_TRIGGERS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionSetKeyActionImpl.class, name = ExtensionSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionImpl.class, name = ExtensionSetTimeoutInMsAction.SET_TIMEOUT_IN_MS) })
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
