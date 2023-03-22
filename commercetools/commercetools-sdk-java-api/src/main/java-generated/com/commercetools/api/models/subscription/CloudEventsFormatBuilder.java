
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CloudEventsFormatBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CloudEventsFormat cloudEventsFormat = CloudEventsFormat.builder()
 *             .cloudEventsVersion("{cloudEventsVersion}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CloudEventsFormatBuilder implements Builder<CloudEventsFormat> {

    private String cloudEventsVersion;

    /**
     *
     */

    public CloudEventsFormatBuilder cloudEventsVersion(final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
        return this;
    }

    public String getCloudEventsVersion() {
        return this.cloudEventsVersion;
    }

    public CloudEventsFormat build() {
        Objects.requireNonNull(cloudEventsVersion, CloudEventsFormat.class + ": cloudEventsVersion is missing");
        return new CloudEventsFormatImpl(cloudEventsVersion);
    }

    /**
     * builds CloudEventsFormat without checking for non null required values
     */
    public CloudEventsFormat buildUnchecked() {
        return new CloudEventsFormatImpl(cloudEventsVersion);
    }

    public static CloudEventsFormatBuilder of() {
        return new CloudEventsFormatBuilder();
    }

    public static CloudEventsFormatBuilder of(final CloudEventsFormat template) {
        CloudEventsFormatBuilder builder = new CloudEventsFormatBuilder();
        builder.cloudEventsVersion = template.getCloudEventsVersion();
        return builder;
    }

}
