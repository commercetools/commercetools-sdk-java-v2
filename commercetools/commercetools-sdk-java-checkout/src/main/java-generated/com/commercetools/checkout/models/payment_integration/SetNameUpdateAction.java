
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
 *  <p>Sets the name of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetNameUpdateAction setNameUpdateAction = SetNameUpdateAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetNameUpdateActionImpl.class)
public interface SetNameUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetNameUpdateAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set as the name of the PaymentIntegration.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Value to set as the name of the PaymentIntegration.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of SetNameUpdateAction
     */
    public static SetNameUpdateAction of() {
        return new SetNameUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetNameUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetNameUpdateAction of(final SetNameUpdateAction template) {
        SetNameUpdateActionImpl instance = new SetNameUpdateActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public SetNameUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetNameUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetNameUpdateAction deepCopy(@Nullable final SetNameUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetNameUpdateActionImpl instance = new SetNameUpdateActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for SetNameUpdateAction
     * @return builder
     */
    public static SetNameUpdateActionBuilder builder() {
        return SetNameUpdateActionBuilder.of();
    }

    /**
     * create builder for SetNameUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetNameUpdateActionBuilder builder(final SetNameUpdateAction template) {
        return SetNameUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetNameUpdateAction(Function<SetNameUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetNameUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetNameUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetNameUpdateAction>";
            }
        };
    }
}
