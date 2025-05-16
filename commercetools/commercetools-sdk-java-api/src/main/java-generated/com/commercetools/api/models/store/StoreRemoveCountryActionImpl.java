
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
 *  <p>This update action produces the StoreCountriesChanged Message. It has no effect if a given country is not present in a Store.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveCountryActionImpl implements StoreRemoveCountryAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store_country.StoreCountry country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreRemoveCountryActionImpl(
            @JsonProperty("country") final com.commercetools.api.models.store_country.StoreCountry country) {
        this.country = country;
        this.action = REMOVE_COUNTRY;
    }

    /**
     * create empty instance
     */
    public StoreRemoveCountryActionImpl() {
        this.action = REMOVE_COUNTRY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     */

    public com.commercetools.api.models.store_country.StoreCountry getCountry() {
        return this.country;
    }

    public void setCountry(final com.commercetools.api.models.store_country.StoreCountry country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreRemoveCountryActionImpl that = (StoreRemoveCountryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(country, that.country)
                .append(action, that.action)
                .append(country, that.country)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(country).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("country", country)
                .build();
    }

    @Override
    public StoreRemoveCountryAction copyDeep() {
        return StoreRemoveCountryAction.deepCopy(this);
    }
}
