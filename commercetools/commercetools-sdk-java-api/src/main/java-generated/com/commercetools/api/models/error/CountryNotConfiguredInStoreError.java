
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Cart or an Order in a Store references a country that is not included in the countries configured for the Store.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Cart in Store request and Set Country update action on Carts.</li>
 *   <li>Create Cart in Store request and Set Country update action on My Carts.</li>
 *   <li>Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart in a Store requests on My Orders.</li>
 *   <li>Create Order from Quote requests on Orders.</li>
 *   <li>Create Order from Quote requests on My Orders.</li>
 *   <li>Create Order by Import request on Order Import.</li>
 *   <li>Set Country on Order Edits.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountryNotConfiguredInStoreError countryNotConfiguredInStoreError = CountryNotConfiguredInStoreError.builder()
 *             .message("{message}")
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CountryNotConfiguredInStoreErrorImpl.class)
public interface CountryNotConfiguredInStoreError extends ErrorObject {

    String COUNTRY_NOT_CONFIGURED_IN_STORE = "CountryNotConfiguredInStore";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The country $country is not configured for the store $store."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

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

    public void setMessage(final String message);

    @JsonIgnore
    public void setStoreCountries(final String... storeCountries);

    public void setStoreCountries(final List<String> storeCountries);

    public void setCountry(final String country);

    public static CountryNotConfiguredInStoreError of() {
        return new CountryNotConfiguredInStoreErrorImpl();
    }

    public static CountryNotConfiguredInStoreError of(final CountryNotConfiguredInStoreError template) {
        CountryNotConfiguredInStoreErrorImpl instance = new CountryNotConfiguredInStoreErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setStoreCountries(template.getStoreCountries());
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static CountryNotConfiguredInStoreErrorBuilder builder() {
        return CountryNotConfiguredInStoreErrorBuilder.of();
    }

    public static CountryNotConfiguredInStoreErrorBuilder builder(final CountryNotConfiguredInStoreError template) {
        return CountryNotConfiguredInStoreErrorBuilder.of(template);
    }

    default <T> T withCountryNotConfiguredInStoreError(Function<CountryNotConfiguredInStoreError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CountryNotConfiguredInStoreError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CountryNotConfiguredInStoreError>() {
            @Override
            public String toString() {
                return "TypeReference<CountryNotConfiguredInStoreError>";
            }
        };
    }
}
