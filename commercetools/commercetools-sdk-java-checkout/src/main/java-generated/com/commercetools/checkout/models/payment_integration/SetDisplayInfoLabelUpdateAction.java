
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
 *  <p>Sets the display info label of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoLabelUpdateAction setDisplayInfoLabelUpdateAction = SetDisplayInfoLabelUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDisplayInfoLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDisplayInfoLabelUpdateActionImpl.class)
public interface SetDisplayInfoLabelUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetDisplayInfoLabelUpdateAction
     */
    String SET_DISPLAY_INFO_LABEL = "setDisplayInfoLabel";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return label
     */
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of SetDisplayInfoLabelUpdateAction
     */
    public static SetDisplayInfoLabelUpdateAction of() {
        return new SetDisplayInfoLabelUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDisplayInfoLabelUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDisplayInfoLabelUpdateAction of(final SetDisplayInfoLabelUpdateAction template) {
        SetDisplayInfoLabelUpdateActionImpl instance = new SetDisplayInfoLabelUpdateActionImpl();
        instance.setLabel(template.getLabel());
        return instance;
    }

    public SetDisplayInfoLabelUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDisplayInfoLabelUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDisplayInfoLabelUpdateAction deepCopy(@Nullable final SetDisplayInfoLabelUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDisplayInfoLabelUpdateActionImpl instance = new SetDisplayInfoLabelUpdateActionImpl();
        instance.setLabel(com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for SetDisplayInfoLabelUpdateAction
     * @return builder
     */
    public static SetDisplayInfoLabelUpdateActionBuilder builder() {
        return SetDisplayInfoLabelUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDisplayInfoLabelUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoLabelUpdateActionBuilder builder(final SetDisplayInfoLabelUpdateAction template) {
        return SetDisplayInfoLabelUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDisplayInfoLabelUpdateAction(Function<SetDisplayInfoLabelUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoLabelUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoLabelUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDisplayInfoLabelUpdateAction>";
            }
        };
    }
}
