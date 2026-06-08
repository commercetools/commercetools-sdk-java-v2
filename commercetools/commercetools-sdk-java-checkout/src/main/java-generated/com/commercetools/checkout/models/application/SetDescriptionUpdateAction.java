
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetDescriptionUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDescriptionUpdateAction setDescriptionUpdateAction = SetDescriptionUpdateAction.builder()
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDescriptionUpdateActionImpl.class)
public interface SetDescriptionUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetDescriptionUpdateAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of SetDescriptionUpdateAction
     */
    public static SetDescriptionUpdateAction of() {
        return new SetDescriptionUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDescriptionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDescriptionUpdateAction of(final SetDescriptionUpdateAction template) {
        SetDescriptionUpdateActionImpl instance = new SetDescriptionUpdateActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public SetDescriptionUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDescriptionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDescriptionUpdateAction deepCopy(@Nullable final SetDescriptionUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDescriptionUpdateActionImpl instance = new SetDescriptionUpdateActionImpl();
        instance.setDescription(
            com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for SetDescriptionUpdateAction
     * @return builder
     */
    public static SetDescriptionUpdateActionBuilder builder() {
        return SetDescriptionUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDescriptionUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDescriptionUpdateActionBuilder builder(final SetDescriptionUpdateAction template) {
        return SetDescriptionUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDescriptionUpdateAction(Function<SetDescriptionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDescriptionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDescriptionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDescriptionUpdateAction>";
            }
        };
    }
}
