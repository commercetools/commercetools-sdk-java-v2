
package com.commercetools.checkout.models.application;

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
 * SetCountriesUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCountriesUpdateActionImpl implements SetCountriesUpdateAction, ModelBase {

    private String action;

    private java.util.List<String> countries;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCountriesUpdateActionImpl(@JsonProperty("countries") final java.util.List<String> countries) {
        this.countries = countries;
        this.action = SET_COUNTRIES;
    }

    /**
     * create empty instance
     */
    public SetCountriesUpdateActionImpl() {
        this.action = SET_COUNTRIES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    public void setCountries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
    }

    public void setCountries(final java.util.List<String> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCountriesUpdateActionImpl that = (SetCountriesUpdateActionImpl) o;

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
    public SetCountriesUpdateAction copyDeep() {
        return SetCountriesUpdateAction.deepCopy(this);
    }
}
