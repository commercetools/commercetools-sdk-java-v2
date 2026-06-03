
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
 * ExtensionDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionDraftImpl implements ExtensionDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    private Integer timeoutInMs;

    private java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies;

    private java.util.List<String> expansionPaths;

    private com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("destination") final com.commercetools.api.models.extension.ExtensionDestination destination,
            @JsonProperty("triggers") final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers,
            @JsonProperty("timeoutInMs") final Integer timeoutInMs,
            @JsonProperty("dependencies") final java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies,
            @JsonProperty("expansionPaths") final java.util.List<String> expansionPaths,
            @JsonProperty("additionalContext") final com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext) {
        this.key = key;
        this.destination = destination;
        this.triggers = triggers;
        this.timeoutInMs = timeoutInMs;
        this.dependencies = dependencies;
        this.expansionPaths = expansionPaths;
        this.additionalContext = additionalContext;
    }

    /**
     * create empty instance
     */
    public ExtensionDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Extension.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Defines where the Extension can be reached.</p>
     */

    public com.commercetools.api.models.extension.ExtensionDestination getDestination() {
        return this.destination;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    /**
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>. We recommend keeping the timeout as low as possible to avoid performance issues.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>commercetools support team</span> and provide the Region, Project key, and use case.</p>
     */

    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> getDependencies() {
        return this.dependencies;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     */

    public java.util.List<String> getExpansionPaths() {
        return this.expansionPaths;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     */

    public com.commercetools.api.models.extension.ExtensionAdditionalContextDraft getAdditionalContext() {
        return this.additionalContext;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDestination(final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
    }

    public void setTriggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
    }

    public void setTriggers(final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
    }

    public void setTimeoutInMs(final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
    }

    public void setDependencies(
            final com.commercetools.api.models.extension.ExtensionResourceIdentifier... dependencies) {
        this.dependencies = new ArrayList<>(Arrays.asList(dependencies));
    }

    public void setDependencies(
            final java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies) {
        this.dependencies = dependencies;
    }

    public void setExpansionPaths(final String... expansionPaths) {
        this.expansionPaths = new ArrayList<>(Arrays.asList(expansionPaths));
    }

    public void setExpansionPaths(final java.util.List<String> expansionPaths) {
        this.expansionPaths = expansionPaths;
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

        ExtensionDraftImpl that = (ExtensionDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(destination, that.destination)
                .append(triggers, that.triggers)
                .append(timeoutInMs, that.timeoutInMs)
                .append(dependencies, that.dependencies)
                .append(expansionPaths, that.expansionPaths)
                .append(additionalContext, that.additionalContext)
                .append(key, that.key)
                .append(destination, that.destination)
                .append(triggers, that.triggers)
                .append(timeoutInMs, that.timeoutInMs)
                .append(dependencies, that.dependencies)
                .append(expansionPaths, that.expansionPaths)
                .append(additionalContext, that.additionalContext)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(destination)
                .append(triggers)
                .append(timeoutInMs)
                .append(dependencies)
                .append(expansionPaths)
                .append(additionalContext)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("destination", destination)
                .append("triggers", triggers)
                .append("timeoutInMs", timeoutInMs)
                .append("dependencies", dependencies)
                .append("expansionPaths", expansionPaths)
                .append("additionalContext", additionalContext)
                .build();
    }

    @Override
    public ExtensionDraft copyDeep() {
        return ExtensionDraft.deepCopy(this);
    }
}
