
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCustomTypeSetMessagePayloadImpl
        implements RecurringOrderCustomTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields customFields;

    private String previousTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderCustomTypeSetMessagePayloadImpl(
            @JsonProperty("customFields") final com.commercetools.api.models.type.CustomFields customFields,
            @JsonProperty("previousTypeId") final String previousTypeId) {
        this.customFields = customFields;
        this.previousTypeId = previousTypeId;
        this.type = RECURRING_ORDER_CUSTOM_TYPE_SET;
    }

    /**
     * create empty instance
     */
    public RecurringOrderCustomTypeSetMessagePayloadImpl() {
        this.type = RECURRING_ORDER_CUSTOM_TYPE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     */

    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    public void setCustomFields(final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
    }

    public void setPreviousTypeId(final String previousTypeId) {
        this.previousTypeId = previousTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderCustomTypeSetMessagePayloadImpl that = (RecurringOrderCustomTypeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customFields).append(previousTypeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customFields", customFields)
                .append("previousTypeId", previousTypeId)
                .build();
    }

    @Override
    public RecurringOrderCustomTypeSetMessagePayload copyDeep() {
        return RecurringOrderCustomTypeSetMessagePayload.deepCopy(this);
    }
}
