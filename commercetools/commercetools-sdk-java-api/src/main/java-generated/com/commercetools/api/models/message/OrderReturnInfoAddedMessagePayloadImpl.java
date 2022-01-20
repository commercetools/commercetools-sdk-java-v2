
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderReturnInfoAddedMessagePayloadImpl implements OrderReturnInfoAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    @JsonCreator
    OrderReturnInfoAddedMessagePayloadImpl(
            @JsonProperty("returnInfo") final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        this.type = RETURN_INFO_ADDED;
    }

    public OrderReturnInfoAddedMessagePayloadImpl() {
        this.type = RETURN_INFO_ADDED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.ReturnInfo getReturnInfo() {
        return this.returnInfo;
    }

    public void setReturnInfo(final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderReturnInfoAddedMessagePayloadImpl that = (OrderReturnInfoAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(returnInfo, that.returnInfo).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(returnInfo).toHashCode();
    }

}
