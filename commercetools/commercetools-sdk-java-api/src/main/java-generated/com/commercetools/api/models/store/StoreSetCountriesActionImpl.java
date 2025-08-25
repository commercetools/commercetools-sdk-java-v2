
package com.commercetools.api.models.store;

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
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountriesChangedMessage" rel="nofollow">StoreCountriesChanged</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCountriesActionImpl implements StoreSetCountriesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetCountriesActionImpl(
            @JsonProperty("countries") final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        this.action = SET_COUNTRIES;
    }

    /**
     * create empty instance
     */
    public StoreSetCountriesActionImpl() {
        this.action = SET_COUNTRIES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries() {
        return this.countries;
    }

    public void setCountries(final com.commercetools.api.models.store_country.StoreCountry... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
    }

    public void setCountries(final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetCountriesActionImpl that = (StoreSetCountriesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(countries, that.countries)
                .append(action, that.action)
                .append(countries, that.countries)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(countries).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("countries", countries)
                .build();
    }

    @Override
    public StoreSetCountriesAction copyDeep() {
        return StoreSetCountriesAction.deepCopy(this);
    }
}
