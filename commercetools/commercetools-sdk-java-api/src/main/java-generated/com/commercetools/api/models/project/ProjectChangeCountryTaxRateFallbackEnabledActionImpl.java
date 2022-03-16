
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectChangeCountryTaxRateFallbackEnabledActionImpl
        implements ProjectChangeCountryTaxRateFallbackEnabledAction, ModelBase {

    private String action;

    private Boolean countryTaxRateFallbackEnabled;

    @JsonCreator
    ProjectChangeCountryTaxRateFallbackEnabledActionImpl(
            @JsonProperty("countryTaxRateFallbackEnabled") final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        this.action = CHANGE_COUNTRY_TAX_RATE_FALLBACK_ENABLED;
    }

    public ProjectChangeCountryTaxRateFallbackEnabledActionImpl() {
        this.action = CHANGE_COUNTRY_TAX_RATE_FALLBACK_ENABLED;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>When <code>true</code>, country <em>- no state</em> Tax Rate is used as fallback. See <a href="ctp:api:type:CartsConfiguration">CartsConfiguration</a>.</p>
    */
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeCountryTaxRateFallbackEnabledActionImpl that = (ProjectChangeCountryTaxRateFallbackEnabledActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(countryTaxRateFallbackEnabled, that.countryTaxRateFallbackEnabled)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(countryTaxRateFallbackEnabled).toHashCode();
    }

}
