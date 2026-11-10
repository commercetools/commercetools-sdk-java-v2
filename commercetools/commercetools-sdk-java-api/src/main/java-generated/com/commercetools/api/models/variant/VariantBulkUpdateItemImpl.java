
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
 *  <p>Identifies a single Variant to be updated in a bulk update request. Provide either <code>id</code> or <code>key</code> to identify the Variant.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateItemImpl implements VariantBulkUpdateItem, ModelBase {

    private String id;

    private String key;

    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("version") final Long version) {
        this.id = id;
        this.key = key;
        this.version = version;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateItemImpl() {
    }

    /**
     *  <p>Unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Expected version of the Variant. Required when the <code>versionControl</code> query parameter is <code>On</code> (the default). If the version does not match, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned for that item. Not required when <code>versionControl=Off</code>.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
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

        VariantBulkUpdateItemImpl that = (VariantBulkUpdateItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(version, that.version)
                .append(id, that.id)
                .append(key, that.key)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(key).append(version).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("version", version)
                .build();
    }

    @Override
    public VariantBulkUpdateItem copyDeep() {
        return VariantBulkUpdateItem.deepCopy(this);
    }
}
