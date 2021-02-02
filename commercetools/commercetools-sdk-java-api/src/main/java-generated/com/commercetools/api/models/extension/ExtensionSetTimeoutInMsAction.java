
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionSetTimeoutInMsActionImpl.class)
public interface ExtensionSetTimeoutInMsAction extends ExtensionUpdateAction {

    String SET_TIMEOUT_IN_MS = "setTimeoutInMs";

    /**
    *  <p>The maximum time the commercetools platform waits for a response from the extension.
    *  The maximum value is 2000 ms (2 seconds).
    *  This limit can be increased per project after we review the performance impact.
    *  Please contact Support via the support and provide the region, project key and use case.</p>
    */

    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    public void setTimeoutInMs(final Integer timeoutInMs);

    public static ExtensionSetTimeoutInMsAction of() {
        return new ExtensionSetTimeoutInMsActionImpl();
    }

    public static ExtensionSetTimeoutInMsAction of(final ExtensionSetTimeoutInMsAction template) {
        ExtensionSetTimeoutInMsActionImpl instance = new ExtensionSetTimeoutInMsActionImpl();
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    public static ExtensionSetTimeoutInMsActionBuilder builder() {
        return ExtensionSetTimeoutInMsActionBuilder.of();
    }

    public static ExtensionSetTimeoutInMsActionBuilder builder(final ExtensionSetTimeoutInMsAction template) {
        return ExtensionSetTimeoutInMsActionBuilder.of(template);
    }

    default <T> T withExtensionSetTimeoutInMsAction(Function<ExtensionSetTimeoutInMsAction, T> helper) {
        return helper.apply(this);
    }
}
