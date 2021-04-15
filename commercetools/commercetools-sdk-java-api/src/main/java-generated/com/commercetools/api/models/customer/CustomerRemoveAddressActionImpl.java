
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerRemoveAddressActionImpl implements CustomerRemoveAddressAction {

    private String action;

    private String addressId;

    private String addressKey;

    @JsonCreator
    CustomerRemoveAddressActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("addressKey") final String addressKey) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.action = REMOVE_ADDRESS;
    }

    public CustomerRemoveAddressActionImpl() {
        this.action = REMOVE_ADDRESS;
    }

    public String getAction() {
        return this.action;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerRemoveAddressActionImpl that = (CustomerRemoveAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressId).append(addressKey).toHashCode();
    }

}
