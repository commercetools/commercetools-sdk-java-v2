
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
 *  <p>Sets the display info logo URL of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoLogoUrlUpdateAction setDisplayInfoLogoUrlUpdateAction = SetDisplayInfoLogoUrlUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDisplayInfoLogoUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDisplayInfoLogoUrlUpdateActionImpl.class)
public interface SetDisplayInfoLogoUrlUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetDisplayInfoLogoUrlUpdateAction
     */
    String SET_DISPLAY_INFO_LOGO_URL = "setDisplayInfoLogoUrl";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return logoUrl
     */
    @Valid
    @JsonProperty("logoUrl")
    public LocalizedString getLogoUrl();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param logoUrl value to be set
     */

    public void setLogoUrl(final LocalizedString logoUrl);

    /**
     * factory method
     * @return instance of SetDisplayInfoLogoUrlUpdateAction
     */
    public static SetDisplayInfoLogoUrlUpdateAction of() {
        return new SetDisplayInfoLogoUrlUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDisplayInfoLogoUrlUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDisplayInfoLogoUrlUpdateAction of(final SetDisplayInfoLogoUrlUpdateAction template) {
        SetDisplayInfoLogoUrlUpdateActionImpl instance = new SetDisplayInfoLogoUrlUpdateActionImpl();
        instance.setLogoUrl(template.getLogoUrl());
        return instance;
    }

    public SetDisplayInfoLogoUrlUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDisplayInfoLogoUrlUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDisplayInfoLogoUrlUpdateAction deepCopy(
            @Nullable final SetDisplayInfoLogoUrlUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDisplayInfoLogoUrlUpdateActionImpl instance = new SetDisplayInfoLogoUrlUpdateActionImpl();
        instance.setLogoUrl(com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getLogoUrl()));
        return instance;
    }

    /**
     * builder factory method for SetDisplayInfoLogoUrlUpdateAction
     * @return builder
     */
    public static SetDisplayInfoLogoUrlUpdateActionBuilder builder() {
        return SetDisplayInfoLogoUrlUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDisplayInfoLogoUrlUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoLogoUrlUpdateActionBuilder builder(final SetDisplayInfoLogoUrlUpdateAction template) {
        return SetDisplayInfoLogoUrlUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDisplayInfoLogoUrlUpdateAction(Function<SetDisplayInfoLogoUrlUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoLogoUrlUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoLogoUrlUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDisplayInfoLogoUrlUpdateAction>";
            }
        };
    }
}
