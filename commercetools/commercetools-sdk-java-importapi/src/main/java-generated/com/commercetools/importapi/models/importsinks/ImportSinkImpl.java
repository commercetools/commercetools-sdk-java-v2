
package com.commercetools.importapi.models.importsinks;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>An import sink is the entry point for import resources from other systems.</p>
*  <p>It has an unique key and is specific to an import resource type.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkImpl implements ImportSink {

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @JsonCreator
    ImportSinkImpl(@JsonProperty("key") final String key,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType,
            @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.key = key;
        this.resourceType = resourceType;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }

    public ImportSinkImpl() {
    }

    /**
    *  <p>The unique key of the import sink.</p>
    *  <p>Valid characters are: alphabetic characters (A-Z, a-z), numeric characters (0-9), underscores (_) and hyphens (-).</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The type of import resource sent to this import sink.
    *  You can only send one resource type per import sink.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
    *  <p>The version of this resource.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>When the import sink was created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>When the import sink was modified.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setResourceType(final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportSinkImpl that = (ImportSinkImpl) o;

        return new EqualsBuilder().append(key, that.key).append(resourceType, that.resourceType).append(version,
            that.version).append(createdAt, that.createdAt).append(lastModifiedAt, that.lastModifiedAt).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(resourceType).append(version).append(createdAt).append(
            lastModifiedAt).toHashCode();
    }

}
