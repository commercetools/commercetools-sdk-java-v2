
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
 *  <p>Returned when a Cart Discount cannot be created or assigned to a Store as the limit for active Cart Discounts in a Store has been reached for one or more Stores in the request.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create CartDiscount and Create CartDiscount in Store requests</li>
 *   <li>Add Store and Set Store update actions</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLStoreCartDiscountsLimitReachedErrorImpl
        implements GraphQLStoreCartDiscountsLimitReachedError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLStoreCartDiscountsLimitReachedErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.values = values;
        this.stores = stores;
        this.code = STORE_CART_DISCOUNTS_LIMIT_REACHED;
    }

    /**
     * create empty instance
     */
    public GraphQLStoreCartDiscountsLimitReachedErrorImpl() {
        this.code = STORE_CART_DISCOUNTS_LIMIT_REACHED;
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
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setStores(final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLStoreCartDiscountsLimitReachedErrorImpl that = (GraphQLStoreCartDiscountsLimitReachedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(stores, that.stores)
                .append(code, that.code)
                .append(values, that.values)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(stores).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("stores", stores)
                .build();
    }

    @Override
    public GraphQLStoreCartDiscountsLimitReachedError copyDeep() {
        return GraphQLStoreCartDiscountsLimitReachedError.deepCopy(this);
    }
}
