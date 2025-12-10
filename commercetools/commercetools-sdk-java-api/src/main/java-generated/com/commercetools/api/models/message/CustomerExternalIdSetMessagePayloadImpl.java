
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetExternalIdAction" rel="nofollow">Set External ID</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerExternalIdSetMessagePayloadImpl implements CustomerExternalIdSetMessagePayload, ModelBase {

    private String type;

    private String externalId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerExternalIdSetMessagePayloadImpl(@JsonProperty("externalId") final String externalId) {
        this.externalId = externalId;
        this.type = CUSTOMER_EXTERNAL_ID_SET;
    }

    /**
     * create empty instance
     */
    public CustomerExternalIdSetMessagePayloadImpl() {
        this.type = CUSTOMER_EXTERNAL_ID_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The identifier that was set.</p>
     */

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerExternalIdSetMessagePayloadImpl that = (CustomerExternalIdSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(externalId, that.externalId)
                .append(type, that.type)
                .append(externalId, that.externalId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(externalId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("externalId", externalId)
                .build();
    }

    @Override
    public CustomerExternalIdSetMessagePayload copyDeep() {
        return CustomerExternalIdSetMessagePayload.deepCopy(this);
    }
}
