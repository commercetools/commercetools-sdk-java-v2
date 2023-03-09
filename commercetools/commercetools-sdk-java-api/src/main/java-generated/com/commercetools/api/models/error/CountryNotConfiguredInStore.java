
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
 *   <li>Create Order in a Store from a Cart requests and Set Country on My Orders.</li>
 *   <li>Create Order by Import request.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountryNotConfiguredInStore countryNotConfiguredInStore = CountryNotConfiguredInStore.builder()
 *             .message("{message}")
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CountryNotConfiguredInStoreImpl.class)
public interface CountryNotConfiguredInStore extends ErrorObject {

    String COUNTRY_NOT_CONFIGURED_IN_STORE = "CountryNotConfiguredInStore";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The country $country is not configured for the store $store."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Countries configured for the Store.</p>
     */
    @NotNull
    @JsonProperty("storeCountries")
    public List<String> getStoreCountries();

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    public void setMessage(final String message);

    @JsonIgnore
    public void setStoreCountries(final String... storeCountries);

    public void setStoreCountries(final List<String> storeCountries);

    public void setCountry(final String country);

    public static CountryNotConfiguredInStore of() {
        return new CountryNotConfiguredInStoreImpl();
    }

    public static CountryNotConfiguredInStore of(final CountryNotConfiguredInStore template) {
        CountryNotConfiguredInStoreImpl instance = new CountryNotConfiguredInStoreImpl();
        instance.setMessage(template.getMessage());

        instance.setStoreCountries(template.getStoreCountries());
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static CountryNotConfiguredInStoreBuilder builder() {
        return CountryNotConfiguredInStoreBuilder.of();
    }

    public static CountryNotConfiguredInStoreBuilder builder(final CountryNotConfiguredInStore template) {
        return CountryNotConfiguredInStoreBuilder.of(template);
    }

    default <T> T withCountryNotConfiguredInStore(Function<CountryNotConfiguredInStore, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CountryNotConfiguredInStore> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CountryNotConfiguredInStore>() {
            @Override
            public String toString() {
                return "TypeReference<CountryNotConfiguredInStore>";
            }
        };
    }
}
