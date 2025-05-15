
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
 *  <p>Generated after a successful Add Store update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoreAddedMessagePayloadImpl implements BusinessUnitStoreAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitStoreAddedMessagePayloadImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        this.type = BUSINESS_UNIT_STORE_ADDED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitStoreAddedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_STORE_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitStoreAddedMessagePayloadImpl that = (BusinessUnitStoreAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(store, that.store)
                .append(type, that.type)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(store).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("store", store)
                .build();
    }

    @Override
    public BusinessUnitStoreAddedMessagePayload copyDeep() {
        return BusinessUnitStoreAddedMessagePayload.deepCopy(this);
    }
}
