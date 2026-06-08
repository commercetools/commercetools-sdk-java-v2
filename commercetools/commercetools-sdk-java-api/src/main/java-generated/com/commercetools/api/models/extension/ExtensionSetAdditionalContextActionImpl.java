
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
 * ExtensionSetAdditionalContextAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetAdditionalContextActionImpl implements ExtensionSetAdditionalContextAction, ModelBase {

    private String action;

    private com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionSetAdditionalContextActionImpl(
            @JsonProperty("additionalContext") final com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext) {
        this.additionalContext = additionalContext;
        this.action = SET_ADDITIONAL_CONTEXT;
    }

    /**
     * create empty instance
     */
    public ExtensionSetAdditionalContextActionImpl() {
        this.action = SET_ADDITIONAL_CONTEXT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

    public com.commercetools.api.models.extension.ExtensionAdditionalContextDraft getAdditionalContext() {
        return this.additionalContext;
    }

    public void setAdditionalContext(
            final com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext) {
        this.additionalContext = additionalContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionSetAdditionalContextActionImpl that = (ExtensionSetAdditionalContextActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(additionalContext, that.additionalContext)
                .append(action, that.action)
                .append(additionalContext, that.additionalContext)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(additionalContext).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("additionalContext", additionalContext)
                .build();
    }

    @Override
    public ExtensionSetAdditionalContextAction copyDeep() {
        return ExtensionSetAdditionalContextAction.deepCopy(this);
    }
}
