
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the status of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusUpdateAction setStatusUpdateAction = SetStatusUpdateAction.builder()
 *             .status(PaymentIntegrationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetStatusUpdateActionImpl.class)
public interface SetStatusUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetStatusUpdateAction
     */
    String SET_STATUS = "setStatus";

    /**
     *  <p>Value to set as the status of the PaymentIntegration.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public PaymentIntegrationStatus getStatus();

    /**
     *  <p>Value to set as the status of the PaymentIntegration.</p>
     * @param status value to be set
     */

    public void setStatus(final PaymentIntegrationStatus status);

    /**
     * factory method
     * @return instance of SetStatusUpdateAction
     */
    public static SetStatusUpdateAction of() {
        return new SetStatusUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStatusUpdateAction of(final SetStatusUpdateAction template) {
        SetStatusUpdateActionImpl instance = new SetStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public SetStatusUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStatusUpdateAction deepCopy(@Nullable final SetStatusUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetStatusUpdateActionImpl instance = new SetStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for SetStatusUpdateAction
     * @return builder
     */
    public static SetStatusUpdateActionBuilder builder() {
        return SetStatusUpdateActionBuilder.of();
    }

    /**
     * create builder for SetStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusUpdateActionBuilder builder(final SetStatusUpdateAction template) {
        return SetStatusUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStatusUpdateAction(Function<SetStatusUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStatusUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStatusUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetStatusUpdateAction>";
            }
        };
    }
}
