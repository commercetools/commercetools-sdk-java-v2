
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
    *  <p>Value to set. If not defined, the maximum value is used.
    *  If no timeout is provided, the default value is used for all types of Extensions.
    *  The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
    *  <p>This limit can be increased per Project after we review the performance impact.
    *  Please contact our support via the <a href="https://support.commercetools.com/">Support Portal</a> and provide the Region, Project key, and use case.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionSetTimeoutInMsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionSetTimeoutInMsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionSetTimeoutInMsAction>";
            }
        };
    }
}
