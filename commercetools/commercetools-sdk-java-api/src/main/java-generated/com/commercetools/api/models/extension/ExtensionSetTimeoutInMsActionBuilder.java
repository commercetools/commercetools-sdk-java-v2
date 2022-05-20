
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionSetTimeoutInMsActionBuilder implements Builder<ExtensionSetTimeoutInMsAction> {

    @Nullable
    private Integer timeoutInMs;

    /**
    *  <p>Value to set. If not defined, the maximum value is used. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
    *  <p>This limit can be increased per Project after we review the performance impact. Please contact our support via the Support Portal and provide the Region, Project key, and use case.</p>
    */

    public ExtensionSetTimeoutInMsActionBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    @Nullable
    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    public ExtensionSetTimeoutInMsAction build() {
        return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
    }

    /**
     * builds ExtensionSetTimeoutInMsAction without checking for non null required values
     */
    public ExtensionSetTimeoutInMsAction buildUnchecked() {
        return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
    }

    public static ExtensionSetTimeoutInMsActionBuilder of() {
        return new ExtensionSetTimeoutInMsActionBuilder();
    }

    public static ExtensionSetTimeoutInMsActionBuilder of(final ExtensionSetTimeoutInMsAction template) {
        ExtensionSetTimeoutInMsActionBuilder builder = new ExtensionSetTimeoutInMsActionBuilder();
        builder.timeoutInMs = template.getTimeoutInMs();
        return builder;
    }

}
