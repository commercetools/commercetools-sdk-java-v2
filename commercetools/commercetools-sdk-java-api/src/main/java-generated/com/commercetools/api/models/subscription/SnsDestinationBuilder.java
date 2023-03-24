
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SnsDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SnsDestination snsDestination = SnsDestination.builder()
 *             .topicArn("{topicArn}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SnsDestinationBuilder implements Builder<SnsDestination> {

    @Nullable
    private String accessKey;

    @Nullable
    private String accessSecret;

    private String topicArn;

    @Nullable
    private com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode;

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @param accessKey value to be set
     * @return Builder
     */

    public SnsDestinationBuilder accessKey(@Nullable final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @param accessSecret value to be set
     * @return Builder
     */

    public SnsDestinationBuilder accessSecret(@Nullable final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    /**
     *  <p>Amazon Resource Name (ARN) of the topic.</p>
     * @param topicArn value to be set
     * @return Builder
     */

    public SnsDestinationBuilder topicArn(final String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     *  <p>Defines the method of authentication for the SNS topic.</p>
     * @param authenticationMode value to be set
     * @return Builder
     */

    public SnsDestinationBuilder authenticationMode(
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

    public String getTopicArn() {
        return this.topicArn;
    }

    @Nullable
    public com.commercetools.api.models.subscription.AwsAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * builds SnsDestination with checking for non-null required values
     * @return SnsDestination
     */
    public SnsDestination build() {
        Objects.requireNonNull(topicArn, SnsDestination.class + ": topicArn is missing");
        return new SnsDestinationImpl(accessKey, accessSecret, topicArn, authenticationMode);
    }

    /**
     * builds SnsDestination without checking for non-null required values
     * @return SnsDestination
     */
    public SnsDestination buildUnchecked() {
        return new SnsDestinationImpl(accessKey, accessSecret, topicArn, authenticationMode);
    }

    public static SnsDestinationBuilder of() {
        return new SnsDestinationBuilder();
    }

    public static SnsDestinationBuilder of(final SnsDestination template) {
        SnsDestinationBuilder builder = new SnsDestinationBuilder();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        builder.topicArn = template.getTopicArn();
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}
