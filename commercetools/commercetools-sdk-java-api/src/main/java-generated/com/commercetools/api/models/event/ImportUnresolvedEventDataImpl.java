
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
 *  <p>The <code>data</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ImportUnresolvedEvent" rel="nofollow">Import Unresolved Event</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportUnresolvedEventDataImpl implements ImportUnresolvedEventData, ModelBase {

    private String id;

    private Integer version;

    private String importContainerKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportUnresolvedEventDataImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Integer version,
            @JsonProperty("importContainerKey") final String importContainerKey) {
        this.id = id;
        this.version = version;
        this.importContainerKey = importContainerKey;
    }

    /**
     * create empty instance
     */
    public ImportUnresolvedEventDataImpl() {
    }

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>unresolved</code> state.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>unresolved</code> state.</p>
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     */

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportUnresolvedEventDataImpl that = (ImportUnresolvedEventDataImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(importContainerKey, that.importContainerKey)
                .append(id, that.id)
                .append(version, that.version)
                .append(importContainerKey, that.importContainerKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(version).append(importContainerKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("importContainerKey", importContainerKey)
                .build();
    }

    @Override
    public ImportUnresolvedEventData copyDeep() {
        return ImportUnresolvedEventData.deepCopy(this);
    }
}
