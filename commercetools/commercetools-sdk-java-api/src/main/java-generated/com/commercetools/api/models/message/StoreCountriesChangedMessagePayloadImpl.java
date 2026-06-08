
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreAddCountryAction" rel="nofollow">Add Country</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreRemoveCountryAction" rel="nofollow">Remove Country</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCountriesAction" rel="nofollow">Set Countries</a> update action.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getAddedCountries() {
        return this.addedCountries;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
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
                .append(type, that.type)
                .append(addedCountries, that.addedCountries)
                .append(removedCountries, that.removedCountries)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(addedCountries).append(removedCountries).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("addedCountries", addedCountries)
                .append("removedCountries", removedCountries)
                .build();
    }

    @Override
    public StoreCountriesChangedMessagePayload copyDeep() {
        return StoreCountriesChangedMessagePayload.deepCopy(this);
    }
}
