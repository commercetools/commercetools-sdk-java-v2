
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
 *  <p>Generated after a successful Set Stores update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerStoresSetMessagePayloadImpl implements CustomerStoresSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerStoresSetMessagePayloadImpl(
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores,
            @JsonProperty("oldStores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores) {
        this.stores = stores;
        this.oldStores = oldStores;
        this.type = CUSTOMER_STORES_SET;
    }

    /**
     * create empty instance
     */
    public CustomerStoresSetMessagePayloadImpl() {
        this.type = CUSTOMER_STORES_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Stores the Customer is associated with after the Set Stores update action.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>The Stores the Customer was associated with before the Set Stores update action.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getOldStores() {
        return this.oldStores;
    }

    public void setStores(final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
    }

    public void setOldStores(final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        this.oldStores = new ArrayList<>(Arrays.asList(oldStores));
    }

    public void setOldStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores) {
        this.oldStores = oldStores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerStoresSetMessagePayloadImpl that = (CustomerStoresSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(stores, that.stores)
                .append(oldStores, that.oldStores)
                .append(type, that.type)
                .append(stores, that.stores)
                .append(oldStores, that.oldStores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(stores).append(oldStores).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("stores", stores)
                .append("oldStores", oldStores)
                .build();
    }

    @Override
    public CustomerStoresSetMessagePayload copyDeep() {
        return CustomerStoresSetMessagePayload.deepCopy(this);
    }
}
