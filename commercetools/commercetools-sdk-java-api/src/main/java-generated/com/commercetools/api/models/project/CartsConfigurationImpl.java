
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * CartsConfiguration
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartsConfigurationImpl implements CartsConfiguration, ModelBase {

    private Long deleteDaysAfterLastModification;

    private Boolean countryTaxRateFallbackEnabled;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartsConfigurationImpl(@JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("countryTaxRateFallbackEnabled") final Boolean countryTaxRateFallbackEnabled) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }

    /**
     * create empty instance
     */
    public CartsConfigurationImpl() {
    }

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the CartDraft and MyCartDraft. If a ChangeSubscription for Carts exists, a ResourceDeletedDeliveryPayload is sent upon deletion of a Cart.</p>
     *  <p>This field may not be present on Projects created before January 2020.</p>
     */

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
     */

    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
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

        CartsConfigurationImpl that = (CartsConfigurationImpl) o;

        return new EqualsBuilder().append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(countryTaxRateFallbackEnabled, that.countryTaxRateFallbackEnabled)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(countryTaxRateFallbackEnabled, that.countryTaxRateFallbackEnabled)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(deleteDaysAfterLastModification)
                .append(countryTaxRateFallbackEnabled)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .append("countryTaxRateFallbackEnabled", countryTaxRateFallbackEnabled)
                .build();
    }

}
