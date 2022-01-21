
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerSetStoresActionImpl implements CustomerSetStoresAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    @JsonCreator
    CustomerSetStoresActionImpl(
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        this.action = SET_STORES;
    }

    public CustomerSetStoresActionImpl() {
        this.action = SET_STORES;
    }

    public String getAction() {
        return this.action;
    }

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

        CustomerSetStoresActionImpl that = (CustomerSetStoresActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(stores, that.stores).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stores).toHashCode();
    }

}
