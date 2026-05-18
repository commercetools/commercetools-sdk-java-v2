
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
 * AddCountryUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddCountryUpdateActionImpl implements AddCountryUpdateAction, ModelBase {

    private String action;

    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddCountryUpdateActionImpl(@JsonProperty("country") final String country) {
        this.country = country;
        this.action = ADD_COUNTRY;
    }

    /**
     * create empty instance
     */
    public AddCountryUpdateActionImpl() {
        this.action = ADD_COUNTRY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Country to add. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public String getCountry() {
        return this.country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddCountryUpdateActionImpl that = (AddCountryUpdateActionImpl) o;

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
    public AddCountryUpdateAction copyDeep() {
        return AddCountryUpdateAction.deepCopy(this);
    }
}
