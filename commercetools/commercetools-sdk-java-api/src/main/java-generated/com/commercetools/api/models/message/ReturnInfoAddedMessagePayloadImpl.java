
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
 *  <p>Generated after a successful Add ReturnInfo update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnInfoAddedMessagePayloadImpl implements ReturnInfoAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnInfoAddedMessagePayloadImpl(
            @JsonProperty("returnInfo") final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        this.type = RETURN_INFO_ADDED;
    }

    /**
     * create empty instance
     */
    public ReturnInfoAddedMessagePayloadImpl() {
        this.type = RETURN_INFO_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     */

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

        ReturnInfoAddedMessagePayloadImpl that = (ReturnInfoAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(returnInfo, that.returnInfo)
                .append(type, that.type)
                .append(returnInfo, that.returnInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(returnInfo).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("returnInfo", returnInfo)
                .build();
    }

}
