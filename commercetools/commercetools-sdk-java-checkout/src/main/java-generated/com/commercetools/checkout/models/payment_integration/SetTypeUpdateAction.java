
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
 *  <p>Sets the type of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTypeUpdateAction setTypeUpdateAction = SetTypeUpdateAction.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTypeUpdateActionImpl.class)
public interface SetTypeUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetTypeUpdateAction
     */
    String SET_TYPE = "setType";

    /**
     *  <p>Value to set as the type of the PaymentIntegration.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value to set as the type of the PaymentIntegration.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * factory method
     * @return instance of SetTypeUpdateAction
     */
    public static SetTypeUpdateAction of() {
        return new SetTypeUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTypeUpdateAction of(final SetTypeUpdateAction template) {
        SetTypeUpdateActionImpl instance = new SetTypeUpdateActionImpl();
        instance.setType(template.getType());
        return instance;
    }

    public SetTypeUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTypeUpdateAction deepCopy(@Nullable final SetTypeUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetTypeUpdateActionImpl instance = new SetTypeUpdateActionImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for SetTypeUpdateAction
     * @return builder
     */
    public static SetTypeUpdateActionBuilder builder() {
        return SetTypeUpdateActionBuilder.of();
    }

    /**
     * create builder for SetTypeUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTypeUpdateActionBuilder builder(final SetTypeUpdateAction template) {
        return SetTypeUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTypeUpdateAction(Function<SetTypeUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTypeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTypeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetTypeUpdateAction>";
            }
        };
    }
}
