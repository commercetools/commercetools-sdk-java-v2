
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SqsDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SqsDestination sqsDestination = SqsDestination.builder()
 *             .queueUrl("{queueUrl}")
 *             .region("{region}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SqsDestinationBuilder implements Builder<SqsDestination> {

    @Nullable
    private String accessKey;

    @Nullable
    private String accessSecret;

    private String queueUrl;

    private String region;

    @Nullable
    private com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode;

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     */

    public SqsDestinationBuilder accessKey(@Nullable final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     */

    public SqsDestinationBuilder accessSecret(@Nullable final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    /**
     *  <p>URL of the Amazon SQS queue.</p>
     */

    public SqsDestinationBuilder queueUrl(final String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     *  <p>AWS Region the message queue is located in.</p>
     */

    public SqsDestinationBuilder region(final String region) {
        this.region = region;
        return this;
    }

    /**
     *  <p>Defines the method of authentication for the SQS queue.</p>
     */

    public SqsDestinationBuilder authenticationMode(
            @Nullable final com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    @Nullable
    public String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public String getQueueUrl() {
        return this.queueUrl;
    }

    public String getRegion() {
        return this.region;
    }

    @Nullable
    public com.commercetools.api.models.subscription.AwsAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public SqsDestination build() {
        Objects.requireNonNull(queueUrl, SqsDestination.class + ": queueUrl is missing");
        Objects.requireNonNull(region, SqsDestination.class + ": region is missing");
        return new SqsDestinationImpl(accessKey, accessSecret, queueUrl, region, authenticationMode);
    }

    /**
     * builds SqsDestination without checking for non null required values
     */
    public SqsDestination buildUnchecked() {
        return new SqsDestinationImpl(accessKey, accessSecret, queueUrl, region, authenticationMode);
    }

    public static SqsDestinationBuilder of() {
        return new SqsDestinationBuilder();
    }

    public static SqsDestinationBuilder of(final SqsDestination template) {
        SqsDestinationBuilder builder = new SqsDestinationBuilder();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        builder.queueUrl = template.getQueueUrl();
        builder.region = template.getRegion();
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}
