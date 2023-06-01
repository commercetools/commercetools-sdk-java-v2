package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.AwsAuthenticationMode;
import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.SqsDestination;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     * @param accessKey value to be set
     * @return Builder
     */
    
    public SqsDestinationBuilder accessKey(@Nullable final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @param accessSecret value to be set
     * @return Builder
     */
    
    public SqsDestinationBuilder accessSecret(@Nullable final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    
    
    
    
    /**
     *  <p>URL of the Amazon SQS queue.</p>
     * @param queueUrl value to be set
     * @return Builder
     */
    
    public SqsDestinationBuilder queueUrl( final String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    
    
    /**
     *  <p>AWS Region the message queue is located in.</p>
     * @param region value to be set
     * @return Builder
     */
    
    public SqsDestinationBuilder region( final String region) {
        this.region = region;
        return this;
    }
    
    
    
    
    /**
     *  <p>Defines the method of authentication for the SQS queue.</p>
     * @param authenticationMode value to be set
     * @return Builder
     */
    
    public SqsDestinationBuilder authenticationMode(@Nullable final com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }
    
    

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @return accessKey
     */
    
    @Nullable
    public String getAccessKey(){
        return this.accessKey;
    }
    
    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @return accessSecret
     */
    
    @Nullable
    public String getAccessSecret(){
        return this.accessSecret;
    }
    
    /**
     *  <p>URL of the Amazon SQS queue.</p>
     * @return queueUrl
     */
    
    
    public String getQueueUrl(){
        return this.queueUrl;
    }
    
    /**
     *  <p>AWS Region the message queue is located in.</p>
     * @return region
     */
    
    
    public String getRegion(){
        return this.region;
    }
    
    /**
     *  <p>Defines the method of authentication for the SQS queue.</p>
     * @return authenticationMode
     */
    
    @Nullable
    public com.commercetools.api.models.subscription.AwsAuthenticationMode getAuthenticationMode(){
        return this.authenticationMode;
    }

    /**
     * builds SqsDestination with checking for non-null required values
     * @return SqsDestination
     */
    public SqsDestination build() {
        Objects.requireNonNull(queueUrl, SqsDestination.class + ": queueUrl is missing");
        Objects.requireNonNull(region, SqsDestination.class + ": region is missing");
        return new SqsDestinationImpl(accessKey, accessSecret, queueUrl, region, authenticationMode);
    }
    
    /**
     * builds SqsDestination without checking for non-null required values
     * @return SqsDestination
     */
    public SqsDestination buildUnchecked() {
        return new SqsDestinationImpl(accessKey, accessSecret, queueUrl, region, authenticationMode);
    }

    /**
     * factory method for an instance of SqsDestinationBuilder
     * @return builder 
     */
    public static SqsDestinationBuilder of() {
        return new SqsDestinationBuilder();
    }

    /**
     * create builder for SqsDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
