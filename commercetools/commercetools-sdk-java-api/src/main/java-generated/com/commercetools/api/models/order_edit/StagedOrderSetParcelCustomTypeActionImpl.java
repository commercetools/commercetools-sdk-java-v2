
package com.commercetools.api.models.order_edit;

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
 * StagedOrderSetParcelCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelCustomTypeActionImpl implements StagedOrderSetParcelCustomTypeAction, ModelBase {

    private String action;

    private String parcelId;

    private String parcelKey;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetParcelCustomTypeActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("parcelKey") final String parcelKey,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.parcelId = parcelId;
        this.parcelKey = parcelKey;
        this.type = type;
        this.fields = fields;
        this.action = SET_PARCEL_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetParcelCustomTypeActionImpl() {
        this.action = SET_PARCEL_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setParcelKey(final String parcelKey) {
        this.parcelKey = parcelKey;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetParcelCustomTypeActionImpl that = (StagedOrderSetParcelCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(parcelId)
                .append(parcelKey)
                .append(type)
                .append(fields)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("parcelId", parcelId)
                .append("parcelKey", parcelKey)
                .append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public StagedOrderSetParcelCustomTypeAction copyDeep() {
        return StagedOrderSetParcelCustomTypeAction.deepCopy(this);
    }
}
