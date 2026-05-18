
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
 * SetCountriesUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountriesUpdateAction setCountriesUpdateAction = SetCountriesUpdateAction.builder()
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCountries")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCountriesUpdateActionImpl.class)
public interface SetCountriesUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetCountriesUpdateAction
     */
    String SET_COUNTRIES = "setCountries";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return countries
     */
    @NotNull
    @JsonProperty("countries")
    public List<String> getCountries();

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final String... countries);

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<String> countries);

    /**
     * factory method
     * @return instance of SetCountriesUpdateAction
     */
    public static SetCountriesUpdateAction of() {
        return new SetCountriesUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetCountriesUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCountriesUpdateAction of(final SetCountriesUpdateAction template) {
        SetCountriesUpdateActionImpl instance = new SetCountriesUpdateActionImpl();
        instance.setCountries(template.getCountries());
        return instance;
    }

    public SetCountriesUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetCountriesUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCountriesUpdateAction deepCopy(@Nullable final SetCountriesUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetCountriesUpdateActionImpl instance = new SetCountriesUpdateActionImpl();
        instance.setCountries(Optional.ofNullable(template.getCountries()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCountriesUpdateAction
     * @return builder
     */
    public static SetCountriesUpdateActionBuilder builder() {
        return SetCountriesUpdateActionBuilder.of();
    }

    /**
     * create builder for SetCountriesUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCountriesUpdateActionBuilder builder(final SetCountriesUpdateAction template) {
        return SetCountriesUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCountriesUpdateAction(Function<SetCountriesUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCountriesUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCountriesUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetCountriesUpdateAction>";
            }
        };
    }
}
