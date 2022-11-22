
package com.commercetools.api.models.error;

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
 *  <p>Returned when the Tax Category of at least one of the <code>lineItems</code>, <code>customLineItems</code>, or <code>shippingInfo</code> in the Cart is missing the TaxRate matching <code>country</code> and <code>state</code> given in the <code>shippingAddress</code> of that Cart.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Set Default Shipping Address, Add LineItem, Add CustomLineItem, Set Shipping Address, Set Customer ID, Add LineItem, and Add CustomLineItem update actions</li>
 *   <li>Create Order from Cart and Create Order from Cart in a Store requests.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingTaxRateForCountryErrorImpl implements MissingTaxRateForCountryError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String taxCategoryId;

    private String country;

    private String state;

    @JsonCreator
    MissingTaxRateForCountryErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("taxCategoryId") final String taxCategoryId, @JsonProperty("country") final String country,
            @JsonProperty("state") final String state) {
        this.message = message;
        this.values = values;
        this.taxCategoryId = taxCategoryId;
        this.country = country;
        this.state = state;
        this.code = MISSING_TAX_RATE_FOR_COUNTRY;
    }

    public MissingTaxRateForCountryErrorImpl() {
        this.code = MISSING_TAX_RATE_FOR_COUNTRY;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Tax category $taxCategoryId is missing a tax rate for country $countriesAndStates."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     */

    public String getTaxCategoryId() {
        return this.taxCategoryId;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     */

    public String getState() {
        return this.state;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setTaxCategoryId(final String taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setState(final String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingTaxRateForCountryErrorImpl that = (MissingTaxRateForCountryErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(taxCategoryId, that.taxCategoryId)
                .append(country, that.country)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(taxCategoryId)
                .append(country)
                .append(state)
                .toHashCode();
    }

}
