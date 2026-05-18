
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetTimeoutInMsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetTimeoutInMsAction extensionSetTimeoutInMsAction = ExtensionSetTimeoutInMsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetTimeoutInMsActionBuilder implements Builder<ExtensionSetTimeoutInMsAction> {

    @Nullable
    private Integer timeoutInMs;

    /**
     *  <p>Value to set. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>. We recommend keeping the timeout as low as possible to avoid performance issues.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>Composable Commerce support team</span> and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs value to be set
     * @return Builder
     */

    public ExtensionSetTimeoutInMsActionBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    /**
     *  <p>Value to set. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>. We recommend keeping the timeout as low as possible to avoid performance issues.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>Composable Commerce support team</span> and provide the Region, Project key, and use case.</p>
     * @return timeoutInMs
     */

    @Nullable
    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    /**
     * builds ExtensionSetTimeoutInMsAction with checking for non-null required values
     * @return ExtensionSetTimeoutInMsAction
     */
    public ExtensionSetTimeoutInMsAction build() {
        return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
    }

    /**
     * builds ExtensionSetTimeoutInMsAction without checking for non-null required values
     * @return ExtensionSetTimeoutInMsAction
     */
    public ExtensionSetTimeoutInMsAction buildUnchecked() {
        return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
    }

    /**
     * factory method for an instance of ExtensionSetTimeoutInMsActionBuilder
     * @return builder
     */
    public static ExtensionSetTimeoutInMsActionBuilder of() {
        return new ExtensionSetTimeoutInMsActionBuilder();
    }

    /**
     * create builder for ExtensionSetTimeoutInMsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetTimeoutInMsActionBuilder of(final ExtensionSetTimeoutInMsAction template) {
        ExtensionSetTimeoutInMsActionBuilder builder = new ExtensionSetTimeoutInMsActionBuilder();
        builder.timeoutInMs = template.getTimeoutInMs();
        return builder;
    }

}
