
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
 *  <p>Generated when a Custom Field has been removed from the Order using the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomFieldRemovedMessagePayloadImpl implements OrderCustomFieldRemovedMessagePayload, ModelBase {

    private String type;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomFieldRemovedMessagePayloadImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.type = ORDER_CUSTOM_FIELD_REMOVED;
    }

    /**
     * create empty instance
     */
    public OrderCustomFieldRemovedMessagePayloadImpl() {
        this.type = ORDER_CUSTOM_FIELD_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomFieldRemovedMessagePayloadImpl that = (OrderCustomFieldRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(type, that.type)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .build();
    }

    @Override
    public OrderCustomFieldRemovedMessagePayload copyDeep() {
        return OrderCustomFieldRemovedMessagePayload.deepCopy(this);
    }
}
