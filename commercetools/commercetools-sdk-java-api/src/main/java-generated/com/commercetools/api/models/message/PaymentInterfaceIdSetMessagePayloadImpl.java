
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentInterfaceIdSetMessagePayloadImpl implements PaymentInterfaceIdSetMessagePayload, ModelBase {

    private String type;

    private String interfaceId;

    private String oldInterfaceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentInterfaceIdSetMessagePayloadImpl(@JsonProperty("interfaceId") final String interfaceId,
            @JsonProperty("oldInterfaceId") final String oldInterfaceId) {
        this.interfaceId = interfaceId;
        this.oldInterfaceId = oldInterfaceId;
        this.type = PAYMENT_INTERFACE_ID_SET;
    }

    /**
     * create empty instance
     */
    public PaymentInterfaceIdSetMessagePayloadImpl() {
        this.type = PAYMENT_INTERFACE_ID_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Interface ID of the Payment after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     *  <p>Interface ID of the Payment before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
     */

    public String getOldInterfaceId() {
        return this.oldInterfaceId;
    }

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public void setOldInterfaceId(final String oldInterfaceId) {
        this.oldInterfaceId = oldInterfaceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentInterfaceIdSetMessagePayloadImpl that = (PaymentInterfaceIdSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(interfaceId, that.interfaceId)
                .append(oldInterfaceId, that.oldInterfaceId)
                .append(type, that.type)
                .append(interfaceId, that.interfaceId)
                .append(oldInterfaceId, that.oldInterfaceId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(interfaceId).append(oldInterfaceId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("interfaceId", interfaceId)
                .append("oldInterfaceId", oldInterfaceId)
                .build();
    }

    @Override
    public PaymentInterfaceIdSetMessagePayload copyDeep() {
        return PaymentInterfaceIdSetMessagePayload.deepCopy(this);
    }
}
