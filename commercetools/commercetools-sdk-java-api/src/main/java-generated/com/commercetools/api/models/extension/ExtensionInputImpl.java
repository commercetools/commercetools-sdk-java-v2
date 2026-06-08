
package com.commercetools.api.models.extension;

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
 * ExtensionInput
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionInputImpl implements ExtensionInput, ModelBase {

    private com.commercetools.api.models.extension.ExtensionAction action;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.common.Reference oldResource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionInputImpl(@JsonProperty("action") final com.commercetools.api.models.extension.ExtensionAction action,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("oldResource") final com.commercetools.api.models.common.Reference oldResource) {
        this.action = action;
        this.resource = resource;
        this.oldResource = oldResource;
    }

    /**
     * create empty instance
     */
    public ExtensionInputImpl() {
    }

    /**
     *  <p><code>Create</code> or <code>Update</code> request.</p>
     */

    public com.commercetools.api.models.extension.ExtensionAction getAction() {
        return this.action;
    }

    /**
     *  <p>Expanded reference to the resource that triggered the Extension.</p>
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Expanded reference to the resource as it was before the update. Only included when <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionAdditionalContext" rel="nofollow"><code>additionalContext.includeOldResource</code></a> is <code>true</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a> and the <code>action</code> is <code>Update</code>.</p>
     */

    public com.commercetools.api.models.common.Reference getOldResource() {
        return this.oldResource;
    }

    public void setAction(final com.commercetools.api.models.extension.ExtensionAction action) {
        this.action = action;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setOldResource(final com.commercetools.api.models.common.Reference oldResource) {
        this.oldResource = oldResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionInputImpl that = (ExtensionInputImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(resource, that.resource)
                .append(oldResource, that.oldResource)
                .append(action, that.action)
                .append(resource, that.resource)
                .append(oldResource, that.oldResource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(resource).append(oldResource).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("resource", resource)
                .append("oldResource", oldResource)
                .build();
    }

    @Override
    public ExtensionInput copyDeep() {
        return ExtensionInput.deepCopy(this);
    }
}
