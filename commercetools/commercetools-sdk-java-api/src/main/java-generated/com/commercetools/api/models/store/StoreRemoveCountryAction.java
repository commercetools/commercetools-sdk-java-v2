
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreCountriesChanged Message. It has no effect if a given country is not present in a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveCountryAction storeRemoveCountryAction = StoreRemoveCountryAction.builder()
 *             .country(countryBuilder -> countryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveCountryActionImpl.class)
public interface StoreRemoveCountryAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreRemoveCountryAction
     */
    String REMOVE_COUNTRY = "removeCountry";

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     * @return country
     */
    @NotNull
    @Valid
    @JsonProperty("country")
    public StoreCountry getCountry();

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     * @param country value to be set
     */

    public void setCountry(final StoreCountry country);

    /**
     * factory method
     * @return instance of StoreRemoveCountryAction
     */
    public static StoreRemoveCountryAction of() {
        return new StoreRemoveCountryActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreRemoveCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreRemoveCountryAction of(final StoreRemoveCountryAction template) {
        StoreRemoveCountryActionImpl instance = new StoreRemoveCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreRemoveCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreRemoveCountryAction deepCopy(@Nullable final StoreRemoveCountryAction template) {
        if (template == null) {
            return null;
        }
        StoreRemoveCountryActionImpl instance = new StoreRemoveCountryActionImpl();
        instance.setCountry(Optional.ofNullable(template.getCountry())
                .map(com.commercetools.api.models.store_country.StoreCountry::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreRemoveCountryAction
     * @return builder
     */
    public static StoreRemoveCountryActionBuilder builder() {
        return StoreRemoveCountryActionBuilder.of();
    }

    /**
     * create builder for StoreRemoveCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveCountryActionBuilder builder(final StoreRemoveCountryAction template) {
        return StoreRemoveCountryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreRemoveCountryAction(Function<StoreRemoveCountryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveCountryAction>";
            }
        };
    }
}
