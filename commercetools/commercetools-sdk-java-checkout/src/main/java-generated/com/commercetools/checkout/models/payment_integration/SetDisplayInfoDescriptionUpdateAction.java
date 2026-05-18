
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the display info description of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoDescriptionUpdateAction setDisplayInfoDescriptionUpdateAction = SetDisplayInfoDescriptionUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDisplayInfoDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDisplayInfoDescriptionUpdateActionImpl.class)
public interface SetDisplayInfoDescriptionUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetDisplayInfoDescriptionUpdateAction
     */
    String SET_DISPLAY_INFO_DESCRIPTION = "setDisplayInfoDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
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
     * @return instance of SetDisplayInfoDescriptionUpdateAction
     */
    public static SetDisplayInfoDescriptionUpdateAction of() {
        return new SetDisplayInfoDescriptionUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDisplayInfoDescriptionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDisplayInfoDescriptionUpdateAction of(final SetDisplayInfoDescriptionUpdateAction template) {
        SetDisplayInfoDescriptionUpdateActionImpl instance = new SetDisplayInfoDescriptionUpdateActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public SetDisplayInfoDescriptionUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDisplayInfoDescriptionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDisplayInfoDescriptionUpdateAction deepCopy(
            @Nullable final SetDisplayInfoDescriptionUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDisplayInfoDescriptionUpdateActionImpl instance = new SetDisplayInfoDescriptionUpdateActionImpl();
        instance.setDescription(
            com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for SetDisplayInfoDescriptionUpdateAction
     * @return builder
     */
    public static SetDisplayInfoDescriptionUpdateActionBuilder builder() {
        return SetDisplayInfoDescriptionUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDisplayInfoDescriptionUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoDescriptionUpdateActionBuilder builder(
            final SetDisplayInfoDescriptionUpdateAction template) {
        return SetDisplayInfoDescriptionUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDisplayInfoDescriptionUpdateAction(Function<SetDisplayInfoDescriptionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoDescriptionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoDescriptionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDisplayInfoDescriptionUpdateAction>";
            }
        };
    }
}
