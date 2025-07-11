
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The representation sent to the server when updating an ImportContainer.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerUpdateDraftImpl implements ImportContainerUpdateDraft, ModelBase {

    private Long version;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportContainerUpdateDraftImpl(@JsonProperty("version") final Long version,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.version = version;
        this.resourceType = resourceType;
    }

    /**
     * create empty instance
     */
    public ImportContainerUpdateDraftImpl() {
    }

    /**
     *  <p>Current version of the ImportContainer.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
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

        return new EqualsBuilder().append(version, that.version)
                .append(resourceType, that.resourceType)
                .append(version, that.version)
                .append(resourceType, that.resourceType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(resourceType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("version", version)
                .append("resourceType", resourceType)
                .build();
    }

    @Override
    public ImportContainerUpdateDraft copyDeep() {
        return ImportContainerUpdateDraft.deepCopy(this);
    }
}
