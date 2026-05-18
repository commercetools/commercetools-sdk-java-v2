
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * SetDisplayInfoUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoUpdateAction setDisplayInfoUpdateAction = SetDisplayInfoUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDisplayInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDisplayInfoUpdateActionImpl.class)
public interface SetDisplayInfoUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetDisplayInfoUpdateAction
     */
    String SET_DISPLAY_INFO = "setDisplayInfo";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return displayInfo
     */
    @Valid
    @JsonProperty("displayInfo")
    public DisplayInfo getDisplayInfo();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param displayInfo value to be set
     */

    public void setDisplayInfo(final DisplayInfo displayInfo);

    /**
     * factory method
     * @return instance of SetDisplayInfoUpdateAction
     */
    public static SetDisplayInfoUpdateAction of() {
        return new SetDisplayInfoUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDisplayInfoUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDisplayInfoUpdateAction of(final SetDisplayInfoUpdateAction template) {
        SetDisplayInfoUpdateActionImpl instance = new SetDisplayInfoUpdateActionImpl();
        instance.setDisplayInfo(template.getDisplayInfo());
        return instance;
    }

    public SetDisplayInfoUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDisplayInfoUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDisplayInfoUpdateAction deepCopy(@Nullable final SetDisplayInfoUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDisplayInfoUpdateActionImpl instance = new SetDisplayInfoUpdateActionImpl();
        instance.setDisplayInfo(
            com.commercetools.checkout.models.payment_integration.DisplayInfo.deepCopy(template.getDisplayInfo()));
        return instance;
    }

    /**
     * builder factory method for SetDisplayInfoUpdateAction
     * @return builder
     */
    public static SetDisplayInfoUpdateActionBuilder builder() {
        return SetDisplayInfoUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDisplayInfoUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoUpdateActionBuilder builder(final SetDisplayInfoUpdateAction template) {
        return SetDisplayInfoUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDisplayInfoUpdateAction(Function<SetDisplayInfoUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDisplayInfoUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDisplayInfoUpdateAction>";
            }
        };
    }
}
