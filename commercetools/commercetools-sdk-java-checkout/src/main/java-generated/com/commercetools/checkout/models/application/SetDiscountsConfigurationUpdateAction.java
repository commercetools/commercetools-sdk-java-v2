
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
 * SetDiscountsConfigurationUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountsConfigurationUpdateAction setDiscountsConfigurationUpdateAction = SetDiscountsConfigurationUpdateAction.builder()
 *             .discountsConfiguration(discountsConfigurationBuilder -> discountsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDiscountsConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDiscountsConfigurationUpdateActionImpl.class)
public interface SetDiscountsConfigurationUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetDiscountsConfigurationUpdateAction
     */
    String SET_DISCOUNTS_CONFIGURATION = "setDiscountsConfiguration";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>New discounts configuration for the Application.</p>
     * @return discountsConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("discountsConfiguration")
    public DiscountsConfiguration getDiscountsConfiguration();

    /**
     *  <p>New discounts configuration for the Application.</p>
     * @param discountsConfiguration value to be set
     */

    public void setDiscountsConfiguration(final DiscountsConfiguration discountsConfiguration);

    /**
     * factory method
     * @return instance of SetDiscountsConfigurationUpdateAction
     */
    public static SetDiscountsConfigurationUpdateAction of() {
        return new SetDiscountsConfigurationUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetDiscountsConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDiscountsConfigurationUpdateAction of(final SetDiscountsConfigurationUpdateAction template) {
        SetDiscountsConfigurationUpdateActionImpl instance = new SetDiscountsConfigurationUpdateActionImpl();
        instance.setDiscountsConfiguration(template.getDiscountsConfiguration());
        return instance;
    }

    public SetDiscountsConfigurationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetDiscountsConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDiscountsConfigurationUpdateAction deepCopy(
            @Nullable final SetDiscountsConfigurationUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetDiscountsConfigurationUpdateActionImpl instance = new SetDiscountsConfigurationUpdateActionImpl();
        instance.setDiscountsConfiguration(com.commercetools.checkout.models.application.DiscountsConfiguration
                .deepCopy(template.getDiscountsConfiguration()));
        return instance;
    }

    /**
     * builder factory method for SetDiscountsConfigurationUpdateAction
     * @return builder
     */
    public static SetDiscountsConfigurationUpdateActionBuilder builder() {
        return SetDiscountsConfigurationUpdateActionBuilder.of();
    }

    /**
     * create builder for SetDiscountsConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountsConfigurationUpdateActionBuilder builder(
            final SetDiscountsConfigurationUpdateAction template) {
        return SetDiscountsConfigurationUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDiscountsConfigurationUpdateAction(Function<SetDiscountsConfigurationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDiscountsConfigurationUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDiscountsConfigurationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetDiscountsConfigurationUpdateAction>";
            }
        };
    }
}
