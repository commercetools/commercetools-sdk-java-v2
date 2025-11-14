
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
 * RemoveCountryUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveCountryUpdateAction removeCountryUpdateAction = RemoveCountryUpdateAction.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeCountry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveCountryUpdateActionImpl.class)
public interface RemoveCountryUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for RemoveCountryUpdateAction
     */
    String REMOVE_COUNTRY = "removeCountry";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Country to remove. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Country to remove. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * factory method
     * @return instance of RemoveCountryUpdateAction
     */
    public static RemoveCountryUpdateAction of() {
        return new RemoveCountryUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RemoveCountryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveCountryUpdateAction of(final RemoveCountryUpdateAction template) {
        RemoveCountryUpdateActionImpl instance = new RemoveCountryUpdateActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public RemoveCountryUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RemoveCountryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveCountryUpdateAction deepCopy(@Nullable final RemoveCountryUpdateAction template) {
        if (template == null) {
            return null;
        }
        RemoveCountryUpdateActionImpl instance = new RemoveCountryUpdateActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for RemoveCountryUpdateAction
     * @return builder
     */
    public static RemoveCountryUpdateActionBuilder builder() {
        return RemoveCountryUpdateActionBuilder.of();
    }

    /**
     * create builder for RemoveCountryUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveCountryUpdateActionBuilder builder(final RemoveCountryUpdateAction template) {
        return RemoveCountryUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveCountryUpdateAction(Function<RemoveCountryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveCountryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveCountryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveCountryUpdateAction>";
            }
        };
    }
}
