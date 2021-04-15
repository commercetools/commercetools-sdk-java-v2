
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionSetTimeoutInMsActionImpl implements ExtensionSetTimeoutInMsAction {

    private String action;

    private Integer timeoutInMs;

    @JsonCreator
    ExtensionSetTimeoutInMsActionImpl(@JsonProperty("timeoutInMs") final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        this.action = SET_TIMEOUT_IN_MS;
    }

    public ExtensionSetTimeoutInMsActionImpl() {
        this.action = SET_TIMEOUT_IN_MS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The maximum time the commercetools platform waits for a response from the extension.
    *  The maximum value is 2000 ms (2 seconds).
    *  This limit can be increased per project after we review the performance impact.
    *  Please contact Support via the support and provide the region, project key and use case.</p>
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

        return new EqualsBuilder().append(action, that.action).append(timeoutInMs, that.timeoutInMs).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(timeoutInMs).toHashCode();
    }

}
