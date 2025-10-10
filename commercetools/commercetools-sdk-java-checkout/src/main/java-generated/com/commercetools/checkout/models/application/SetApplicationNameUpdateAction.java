
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
 * SetApplicationNameUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationNameUpdateAction setApplicationNameUpdateAction = SetApplicationNameUpdateAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationNameUpdateActionImpl.class)
public interface SetApplicationNameUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationNameUpdateAction
     */
    String SET_NAME = "setName";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>New name to assign to the Application.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name to assign to the Application.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of SetApplicationNameUpdateAction
     */
    public static SetApplicationNameUpdateAction of() {
        return new SetApplicationNameUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationNameUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationNameUpdateAction of(final SetApplicationNameUpdateAction template) {
        SetApplicationNameUpdateActionImpl instance = new SetApplicationNameUpdateActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public SetApplicationNameUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationNameUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationNameUpdateAction deepCopy(@Nullable final SetApplicationNameUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationNameUpdateActionImpl instance = new SetApplicationNameUpdateActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for SetApplicationNameUpdateAction
     * @return builder
     */
    public static SetApplicationNameUpdateActionBuilder builder() {
        return SetApplicationNameUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationNameUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationNameUpdateActionBuilder builder(final SetApplicationNameUpdateAction template) {
        return SetApplicationNameUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationNameUpdateAction(Function<SetApplicationNameUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationNameUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationNameUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationNameUpdateAction>";
            }
        };
    }
}
