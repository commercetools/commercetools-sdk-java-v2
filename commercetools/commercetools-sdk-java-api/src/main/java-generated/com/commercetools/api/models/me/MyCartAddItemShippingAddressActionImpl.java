
package com.commercetools.api.models.me;

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
public class MyCartAddItemShippingAddressActionImpl implements MyCartAddItemShippingAddressAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.BaseAddress address;

    @JsonCreator
    MyCartAddItemShippingAddressActionImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        this.action = ADD_ITEM_SHIPPING_ADDRESS;
    }

    public MyCartAddItemShippingAddressActionImpl() {
        this.action = ADD_ITEM_SHIPPING_ADDRESS;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartAddItemShippingAddressActionImpl that = (MyCartAddItemShippingAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(address, that.address).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(address).toHashCode();
    }

}
