
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Cart or an Order in a Store references a country that is not included in the countries configured for the Store.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Cart in Store request and Set Country update action on Carts.</li>
 *   <li>Create Cart in Store request and Set Country update action on My Carts.</li>
 *   <li>Create Order in Store from Cart and Create Order from Quote requests on Orders.</li>
 *   <li>Create Order in Store from Cart and Create Order from Quote requests on My Orders.</li>
 *   <li>Create Order by Import request on Order Import.</li>
 *   <li>Set Country update action on Order Edits.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLCountryNotConfiguredInStoreError graphQLCountryNotConfiguredInStoreError = GraphQLCountryNotConfiguredInStoreError.builder()
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CountryNotConfiguredInStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLCountryNotConfiguredInStoreErrorImpl.class)
public interface GraphQLCountryNotConfiguredInStoreError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLCountryNotConfiguredInStoreError
     */
    String COUNTRY_NOT_CONFIGURED_IN_STORE = "CountryNotConfiguredInStore";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Countries configured for the Store.</p>
     * @return storeCountries
     */
    @NotNull
    @JsonProperty("storeCountries")
    public List<String> getStoreCountries();

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries values to be set
     */

    @JsonIgnore
    public void setStoreCountries(final String... storeCountries);

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries values to be set
     */

    public void setStoreCountries(final List<String> storeCountries);

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * factory method
     * @return instance of GraphQLCountryNotConfiguredInStoreError
     */
    public static GraphQLCountryNotConfiguredInStoreError of() {
        return new GraphQLCountryNotConfiguredInStoreErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLCountryNotConfiguredInStoreError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLCountryNotConfiguredInStoreError of(final GraphQLCountryNotConfiguredInStoreError template) {
        GraphQLCountryNotConfiguredInStoreErrorImpl instance = new GraphQLCountryNotConfiguredInStoreErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStoreCountries(template.getStoreCountries());
        instance.setCountry(template.getCountry());
        return instance;
    }

    public GraphQLCountryNotConfiguredInStoreError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLCountryNotConfiguredInStoreError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLCountryNotConfiguredInStoreError deepCopy(
            @Nullable final GraphQLCountryNotConfiguredInStoreError template) {
        if (template == null) {
            return null;
        }
        GraphQLCountryNotConfiguredInStoreErrorImpl instance = new GraphQLCountryNotConfiguredInStoreErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStoreCountries(Optional.ofNullable(template.getStoreCountries()).map(ArrayList::new).orElse(null));
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for GraphQLCountryNotConfiguredInStoreError
     * @return builder
     */
    public static GraphQLCountryNotConfiguredInStoreErrorBuilder builder() {
        return GraphQLCountryNotConfiguredInStoreErrorBuilder.of();
    }

    /**
     * create builder for GraphQLCountryNotConfiguredInStoreError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLCountryNotConfiguredInStoreErrorBuilder builder(
            final GraphQLCountryNotConfiguredInStoreError template) {
        return GraphQLCountryNotConfiguredInStoreErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLCountryNotConfiguredInStoreError(
            Function<GraphQLCountryNotConfiguredInStoreError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLCountryNotConfiguredInStoreError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLCountryNotConfiguredInStoreError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLCountryNotConfiguredInStoreError>";
            }
        };
    }
}
