
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreCountriesChanged Message. It has no effect if the given country is already present in a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddCountryAction storeAddCountryAction = StoreAddCountryAction.builder()
 *             .country(countryBuilder -> countryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreAddCountryActionImpl.class)
public interface StoreAddCountryAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreAddCountryAction
     */
    String ADD_COUNTRY = "addCountry";

    /**
     *  <p>Value to append to <code>countries</code>.</p>
     * @return country
     */
    @NotNull
    @Valid
    @JsonProperty("country")
    public StoreCountry getCountry();

    /**
     *  <p>Value to append to <code>countries</code>.</p>
     * @param country value to be set
     */

    public void setCountry(final StoreCountry country);

    /**
     * factory method
     * @return instance of StoreAddCountryAction
     */
    public static StoreAddCountryAction of() {
        return new StoreAddCountryActionImpl();
    }

    /**
     * factory method to copy an instance of StoreAddCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreAddCountryAction of(final StoreAddCountryAction template) {
        StoreAddCountryActionImpl instance = new StoreAddCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for StoreAddCountryAction
     * @return builder
     */
    public static StoreAddCountryActionBuilder builder() {
        return StoreAddCountryActionBuilder.of();
    }

    /**
     * create builder for StoreAddCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddCountryActionBuilder builder(final StoreAddCountryAction template) {
        return StoreAddCountryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreAddCountryAction(Function<StoreAddCountryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreAddCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreAddCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreAddCountryAction>";
            }
        };
    }
}
