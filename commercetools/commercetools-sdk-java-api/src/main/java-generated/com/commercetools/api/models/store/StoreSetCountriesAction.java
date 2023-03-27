
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreCountriesChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCountriesAction storeSetCountriesAction = StoreSetCountriesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCountriesActionImpl.class)
public interface StoreSetCountriesAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetCountriesAction
     */
    String SET_COUNTRIES = "setCountries";

    /**
     *  <p>New value to set.</p>
     * @return countries
     */
    @Valid
    @JsonProperty("countries")
    public List<StoreCountry> getCountries();

    /**
     *  <p>New value to set.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final StoreCountry... countries);

    /**
     *  <p>New value to set.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<StoreCountry> countries);

    /**
     * factory method
     * @return instance of StoreSetCountriesAction
     */
    public static StoreSetCountriesAction of() {
        return new StoreSetCountriesActionImpl();
    }

    /**
     * factory method to copy an instance of StoreSetCountriesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetCountriesAction of(final StoreSetCountriesAction template) {
        StoreSetCountriesActionImpl instance = new StoreSetCountriesActionImpl();
        instance.setCountries(template.getCountries());
        return instance;
    }

    /**
     * builder factory method for StoreSetCountriesAction
     * @return builder
     */
    public static StoreSetCountriesActionBuilder builder() {
        return StoreSetCountriesActionBuilder.of();
    }

    /**
     * create builder for StoreSetCountriesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCountriesActionBuilder builder(final StoreSetCountriesAction template) {
        return StoreSetCountriesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetCountriesAction(Function<StoreSetCountriesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetCountriesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetCountriesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCountriesAction>";
            }
        };
    }
}
