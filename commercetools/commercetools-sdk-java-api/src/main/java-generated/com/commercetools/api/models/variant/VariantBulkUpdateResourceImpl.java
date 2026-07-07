
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of a Variant after a successful bulk update.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateResourceImpl implements VariantBulkUpdateResource, ModelBase {

    private String id;

    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateResourceImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version) {
        this.id = id;
        this.version = version;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateResourceImpl() {
    }

    /**
     *  <p>Unique identifier of the updated Variant.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The new version of the Variant after the update.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantBulkUpdateResourceImpl that = (VariantBulkUpdateResourceImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(id, that.id)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(version).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .build();
    }

    @Override
    public VariantBulkUpdateResource copyDeep() {
        return VariantBulkUpdateResource.deepCopy(this);
    }
}
