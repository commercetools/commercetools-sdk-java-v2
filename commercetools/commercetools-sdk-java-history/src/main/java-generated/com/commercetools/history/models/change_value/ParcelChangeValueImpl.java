
package com.commercetools.history.models.change_value;

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
 * ParcelChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelChangeValueImpl implements ParcelChangeValue, ModelBase {

    private String id;

    private String createdAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelChangeValueImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final String createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    /**
     * create empty instance
     */
    public ParcelChangeValueImpl() {
    }

    /**
     *  <p><code>id</code> of the Parcel.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Date and time (UTC) the Parcel was created.</p>
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelChangeValueImpl that = (ParcelChangeValueImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(createdAt, that.createdAt)
                .append(id, that.id)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(createdAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("createdAt", createdAt)
                .build();
    }

    @Override
    public ParcelChangeValue copyDeep() {
        return ParcelChangeValue.deepCopy(this);
    }
}
