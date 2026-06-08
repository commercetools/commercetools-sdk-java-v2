
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoresSetMessagePayloadImpl implements BusinessUnitStoresSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitStoresSetMessagePayloadImpl(
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        this.type = BUSINESS_UNIT_STORES_SET;
    }

    /**
     * create empty instance
     */
    public BusinessUnitStoresSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_STORES_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
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

        BusinessUnitStoresSetMessagePayloadImpl that = (BusinessUnitStoresSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(stores, that.stores)
                .append(type, that.type)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(stores).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("stores", stores)
                .build();
    }

    @Override
    public BusinessUnitStoresSetMessagePayload copyDeep() {
        return BusinessUnitStoresSetMessagePayload.deepCopy(this);
    }
}
