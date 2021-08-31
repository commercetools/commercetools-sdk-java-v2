
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionSetTimeoutInMsActionBuilder implements Builder<ExtensionSetTimeoutInMsAction> {

    @Nullable
    private Integer timeoutInMs;

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
