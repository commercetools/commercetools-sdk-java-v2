
package com.commercetools.api.models.extension;

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
 *  <p>Draft for <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionAdditionalContext" rel="nofollow">ExtensionAdditionalContext</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionAdditionalContextDraftImpl implements ExtensionAdditionalContextDraft, ModelBase {

    private Boolean includeOldResource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionAdditionalContextDraftImpl(@JsonProperty("includeOldResource") final Boolean includeOldResource) {
        this.includeOldResource = includeOldResource;
    }

    /**
     * create empty instance
     */
    public ExtensionAdditionalContextDraftImpl() {
    }

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     */

    public Boolean getIncludeOldResource() {
        return this.includeOldResource;
    }

    public void setIncludeOldResource(final Boolean includeOldResource) {
        this.includeOldResource = includeOldResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionAdditionalContextDraftImpl that = (ExtensionAdditionalContextDraftImpl) o;

        return new EqualsBuilder().append(includeOldResource, that.includeOldResource)
                .append(includeOldResource, that.includeOldResource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(includeOldResource).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("includeOldResource", includeOldResource)
                .build();
    }

    @Override
    public ExtensionAdditionalContextDraft copyDeep() {
        return ExtensionAdditionalContextDraft.deepCopy(this);
    }
}
