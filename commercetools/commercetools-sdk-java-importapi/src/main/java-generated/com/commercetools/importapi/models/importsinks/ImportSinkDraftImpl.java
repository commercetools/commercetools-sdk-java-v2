
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
*  <p>The representation sent to the server when creating or updating an import sink.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkDraftImpl implements ImportSinkDraft {

    private Long version;

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    @JsonCreator
    ImportSinkDraftImpl(@JsonProperty("version") final Long version, @JsonProperty("key") final String key,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.version = version;
        this.key = key;
        this.resourceType = resourceType;
    }

    public ImportSinkDraftImpl() {
    }

    /**
    *  <p>The version of this resource.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>The unique key of the import sink.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The type of import resource sent to this import sink.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setResourceType(final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportSinkDraftImpl that = (ImportSinkDraftImpl) o;

        return new EqualsBuilder().append(version, that.version).append(key, that.key).append(resourceType,
            that.resourceType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(key).append(resourceType).toHashCode();
    }

}
