
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
 *  <p>Successful <code>201</code> response from a <span>/responses</span> request. Returns the created entity in commercetools REST representation, together with any non-fatal <code>warnings</code>.</p>
 *  <p>The concrete type depends on <code>entityType</code>:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesCartSuccess" rel="nofollow">AgentResponsesCartSuccess</a> when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> was created</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesQuoteRequestSuccess" rel="nofollow">AgentResponsesQuoteRequestSuccess</a> when a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> was created</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesSuccessImpl implements AgentResponsesSuccess, ModelBase {

    private com.commercetools.api.models.agent.AgentResponsesOutputType entityType;

    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    private String threadId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentResponsesSuccessImpl(
            @JsonProperty("entityType") final com.commercetools.api.models.agent.AgentResponsesOutputType entityType,
            @JsonProperty("warnings") final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings,
            @JsonProperty("threadId") final String threadId) {
        this.entityType = entityType;
        this.warnings = warnings;
        this.threadId = threadId;
    }

    /**
     * create empty instance
     */
    public AgentResponsesSuccessImpl() {
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

    public void setWarnings(final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
    }

    public void setWarnings(final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
    }

    public void setThreadId(final String threadId) {
        this.threadId = threadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentResponsesSuccessImpl that = (AgentResponsesSuccessImpl) o;

        return new EqualsBuilder().append(entityType, that.entityType)
                .append(warnings, that.warnings)
                .append(threadId, that.threadId)
                .append(entityType, that.entityType)
                .append(warnings, that.warnings)
                .append(threadId, that.threadId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(entityType).append(warnings).append(threadId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("entityType", entityType)
                .append("warnings", warnings)
                .append("threadId", threadId)
                .build();
    }

    @Override
    public AgentResponsesSuccess copyDeep() {
        return AgentResponsesSuccess.deepCopy(this);
    }
}
