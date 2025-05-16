
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when the Tax Category of at least one of the <code>lineItems</code>, <code>customLineItems</code>, or <code>shippingInfo</code> in the Cart is missing the TaxRate matching <code>country</code> and <code>state</code> given in the <code>shippingAddress</code> of that Cart.</p>
 *  <p>The error can be returned as a failed response to all update actions on Carts and Staged Orders.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store requests and Set CustomerGroup update action on Customers.</li>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store on My Customer Profile.</li>
 *   <li>Create Cart, Create Cart in Store, Replicate Cart, and Replicate Cart in Store requests on Carts.</li>
 *   <li>Create Cart and Create Cart in Store and Replicate My Cart requests on My Carts.</li>
 *   <li>Create Cart in BusinessUnit and Replicate Cart in Business Unit requests on Associate Carts.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *   <li>Create Order from Cart in BusinessUnit requests on Associate Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMissingTaxRateForCountryErrorImpl implements GraphQLMissingTaxRateForCountryError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String taxCategoryId;

    private String country;

    private String state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLMissingTaxRateForCountryErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("taxCategoryId") final String taxCategoryId, @JsonProperty("country") final String country,
            @JsonProperty("state") final String state) {
        this.values = values;
        this.taxCategoryId = taxCategoryId;
        this.country = country;
        this.state = state;
        this.code = MISSING_TAX_RATE_FOR_COUNTRY;
    }

    /**
     * create empty instance
     */
    public GraphQLMissingTaxRateForCountryErrorImpl() {
        this.code = MISSING_TAX_RATE_FOR_COUNTRY;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
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

        GraphQLMissingTaxRateForCountryErrorImpl that = (GraphQLMissingTaxRateForCountryErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(taxCategoryId, that.taxCategoryId)
                .append(country, that.country)
                .append(state, that.state)
                .append(code, that.code)
                .append(values, that.values)
                .append(taxCategoryId, that.taxCategoryId)
                .append(country, that.country)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(taxCategoryId)
                .append(country)
                .append(state)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("taxCategoryId", taxCategoryId)
                .append("country", country)
                .append("state", state)
                .build();
    }

    @Override
    public GraphQLMissingTaxRateForCountryError copyDeep() {
        return GraphQLMissingTaxRateForCountryError.deepCopy(this);
    }
}
