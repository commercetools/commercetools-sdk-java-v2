
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

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
@io.vrap.rmf.base.client.utils.json.SubType("StoreCountriesChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCountriesChangedMessagePayloadImpl.class)
public interface StoreCountriesChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreCountriesChangedMessagePayload
     */
    String STORE_COUNTRIES_CHANGED = "StoreCountriesChanged";

    /**
     *  <p>Countries added to the Store.</p>
     * @return addedCountries
     */
    @Valid
    @JsonProperty("addedCountries")
    public List<StoreCountry> getAddedCountries();

    /**
     *  <p>Countries removed from the Store.</p>
     * @return removedCountries
     */
    @Valid
    @JsonProperty("removedCountries")
    public List<StoreCountry> getRemovedCountries();

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries values to be set
     */

    @JsonIgnore
    public void setAddedCountries(final StoreCountry... addedCountries);

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries values to be set
     */

    public void setAddedCountries(final List<StoreCountry> addedCountries);

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries values to be set
     */

    @JsonIgnore
    public void setRemovedCountries(final StoreCountry... removedCountries);

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries values to be set
     */

    public void setRemovedCountries(final List<StoreCountry> removedCountries);

    /**
     * factory method
     * @return instance of StoreCountriesChangedMessagePayload
     */
    public static StoreCountriesChangedMessagePayload of() {
        return new StoreCountriesChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreCountriesChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCountriesChangedMessagePayload of(final StoreCountriesChangedMessagePayload template) {
        StoreCountriesChangedMessagePayloadImpl instance = new StoreCountriesChangedMessagePayloadImpl();
        instance.setAddedCountries(template.getAddedCountries());
        instance.setRemovedCountries(template.getRemovedCountries());
        return instance;
    }

    public StoreCountriesChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreCountriesChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCountriesChangedMessagePayload deepCopy(
            @Nullable final StoreCountriesChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreCountriesChangedMessagePayloadImpl instance = new StoreCountriesChangedMessagePayloadImpl();
        instance.setAddedCountries(Optional.ofNullable(template.getAddedCountries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store_country.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedCountries(Optional.ofNullable(template.getRemovedCountries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store_country.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreCountriesChangedMessagePayload
     * @return builder
     */
    public static StoreCountriesChangedMessagePayloadBuilder builder() {
        return StoreCountriesChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreCountriesChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCountriesChangedMessagePayloadBuilder builder(
            final StoreCountriesChangedMessagePayload template) {
        return StoreCountriesChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCountriesChangedMessagePayload(Function<StoreCountriesChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCountriesChangedMessagePayload>";
            }
        };
    }
}
