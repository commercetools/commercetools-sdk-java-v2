
package com.commercetools.api.models.business_unit;

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
 *  <p>Sets the Stores of the Business Unit. Can only be set if the Business Unit <code>storeMode</code> is <code>Explicit</code>. <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a> created after the Set Stores update must use the new Stores of the Business Unit and, if set, their <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selections</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Orders created before the Set Stores update action remain unchanged. Setting the Stores on a Business Unit generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitStoresSetMessage" rel="nofollow">BusinessUnitStoresSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetStoresActionImpl implements BusinessUnitSetStoresAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSetStoresActionImpl(
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        this.action = SET_STORES;
    }

    /**
     * create empty instance
     */
    public BusinessUnitSetStoresActionImpl() {
        this.action = SET_STORES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to set. Overrides the current list of Stores.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitSetStoresActionImpl that = (BusinessUnitSetStoresActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(stores, that.stores)
                .append(action, that.action)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stores).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("stores", stores)
                .build();
    }

    @Override
    public BusinessUnitSetStoresAction copyDeep() {
        return BusinessUnitSetStoresAction.deepCopy(this);
    }
}
