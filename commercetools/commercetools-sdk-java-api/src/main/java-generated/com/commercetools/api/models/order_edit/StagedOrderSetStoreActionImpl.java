
package com.commercetools.api.models.order_edit;

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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> the Order is assigned to. It should be used to migrate Orders to a new Store. No validations are performed (such as that the Customer is allowed to create Orders in the Store).</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderStoreSetMessage" rel="nofollow">Order Store Set</a> Message. Returns a <code>400</code> error if <code>store</code> references the same Store the Order is currently assigned to, including if you try to remove the value when no Store is currently assigned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetStoreActionImpl implements StagedOrderSetStoreAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetStoreActionImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action = SET_STORE;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetStoreActionImpl() {
        this.action = SET_STORE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
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

        StagedOrderSetStoreActionImpl that = (StagedOrderSetStoreActionImpl) o;

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
    public StagedOrderSetStoreAction copyDeep() {
        return StagedOrderSetStoreAction.deepCopy(this);
    }
}
