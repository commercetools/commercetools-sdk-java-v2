
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
 *  <p>Generated after a successful Reset Customer's Password, Reset Customer's Password in a Store, Change Customer's Password, or Change Customer's Password in a Store request. This Message is also produced during equivalent requests to the My Customer Profile endpoint.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordUpdatedMessagePayloadImpl implements CustomerPasswordUpdatedMessagePayload, ModelBase {

    private String type;

    private Boolean reset;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerPasswordUpdatedMessagePayloadImpl(@JsonProperty("reset") final Boolean reset) {
        this.reset = reset;
        this.type = CUSTOMER_PASSWORD_UPDATED;
    }

    /**
     * create empty instance
     */
    public CustomerPasswordUpdatedMessagePayloadImpl() {
        this.type = CUSTOMER_PASSWORD_UPDATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     */

    public Boolean getReset() {
        return this.reset;
    }

    public void setReset(final Boolean reset) {
        this.reset = reset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerPasswordUpdatedMessagePayloadImpl that = (CustomerPasswordUpdatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(reset, that.reset)
                .append(type, that.type)
                .append(reset, that.reset)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(reset).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("reset", reset)
                .build();
    }

    @Override
    public CustomerPasswordUpdatedMessagePayload copyDeep() {
        return CustomerPasswordUpdatedMessagePayload.deepCopy(this);
    }
}
