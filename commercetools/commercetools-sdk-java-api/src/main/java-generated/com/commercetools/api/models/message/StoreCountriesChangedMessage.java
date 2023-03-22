
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCountriesChangedMessageImpl.class)
public interface StoreCountriesChangedMessage extends Message {

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

    @JsonIgnore
    public void setAddedCountries(final StoreCountry... addedCountries);

    public void setAddedCountries(final List<StoreCountry> addedCountries);

    @JsonIgnore
    public void setRemovedCountries(final StoreCountry... removedCountries);

    public void setRemovedCountries(final List<StoreCountry> removedCountries);

    public static StoreCountriesChangedMessage of() {
        return new StoreCountriesChangedMessageImpl();
    }

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

    public static StoreCountriesChangedMessageBuilder builder() {
        return StoreCountriesChangedMessageBuilder.of();
    }

    public static StoreCountriesChangedMessageBuilder builder(final StoreCountriesChangedMessage template) {
        return StoreCountriesChangedMessageBuilder.of(template);
    }

    default <T> T withStoreCountriesChangedMessage(Function<StoreCountriesChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCountriesChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCountriesChangedMessage>";
            }
        };
    }
}
