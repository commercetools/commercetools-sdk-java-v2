
package com.commercetools.api.models.event;

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
 *  <p>The <code>data</code> of the Import Operation Rejected Event.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportOperationRejectedEventDataImpl implements ImportOperationRejectedEventData, ModelBase {

    private String id;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportOperationRejectedEventDataImpl(@JsonProperty("id") final String id) {
        this.id = id;
    }

    /**
     * create empty instance
     */
    public ImportOperationRejectedEventDataImpl() {
    }

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>rejected</code> state.</p>
     */

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportOperationRejectedEventDataImpl that = (ImportOperationRejectedEventDataImpl) o;

        return new EqualsBuilder().append(id, that.id).append(id, that.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id).build();
    }

    @Override
    public ImportOperationRejectedEventData copyDeep() {
        return ImportOperationRejectedEventData.deepCopy(this);
    }
}
