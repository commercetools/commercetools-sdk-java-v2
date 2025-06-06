
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
 * ExtensionDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionDraftImpl implements ExtensionDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    private Integer timeoutInMs;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("destination") final com.commercetools.api.models.extension.ExtensionDestination destination,
            @JsonProperty("triggers") final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers,
            @JsonProperty("timeoutInMs") final Integer timeoutInMs) {
        this.key = key;
        this.destination = destination;
        this.triggers = triggers;
        this.timeoutInMs = timeoutInMs;
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
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions, including <code>payment</code> Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact the Composable Commerce support team and provide the Region, Project key, and use case.</p>
     */

    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
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
                .append(key, that.key)
                .append(destination, that.destination)
                .append(triggers, that.triggers)
                .append(timeoutInMs, that.timeoutInMs)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(destination)
                .append(triggers)
                .append(timeoutInMs)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("destination", destination)
                .append("triggers", triggers)
                .append("timeoutInMs", timeoutInMs)
                .build();
    }

    @Override
    public ExtensionDraft copyDeep() {
        return ExtensionDraft.deepCopy(this);
    }
}
