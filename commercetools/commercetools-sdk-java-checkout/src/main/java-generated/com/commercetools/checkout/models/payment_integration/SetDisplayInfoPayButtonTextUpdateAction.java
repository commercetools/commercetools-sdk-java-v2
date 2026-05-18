
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
 *  <p>Sets the display info pay button text of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoPayButtonTextUpdateAction setDisplayInfoPayButtonTextUpdateAction = SetDisplayInfoPayButtonTextUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDisplayInfoPayButtonText")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDisplayInfoPayButtonTextUpdateActionImpl.class)
public interface SetDisplayInfoPayButtonTextUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetDisplayInfoPayButtonTextUpdateAction
     */
    String SET_DISPLAY_INFO_PAY_BUTTON_TEXT = "setDisplayInfoPayButtonText";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return payButtonText
     */
    @Valid
    @JsonProperty("payButtonText")
    public LocalizedString getPayButtonText();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param payButtonText value to be set
     */

    public void setPayButtonText(final LocalizedString payButtonText);

    /**
     * factory method
     * @return instance of SetDisplayInfoPayButtonTextUpdateAction
     */
    public static SetDisplayInfoPayButtonTextUpdateAction of() {
        return new SetDisplayInfoPayButtonTextUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDisplayInfoPayButtonTextUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDisplayInfoPayButtonTextUpdateAction of(final SetDisplayInfoPayButtonTextUpdateAction template) {
        SetDisplayInfoPayButtonTextUpdateActionImpl instance = new SetDisplayInfoPayButtonTextUpdateActionImpl();
        instance.setPayButtonText(template.getPayButtonText());
        return instance;
    }

    public SetDisplayInfoPayButtonTextUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDisplayInfoPayButtonTextUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDisplayInfoPayButtonTextUpdateAction deepCopy(
            @Nullable final SetDisplayInfoPayButtonTextUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDisplayInfoPayButtonTextUpdateActionImpl instance = new SetDisplayInfoPayButtonTextUpdateActionImpl();
        instance.setPayButtonText(
            com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getPayButtonText()));
        return instance;
    }

    /**
     * builder factory method for SetDisplayInfoPayButtonTextUpdateAction
     * @return builder
     */
    public static SetDisplayInfoPayButtonTextUpdateActionBuilder builder() {
        return SetDisplayInfoPayButtonTextUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDisplayInfoPayButtonTextUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoPayButtonTextUpdateActionBuilder builder(
            final SetDisplayInfoPayButtonTextUpdateAction template) {
        return SetDisplayInfoPayButtonTextUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDisplayInfoPayButtonTextUpdateAction(
            Function<SetDisplayInfoPayButtonTextUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoPayButtonTextUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoPayButtonTextUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDisplayInfoPayButtonTextUpdateAction>";
            }
        };
    }
}
