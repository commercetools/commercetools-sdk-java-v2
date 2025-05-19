
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
 *  <p>The <code>data</code> of the Import Container Deleted Event.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerDeletedEventDataImpl implements ImportContainerDeletedEventData, ModelBase {

    private String key;

    private Integer version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportContainerDeletedEventDataImpl(@JsonProperty("key") final String key,
            @JsonProperty("version") final Integer version) {
        this.key = key;
        this.version = version;
    }

    /**
     * create empty instance
     */
    public ImportContainerDeletedEventDataImpl() {
    }

    /**
     *  <p>The <code>key</code> of the deleted Import Container.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <code>version</code> of the deleted Import Container.</p>
     */

    public Integer getVersion() {
        return this.version;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportContainerDeletedEventDataImpl that = (ImportContainerDeletedEventDataImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(version, that.version)
                .append(key, that.key)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(version).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("version", version)
                .build();
    }

    @Override
    public ImportContainerDeletedEventData copyDeep() {
        return ImportContainerDeletedEventData.deepCopy(this);
    }
}
