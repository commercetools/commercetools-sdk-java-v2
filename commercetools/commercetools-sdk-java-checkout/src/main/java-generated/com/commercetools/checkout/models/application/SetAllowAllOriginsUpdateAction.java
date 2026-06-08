
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SetAllowAllOriginsUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAllowAllOriginsUpdateAction setAllowAllOriginsUpdateAction = SetAllowAllOriginsUpdateAction.builder()
 *             .allowAll(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAllowAllOrigins")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAllowAllOriginsUpdateActionImpl.class)
public interface SetAllowAllOriginsUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetAllowAllOriginsUpdateAction
     */
    String SET_ALLOW_ALL_ORIGINS = "setAllowAllOrigins";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Whether to allow all origins or not.</p>
     * @return allowAll
     */
    @NotNull
    @JsonProperty("allowAll")
    public Boolean getAllowAll();

    /**
     *  <p>Whether to allow all origins or not.</p>
     * @param allowAll value to be set
     */

    public void setAllowAll(final Boolean allowAll);

    /**
     * factory method
     * @return instance of SetAllowAllOriginsUpdateAction
     */
    public static SetAllowAllOriginsUpdateAction of() {
        return new SetAllowAllOriginsUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetAllowAllOriginsUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAllowAllOriginsUpdateAction of(final SetAllowAllOriginsUpdateAction template) {
        SetAllowAllOriginsUpdateActionImpl instance = new SetAllowAllOriginsUpdateActionImpl();
        instance.setAllowAll(template.getAllowAll());
        return instance;
    }

    public SetAllowAllOriginsUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetAllowAllOriginsUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAllowAllOriginsUpdateAction deepCopy(@Nullable final SetAllowAllOriginsUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetAllowAllOriginsUpdateActionImpl instance = new SetAllowAllOriginsUpdateActionImpl();
        instance.setAllowAll(template.getAllowAll());
        return instance;
    }

    /**
     * builder factory method for SetAllowAllOriginsUpdateAction
     * @return builder
     */
    public static SetAllowAllOriginsUpdateActionBuilder builder() {
        return SetAllowAllOriginsUpdateActionBuilder.of();
    }

    /**
     * create builder for SetAllowAllOriginsUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAllowAllOriginsUpdateActionBuilder builder(final SetAllowAllOriginsUpdateAction template) {
        return SetAllowAllOriginsUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAllowAllOriginsUpdateAction(Function<SetAllowAllOriginsUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAllowAllOriginsUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAllowAllOriginsUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetAllowAllOriginsUpdateAction>";
            }
        };
    }
}
