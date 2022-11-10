
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Country, Remove Country, or Set Countries update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCountriesChangedMessagePayload storeCountriesChangedMessagePayload = StoreCountriesChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCountriesChangedMessagePayloadImpl.class)
public interface StoreCountriesChangedMessagePayload extends MessagePayload {

    String STORE_COUNTRIES_CHANGED = "StoreCountriesChanged";

    /**
     *  <p>Countries added to the Store.</p>
     */
    @Valid
    @JsonProperty("addedCountries")
    public List<StoreCountry> getAddedCountries();

    /**
     *  <p>Countries removed from the Store.</p>
     */
    @Valid
    @JsonProperty("removedCountries")
    public List<StoreCountry> getRemovedCountries();

    @JsonIgnore
    public void setAddedCountries(final StoreCountry... addedCountries);

    public void setAddedCountries(final List<StoreCountry> addedCountries);

    @JsonIgnore
    public void setRemovedCountries(final StoreCountry... removedCountries);

    public void setRemovedCountries(final List<StoreCountry> removedCountries);

    public static StoreCountriesChangedMessagePayload of() {
        return new StoreCountriesChangedMessagePayloadImpl();
    }

    public static StoreCountriesChangedMessagePayload of(final StoreCountriesChangedMessagePayload template) {
        StoreCountriesChangedMessagePayloadImpl instance = new StoreCountriesChangedMessagePayloadImpl();
        instance.setAddedCountries(template.getAddedCountries());
        instance.setRemovedCountries(template.getRemovedCountries());
        return instance;
    }

    public static StoreCountriesChangedMessagePayloadBuilder builder() {
        return StoreCountriesChangedMessagePayloadBuilder.of();
    }

    public static StoreCountriesChangedMessagePayloadBuilder builder(
            final StoreCountriesChangedMessagePayload template) {
        return StoreCountriesChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreCountriesChangedMessagePayload(Function<StoreCountriesChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCountriesChangedMessagePayload>";
            }
        };
    }
}
