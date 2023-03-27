
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Add Country, Remove Country, or Set Countries update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCountriesChangedMessagePayloadImpl implements StoreCountriesChangedMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries;

    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreCountriesChangedMessagePayloadImpl(
            @JsonProperty("addedCountries") final java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries,
            @JsonProperty("removedCountries") final java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries) {
        this.addedCountries = addedCountries;
        this.removedCountries = removedCountries;
        this.type = STORE_COUNTRIES_CHANGED;
    }

    /**
     * create empty instance
     */
    public StoreCountriesChangedMessagePayloadImpl() {
        this.type = STORE_COUNTRIES_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Countries added to the Store.</p>
     */

    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getAddedCountries() {
        return this.addedCountries;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     */

    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getRemovedCountries() {
        return this.removedCountries;
    }

    public void setAddedCountries(final com.commercetools.api.models.store_country.StoreCountry... addedCountries) {
        this.addedCountries = new ArrayList<>(Arrays.asList(addedCountries));
    }

    public void setAddedCountries(
            final java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries) {
        this.addedCountries = addedCountries;
    }

    public void setRemovedCountries(final com.commercetools.api.models.store_country.StoreCountry... removedCountries) {
        this.removedCountries = new ArrayList<>(Arrays.asList(removedCountries));
    }

    public void setRemovedCountries(
            final java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries) {
        this.removedCountries = removedCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreCountriesChangedMessagePayloadImpl that = (StoreCountriesChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(addedCountries, that.addedCountries)
                .append(removedCountries, that.removedCountries)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(addedCountries).append(removedCountries).toHashCode();
    }

}
