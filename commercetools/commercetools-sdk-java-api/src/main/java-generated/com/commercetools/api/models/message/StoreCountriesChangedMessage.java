
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
 *     StoreCountriesChangedMessage storeCountriesChangedMessage = StoreCountriesChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreCountriesChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCountriesChangedMessageImpl.class)
public interface StoreCountriesChangedMessage extends Message {

    /**
     * discriminator value for StoreCountriesChangedMessage
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
     * @return instance of StoreCountriesChangedMessage
     */
    public static StoreCountriesChangedMessage of() {
        return new StoreCountriesChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreCountriesChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCountriesChangedMessage of(final StoreCountriesChangedMessage template) {
        StoreCountriesChangedMessageImpl instance = new StoreCountriesChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddedCountries(template.getAddedCountries());
        instance.setRemovedCountries(template.getRemovedCountries());
        return instance;
    }

    public StoreCountriesChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreCountriesChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCountriesChangedMessage deepCopy(@Nullable final StoreCountriesChangedMessage template) {
        if (template == null) {
            return null;
        }
        StoreCountriesChangedMessageImpl instance = new StoreCountriesChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
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
     * builder factory method for StoreCountriesChangedMessage
     * @return builder
     */
    public static StoreCountriesChangedMessageBuilder builder() {
        return StoreCountriesChangedMessageBuilder.of();
    }

    /**
     * create builder for StoreCountriesChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCountriesChangedMessageBuilder builder(final StoreCountriesChangedMessage template) {
        return StoreCountriesChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCountriesChangedMessage(Function<StoreCountriesChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCountriesChangedMessage>";
            }
        };
    }
}
