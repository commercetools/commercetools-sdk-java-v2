
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The representation sent to the server when updating an import container.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportContainerUpdateDraftImpl implements ImportContainerUpdateDraft, ModelBase {

    private Long version;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    @JsonCreator
    ImportContainerUpdateDraftImpl(@JsonProperty("version") final Long version,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.version = version;
        this.resourceType = resourceType;
    }

    public ImportContainerUpdateDraftImpl() {
    }

    /**
    *  <p>Current version of the ImportContainer.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>The <a href="#importresourcetype">resource type</a> to be imported.
    *  If not given, the ImportContainer is able to import all of the supported <a href="#importresourcetype">ImportResourceTypes</a>.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    public void setVersion(final Long version) {
        this.version = version;
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

        ImportContainerUpdateDraftImpl that = (ImportContainerUpdateDraftImpl) o;

        return new EqualsBuilder().append(version, that.version).append(resourceType, that.resourceType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(resourceType).toHashCode();
    }

}
