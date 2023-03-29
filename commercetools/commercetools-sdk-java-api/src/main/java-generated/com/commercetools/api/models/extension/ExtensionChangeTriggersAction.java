
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionChangeTriggersAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChangeTriggersAction extensionChangeTriggersAction = ExtensionChangeTriggersAction.builder()
 *             .plusTriggers(triggersBuilder -> triggersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionChangeTriggersActionImpl.class)
public interface ExtensionChangeTriggersAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionChangeTriggersAction
     */
    String CHANGE_TRIGGERS = "changeTriggers";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return triggers
     */
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param triggers values to be set
     */

    @JsonIgnore
    public void setTriggers(final ExtensionTrigger... triggers);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param triggers values to be set
     */

    public void setTriggers(final List<ExtensionTrigger> triggers);

    /**
     * factory method
     * @return instance of ExtensionChangeTriggersAction
     */
    public static ExtensionChangeTriggersAction of() {
        return new ExtensionChangeTriggersActionImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionChangeTriggersAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionChangeTriggersAction of(final ExtensionChangeTriggersAction template) {
        ExtensionChangeTriggersActionImpl instance = new ExtensionChangeTriggersActionImpl();
        instance.setTriggers(template.getTriggers());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExtensionChangeTriggersAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionChangeTriggersAction deepCopy(@Nullable final ExtensionChangeTriggersAction template) {
        if (template == null) {
            return null;
        }
        ExtensionChangeTriggersActionImpl instance = new ExtensionChangeTriggersActionImpl();
        instance.setTriggers(Optional.ofNullable(template.getTriggers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.extension.ExtensionTrigger::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ExtensionChangeTriggersAction
     * @return builder
     */
    public static ExtensionChangeTriggersActionBuilder builder() {
        return ExtensionChangeTriggersActionBuilder.of();
    }

    /**
     * create builder for ExtensionChangeTriggersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionChangeTriggersActionBuilder builder(final ExtensionChangeTriggersAction template) {
        return ExtensionChangeTriggersActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionChangeTriggersAction(Function<ExtensionChangeTriggersAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionChangeTriggersAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionChangeTriggersAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionChangeTriggersAction>";
            }
        };
    }
}
