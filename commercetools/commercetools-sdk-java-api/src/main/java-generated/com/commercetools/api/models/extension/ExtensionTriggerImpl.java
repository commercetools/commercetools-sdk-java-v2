
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

/**
 * ExtensionTrigger
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionTriggerImpl implements ExtensionTrigger, ModelBase {

    private com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId;

    private java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions;

    private String condition;

    @JsonCreator
    ExtensionTriggerImpl(
            @JsonProperty("resourceTypeId") final com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions,
            @JsonProperty("condition") final String condition) {
        this.resourceTypeId = resourceTypeId;
        this.actions = actions;
        this.condition = condition;
    }

    public ExtensionTriggerImpl() {
    }

    /**
     *  <p><code>cart</code>, <code>order</code>, <code>payment</code>, and <code>customer</code> are supported.</p>
     */

    public com.commercetools.api.models.extension.ExtensionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionAction> getActions() {
        return this.actions;
    }

    /**
     *  <p>Valid predicate that controls the conditions under which the API Extension is called. The Extension is not triggered when the specified condition is not fulfilled.</p>
     */

    public String getCondition() {
        return this.condition;
    }

    public void setResourceTypeId(final com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public void setActions(final com.commercetools.api.models.extension.ExtensionAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(final java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions) {
        this.actions = actions;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionTriggerImpl that = (ExtensionTriggerImpl) o;

        return new EqualsBuilder().append(resourceTypeId, that.resourceTypeId)
                .append(actions, that.actions)
                .append(condition, that.condition)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(resourceTypeId).append(actions).append(condition).toHashCode();
    }

}
