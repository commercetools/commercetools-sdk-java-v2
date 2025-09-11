
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

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartsConfigurationImpl(@JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("countryTaxRateFallbackEnabled") final Boolean countryTaxRateFallbackEnabled,
            @JsonProperty("priceRoundingMode") final com.commercetools.api.models.cart.RoundingMode priceRoundingMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        this.priceRoundingMode = priceRoundingMode;
        this.taxRoundingMode = taxRoundingMode;
    }

    /**
     * create empty instance
     */
    public CartsConfigurationImpl() {
    }

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartDraft" rel="nofollow">MyCartDraft</a>. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> is sent upon deletion of a Cart.</p>
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

    /**
     *  <p>Default value for the <code>priceRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     *  <p>Default value for the <code>taxRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }

    public void setPriceRoundingMode(final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
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
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(countryTaxRateFallbackEnabled, that.countryTaxRateFallbackEnabled)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(deleteDaysAfterLastModification)
                .append(countryTaxRateFallbackEnabled)
                .append(priceRoundingMode)
                .append(taxRoundingMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .append("countryTaxRateFallbackEnabled", countryTaxRateFallbackEnabled)
                .append("priceRoundingMode", priceRoundingMode)
                .append("taxRoundingMode", taxRoundingMode)
                .build();
    }

    @Override
    public CartsConfiguration copyDeep() {
        return CartsConfiguration.deepCopy(this);
    }
}
