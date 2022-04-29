
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetParcelCustomFieldActionImpl implements StagedOrderSetParcelCustomFieldAction, ModelBase {

    private String action;

    private String parcelId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    StagedOrderSetParcelCustomFieldActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.parcelId = parcelId;
        this.name = name;
        this.value = value;
        this.action = SET_PARCEL_CUSTOM_FIELD;
    }

    public StagedOrderSetParcelCustomFieldActionImpl() {
        this.action = SET_PARCEL_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */
    public java.lang.Object getValue() {
        return this.value;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetParcelCustomFieldActionImpl that = (StagedOrderSetParcelCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).append(name).append(value).toHashCode();
    }

}
