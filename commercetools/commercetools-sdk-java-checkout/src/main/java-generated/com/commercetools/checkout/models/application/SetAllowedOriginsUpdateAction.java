
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
 * SetAllowedOriginsUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAllowedOriginsUpdateAction setAllowedOriginsUpdateAction = SetAllowedOriginsUpdateAction.builder()
 *             .allowedOrigins(allowedOriginsBuilder -> allowedOriginsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAllowedOrigins")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAllowedOriginsUpdateActionImpl.class)
public interface SetAllowedOriginsUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetAllowedOriginsUpdateAction
     */
    String SET_ALLOWED_ORIGINS = "setAllowedOrigins";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>New allowed origins configuration.</p>
     * @return allowedOrigins
     */
    @NotNull
    @Valid
    @JsonProperty("allowedOrigins")
    public AllowedOrigins getAllowedOrigins();

    /**
     *  <p>New allowed origins configuration.</p>
     * @param allowedOrigins value to be set
     */

    public void setAllowedOrigins(final AllowedOrigins allowedOrigins);

    /**
     * factory method
     * @return instance of SetAllowedOriginsUpdateAction
     */
    public static SetAllowedOriginsUpdateAction of() {
        return new SetAllowedOriginsUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetAllowedOriginsUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAllowedOriginsUpdateAction of(final SetAllowedOriginsUpdateAction template) {
        SetAllowedOriginsUpdateActionImpl instance = new SetAllowedOriginsUpdateActionImpl();
        instance.setAllowedOrigins(template.getAllowedOrigins());
        return instance;
    }

    public SetAllowedOriginsUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetAllowedOriginsUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAllowedOriginsUpdateAction deepCopy(@Nullable final SetAllowedOriginsUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetAllowedOriginsUpdateActionImpl instance = new SetAllowedOriginsUpdateActionImpl();
        instance.setAllowedOrigins(
            com.commercetools.checkout.models.application.AllowedOrigins.deepCopy(template.getAllowedOrigins()));
        return instance;
    }

    /**
     * builder factory method for SetAllowedOriginsUpdateAction
     * @return builder
     */
    public static SetAllowedOriginsUpdateActionBuilder builder() {
        return SetAllowedOriginsUpdateActionBuilder.of();
    }

    /**
     * create builder for SetAllowedOriginsUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAllowedOriginsUpdateActionBuilder builder(final SetAllowedOriginsUpdateAction template) {
        return SetAllowedOriginsUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAllowedOriginsUpdateAction(Function<SetAllowedOriginsUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAllowedOriginsUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAllowedOriginsUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetAllowedOriginsUpdateAction>";
            }
        };
    }
}
