
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
 * AddAllowedOriginUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAllowedOriginUpdateAction addAllowedOriginUpdateAction = AddAllowedOriginUpdateAction.builder()
 *             .origin("{origin}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addAllowedOrigin")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddAllowedOriginUpdateActionImpl.class)
public interface AddAllowedOriginUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for AddAllowedOriginUpdateAction
     */
    String ADD_ALLOWED_ORIGIN = "addAllowedOrigin";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Origin URL to add to the allowed origins list.</p>
     * @return origin
     */
    @NotNull
    @JsonProperty("origin")
    public String getOrigin();

    /**
     *  <p>Origin URL to add to the allowed origins list.</p>
     * @param origin value to be set
     */

    public void setOrigin(final String origin);

    /**
     * factory method
     * @return instance of AddAllowedOriginUpdateAction
     */
    public static AddAllowedOriginUpdateAction of() {
        return new AddAllowedOriginUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy AddAllowedOriginUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddAllowedOriginUpdateAction of(final AddAllowedOriginUpdateAction template) {
        AddAllowedOriginUpdateActionImpl instance = new AddAllowedOriginUpdateActionImpl();
        instance.setOrigin(template.getOrigin());
        return instance;
    }

    public AddAllowedOriginUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of AddAllowedOriginUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddAllowedOriginUpdateAction deepCopy(@Nullable final AddAllowedOriginUpdateAction template) {
        if (template == null) {
            return null;
        }
        AddAllowedOriginUpdateActionImpl instance = new AddAllowedOriginUpdateActionImpl();
        instance.setOrigin(template.getOrigin());
        return instance;
    }

    /**
     * builder factory method for AddAllowedOriginUpdateAction
     * @return builder
     */
    public static AddAllowedOriginUpdateActionBuilder builder() {
        return AddAllowedOriginUpdateActionBuilder.of();
    }

    /**
     * create builder for AddAllowedOriginUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAllowedOriginUpdateActionBuilder builder(final AddAllowedOriginUpdateAction template) {
        return AddAllowedOriginUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddAllowedOriginUpdateAction(Function<AddAllowedOriginUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddAllowedOriginUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAllowedOriginUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<AddAllowedOriginUpdateAction>";
            }
        };
    }
}
