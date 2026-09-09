
package com.commercetools.api.models.agent;

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
 *  <p>Successful <code>201</code> response from a <span>/responses</span> request when <code>outputType</code> is <code>Cart</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesCartSuccessImpl implements AgentResponsesCartSuccess, ModelBase {

    private com.commercetools.api.models.agent.AgentResponsesOutputType entityType;

    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    private String threadId;

    private com.commercetools.api.models.cart.Cart entity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentResponsesCartSuccessImpl(
            @JsonProperty("warnings") final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings,
            @JsonProperty("threadId") final String threadId,
            @JsonProperty("entity") final com.commercetools.api.models.cart.Cart entity) {
        this.warnings = warnings;
        this.threadId = threadId;
        this.entity = entity;
        this.entityType = AgentResponsesOutputType.findEnum("Cart");
    }

    /**
     * create empty instance
     */
    public AgentResponsesCartSuccessImpl() {
        this.entityType = AgentResponsesOutputType.findEnum("Cart");
    }

    /**
     *  <p>The entity that was created. Determines the concrete response type.</p>
     */

    public com.commercetools.api.models.agent.AgentResponsesOutputType getEntityType() {
        return this.entityType;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.warning.WarningObject> getWarnings() {
        return this.warnings;
    }

    /**
     *  <p>Identifier of the workflow run that produced this response.</p>
     */

    public String getThreadId() {
        return this.threadId;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     */

    public com.commercetools.api.models.cart.Cart getEntity() {
        return this.entity;
    }

    public void setWarnings(final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
    }

    public void setWarnings(final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
    }

    public void setThreadId(final String threadId) {
        this.threadId = threadId;
    }

    public void setEntity(final com.commercetools.api.models.cart.Cart entity) {
        this.entity = entity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentResponsesCartSuccessImpl that = (AgentResponsesCartSuccessImpl) o;

        return new EqualsBuilder().append(entityType, that.entityType)
                .append(warnings, that.warnings)
                .append(threadId, that.threadId)
                .append(entity, that.entity)
                .append(entityType, that.entityType)
                .append(warnings, that.warnings)
                .append(threadId, that.threadId)
                .append(entity, that.entity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(entityType)
                .append(warnings)
                .append(threadId)
                .append(entity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("entityType", entityType)
                .append("warnings", warnings)
                .append("threadId", threadId)
                .append("entity", entity)
                .build();
    }

    @Override
    public AgentResponsesCartSuccess copyDeep() {
        return AgentResponsesCartSuccess.deepCopy(this);
    }
}
