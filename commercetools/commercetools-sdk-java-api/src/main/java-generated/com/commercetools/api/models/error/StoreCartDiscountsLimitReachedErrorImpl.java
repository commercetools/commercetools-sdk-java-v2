
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
 *  <p>Returned when a Cart Discount cannot be created or assigned to a Store as the limit for active Cart Discounts in a Store has been reached for one or more Stores in the request.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create CartDiscount and Create CartDiscount in Store requests</li>
 *   <li>Add Store and Set Store update actions</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCartDiscountsLimitReachedErrorImpl implements StoreCartDiscountsLimitReachedError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreCartDiscountsLimitReachedErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.message = message;
        this.values = values;
        this.stores = stores;
        this.code = STORE_CART_DISCOUNTS_LIMIT_REACHED;
    }

    /**
     * create empty instance
     */
    public StoreCartDiscountsLimitReachedErrorImpl() {
        this.code = STORE_CART_DISCOUNTS_LIMIT_REACHED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Maximum number of active cart discounts reached for $stores."</code></p>
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
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
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

        StoreCartDiscountsLimitReachedErrorImpl that = (StoreCartDiscountsLimitReachedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(values).append(stores).toHashCode();
    }

}
