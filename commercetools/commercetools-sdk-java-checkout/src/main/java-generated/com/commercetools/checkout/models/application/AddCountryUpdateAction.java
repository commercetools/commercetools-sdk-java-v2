
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
 * AddCountryUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddCountryUpdateAction addCountryUpdateAction = AddCountryUpdateAction.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addCountry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddCountryUpdateActionImpl.class)
public interface AddCountryUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for AddCountryUpdateAction
     */
    String ADD_COUNTRY = "addCountry";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Country to add. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Country to add. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * factory method
     * @return instance of AddCountryUpdateAction
     */
    public static AddCountryUpdateAction of() {
        return new AddCountryUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy AddCountryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddCountryUpdateAction of(final AddCountryUpdateAction template) {
        AddCountryUpdateActionImpl instance = new AddCountryUpdateActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public AddCountryUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of AddCountryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddCountryUpdateAction deepCopy(@Nullable final AddCountryUpdateAction template) {
        if (template == null) {
            return null;
        }
        AddCountryUpdateActionImpl instance = new AddCountryUpdateActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for AddCountryUpdateAction
     * @return builder
     */
    public static AddCountryUpdateActionBuilder builder() {
        return AddCountryUpdateActionBuilder.of();
    }

    /**
     * create builder for AddCountryUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddCountryUpdateActionBuilder builder(final AddCountryUpdateAction template) {
        return AddCountryUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddCountryUpdateAction(Function<AddCountryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddCountryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddCountryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<AddCountryUpdateAction>";
            }
        };
    }
}
