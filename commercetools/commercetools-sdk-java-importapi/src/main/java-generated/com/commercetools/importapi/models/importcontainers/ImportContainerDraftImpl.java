
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
*  <p>The representation sent to the server when creating an <a href="#importcontainer">ImportContainer</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportContainerDraftImpl implements ImportContainerDraft, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    @JsonCreator
    ImportContainerDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.key = key;
        this.resourceType = resourceType;
    }

    public ImportContainerDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier of the ImportContainer.
    *  Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The <a href="#importresourcetype">resource type</a> to be imported.
    *  If not given, the ImportContainer is able to import all of the supported <a href="#importresourcetype">ImportResourceTypes</a>.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
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

        ImportContainerDraftImpl that = (ImportContainerDraftImpl) o;

        return new EqualsBuilder().append(key, that.key).append(resourceType, that.resourceType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(resourceType).toHashCode();
    }

}
