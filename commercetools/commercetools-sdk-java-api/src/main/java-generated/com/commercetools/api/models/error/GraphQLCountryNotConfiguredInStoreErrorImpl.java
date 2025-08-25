
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
 *  <p>Returned when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> references a country that is not included in the countries configured for the Store.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/carts:POST" rel="nofollow">Create Cart in Store</a> request and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetCountryAction" rel="nofollow">Set Country</a> update action on Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/carts:POST" rel="nofollow">Create Cart in Store</a> request and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartSetCountryAction" rel="nofollow">Set Country</a> update action on My Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders/quotes:POST" rel="nofollow">Create Order from Quote</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/import:POST" rel="nofollow">Create Order by Import</a> request on Order Import.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCountryAction" rel="nofollow">Set Country</a> update action on Order Edits.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLCountryNotConfiguredInStoreErrorImpl implements GraphQLCountryNotConfiguredInStoreError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> storeCountries;

    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLCountryNotConfiguredInStoreErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("storeCountries") final java.util.List<String> storeCountries,
            @JsonProperty("country") final String country) {
        this.values = values;
        this.storeCountries = storeCountries;
        this.country = country;
        this.code = COUNTRY_NOT_CONFIGURED_IN_STORE;
    }

    /**
     * create empty instance
     */
    public GraphQLCountryNotConfiguredInStoreErrorImpl() {
        this.code = COUNTRY_NOT_CONFIGURED_IN_STORE;
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
     *  <p>Countries configured for the Store.</p>
     */

    public java.util.List<String> getStoreCountries() {
        return this.storeCountries;
    }

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     */

    public String getCountry() {
        return this.country;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setStoreCountries(final String... storeCountries) {
        this.storeCountries = new ArrayList<>(Arrays.asList(storeCountries));
    }

    public void setStoreCountries(final java.util.List<String> storeCountries) {
        this.storeCountries = storeCountries;
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

        GraphQLCountryNotConfiguredInStoreErrorImpl that = (GraphQLCountryNotConfiguredInStoreErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(storeCountries, that.storeCountries)
                .append(country, that.country)
                .append(code, that.code)
                .append(values, that.values)
                .append(storeCountries, that.storeCountries)
                .append(country, that.country)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(storeCountries)
                .append(country)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("storeCountries", storeCountries)
                .append("country", country)
                .build();
    }

    @Override
    public GraphQLCountryNotConfiguredInStoreError copyDeep() {
        return GraphQLCountryNotConfiguredInStoreError.deepCopy(this);
    }
}
