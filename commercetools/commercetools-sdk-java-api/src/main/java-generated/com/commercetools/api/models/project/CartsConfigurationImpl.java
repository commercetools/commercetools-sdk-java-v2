
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartsConfigurationImpl implements CartsConfiguration {

    private Boolean countryTaxRateFallbackEnabled;

    private Long deleteDaysAfterLastModification;

    @JsonCreator
    CartsConfigurationImpl(@JsonProperty("countryTaxRateFallbackEnabled") final Boolean countryTaxRateFallbackEnabled,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public CartsConfigurationImpl() {
    }

    /**
    *  <p>if country - no state tax rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all tax categories of a cart line items. Default value 'false'</p>
    */
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    /**
    *  <p>The default value for the deleteDaysAfterLastModification parameter of the CartDraft. Initially set to 90 for projects created after December 2019.</p>
    */
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartsConfigurationImpl that = (CartsConfigurationImpl) o;

        return new EqualsBuilder().append(countryTaxRateFallbackEnabled, that.countryTaxRateFallbackEnabled)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(countryTaxRateFallbackEnabled)
                .append(deleteDaysAfterLastModification)
                .toHashCode();
    }

}
