
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
 * RemoveAllowedOriginUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAllowedOriginUpdateAction removeAllowedOriginUpdateAction = RemoveAllowedOriginUpdateAction.builder()
 *             .origin("{origin}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeAllowedOrigin")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveAllowedOriginUpdateActionImpl.class)
public interface RemoveAllowedOriginUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for RemoveAllowedOriginUpdateAction
     */
    String REMOVE_ALLOWED_ORIGIN = "removeAllowedOrigin";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Origin URL to remove from the allowed origins list.</p>
     * @return origin
     */
    @NotNull
    @JsonProperty("origin")
    public String getOrigin();

    /**
     *  <p>Origin URL to remove from the allowed origins list.</p>
     * @param origin value to be set
     */

    public void setOrigin(final String origin);

    /**
     * factory method
     * @return instance of RemoveAllowedOriginUpdateAction
     */
    public static RemoveAllowedOriginUpdateAction of() {
        return new RemoveAllowedOriginUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RemoveAllowedOriginUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveAllowedOriginUpdateAction of(final RemoveAllowedOriginUpdateAction template) {
        RemoveAllowedOriginUpdateActionImpl instance = new RemoveAllowedOriginUpdateActionImpl();
        instance.setOrigin(template.getOrigin());
        return instance;
    }

    public RemoveAllowedOriginUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RemoveAllowedOriginUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveAllowedOriginUpdateAction deepCopy(@Nullable final RemoveAllowedOriginUpdateAction template) {
        if (template == null) {
            return null;
        }
        RemoveAllowedOriginUpdateActionImpl instance = new RemoveAllowedOriginUpdateActionImpl();
        instance.setOrigin(template.getOrigin());
        return instance;
    }

    /**
     * builder factory method for RemoveAllowedOriginUpdateAction
     * @return builder
     */
    public static RemoveAllowedOriginUpdateActionBuilder builder() {
        return RemoveAllowedOriginUpdateActionBuilder.of();
    }

    /**
     * create builder for RemoveAllowedOriginUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAllowedOriginUpdateActionBuilder builder(final RemoveAllowedOriginUpdateAction template) {
        return RemoveAllowedOriginUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveAllowedOriginUpdateAction(Function<RemoveAllowedOriginUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveAllowedOriginUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveAllowedOriginUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveAllowedOriginUpdateAction>";
            }
        };
    }
}
