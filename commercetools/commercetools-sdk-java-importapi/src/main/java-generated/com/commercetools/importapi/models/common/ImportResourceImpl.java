
package com.commercetools.importapi.models.common;

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
 *  <p>A representation of the resource to import. Import resources are similar to draft types, but they only support key references. In general, import resources are more granular then regular resources. They are optimized for incremental updates and therefore have a slightly different structure.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportResourceImpl implements ImportResource, ModelBase {

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportResourceImpl(@JsonProperty("key") final String key) {
        this.key = key;
    }

    /**
     * create empty instance
     */
    public ImportResourceImpl() {
    }

    /**
     *  <p>User-defined unique identifier.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportResourceImpl that = (ImportResourceImpl) o;

        return new EqualsBuilder().append(key, that.key).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key).build();
    }

    @Override
    public ImportResource copyDeep() {
        return ImportResource.deepCopy(this);
    }
}
