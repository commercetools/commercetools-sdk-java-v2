
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
 *  <p>Removes a Store from the Business Unit. Newly created Carts and Orders can no longer reference the removed Store for the Business Unit. We recommend cleaning up unordered Carts that still have the Store assigned after calling this update action since those cannot be converted to Orders. Orders created before the Store was removed remain unchanged. Generates a BusinessUnitStoreRemoved Message. Only applicable when <code>storeMode</code> is <code>Explicit</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveStoreActionImpl implements BusinessUnitRemoveStoreAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitRemoveStoreActionImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action = REMOVE_STORE;
    }

    /**
     * create empty instance
     */
    public BusinessUnitRemoveStoreActionImpl() {
        this.action = REMOVE_STORE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Store to remove.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitRemoveStoreActionImpl that = (BusinessUnitRemoveStoreActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(store, that.store)
                .append(action, that.action)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(store).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("store", store)
                .build();
    }

    @Override
    public BusinessUnitRemoveStoreAction copyDeep() {
        return BusinessUnitRemoveStoreAction.deepCopy(this);
    }
}
