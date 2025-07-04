
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
 *  <p>The representation sent to the server when creating an ImportContainer.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerDraftImpl implements ImportContainerDraft, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportContainerDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType,
            @JsonProperty("retentionPolicy") final com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy) {
        this.key = key;
        this.resourceType = resourceType;
        this.retentionPolicy = retentionPolicy;
    }

    /**
     * create empty instance
     */
    public ImportContainerDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>Set a retention policy to automatically delete the ImportContainer after a defined period.</p>
     */

    public com.commercetools.importapi.models.importcontainers.RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setResourceType(final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public void setRetentionPolicy(
            final com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportContainerDraftImpl that = (ImportContainerDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(resourceType, that.resourceType)
                .append(retentionPolicy, that.retentionPolicy)
                .append(key, that.key)
                .append(resourceType, that.resourceType)
                .append(retentionPolicy, that.retentionPolicy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(resourceType).append(retentionPolicy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("resourceType", resourceType)
                .append("retentionPolicy", retentionPolicy)
                .build();
    }

    @Override
    public ImportContainerDraft copyDeep() {
        return ImportContainerDraft.deepCopy(this);
    }
}
