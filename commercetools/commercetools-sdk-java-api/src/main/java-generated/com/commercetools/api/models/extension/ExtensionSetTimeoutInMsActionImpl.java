
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
 * ExtensionSetTimeoutInMsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetTimeoutInMsActionImpl implements ExtensionSetTimeoutInMsAction, ModelBase {

    private String action;

    private Integer timeoutInMs;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionSetTimeoutInMsActionImpl(@JsonProperty("timeoutInMs") final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        this.action = SET_TIMEOUT_IN_MS;
    }

    /**
     * create empty instance
     */
    public ExtensionSetTimeoutInMsActionImpl() {
        this.action = SET_TIMEOUT_IN_MS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If not defined, the maximum value is used. If no timeout is provided, the default value is used for all types of Extensions, including <code>payment</code> Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact the Composable Commerce support team and provide the Region, Project key, and use case.</p>
     */

    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
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

        ExtensionSetTimeoutInMsActionImpl that = (ExtensionSetTimeoutInMsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(timeoutInMs, that.timeoutInMs)
                .append(action, that.action)
                .append(timeoutInMs, that.timeoutInMs)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(timeoutInMs).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("timeoutInMs", timeoutInMs)
                .build();
    }

}
