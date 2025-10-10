
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetPaymentsConfigurationUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPaymentsConfigurationUpdateAction setPaymentsConfigurationUpdateAction = SetPaymentsConfigurationUpdateAction.builder()
 *             .paymentsConfiguration(paymentsConfigurationBuilder -> paymentsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPaymentsConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPaymentsConfigurationUpdateActionImpl.class)
public interface SetPaymentsConfigurationUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetPaymentsConfigurationUpdateAction
     */
    String SET_PAYMENTS_CONFIGURATION = "setPaymentsConfiguration";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>New payments configuration for the Application.</p>
     * @return paymentsConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentsConfiguration")
    public PaymentsConfiguration getPaymentsConfiguration();

    /**
     *  <p>New payments configuration for the Application.</p>
     * @param paymentsConfiguration value to be set
     */

    public void setPaymentsConfiguration(final PaymentsConfiguration paymentsConfiguration);

    /**
     * factory method
     * @return instance of SetPaymentsConfigurationUpdateAction
     */
    public static SetPaymentsConfigurationUpdateAction of() {
        return new SetPaymentsConfigurationUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetPaymentsConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPaymentsConfigurationUpdateAction of(final SetPaymentsConfigurationUpdateAction template) {
        SetPaymentsConfigurationUpdateActionImpl instance = new SetPaymentsConfigurationUpdateActionImpl();
        instance.setPaymentsConfiguration(template.getPaymentsConfiguration());
        return instance;
    }

    public SetPaymentsConfigurationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetPaymentsConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPaymentsConfigurationUpdateAction deepCopy(
            @Nullable final SetPaymentsConfigurationUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetPaymentsConfigurationUpdateActionImpl instance = new SetPaymentsConfigurationUpdateActionImpl();
        instance.setPaymentsConfiguration(com.commercetools.checkout.models.application.PaymentsConfiguration
                .deepCopy(template.getPaymentsConfiguration()));
        return instance;
    }

    /**
     * builder factory method for SetPaymentsConfigurationUpdateAction
     * @return builder
     */
    public static SetPaymentsConfigurationUpdateActionBuilder builder() {
        return SetPaymentsConfigurationUpdateActionBuilder.of();
    }

    /**
     * create builder for SetPaymentsConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPaymentsConfigurationUpdateActionBuilder builder(
            final SetPaymentsConfigurationUpdateAction template) {
        return SetPaymentsConfigurationUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPaymentsConfigurationUpdateAction(Function<SetPaymentsConfigurationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPaymentsConfigurationUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPaymentsConfigurationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetPaymentsConfigurationUpdateAction>";
            }
        };
    }
}
