
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AWSLambdaDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AWSLambdaDestination aWSLambdaDestination = AWSLambdaDestination.builder()
 *             .arn("{arn}")
 *             .accessKey("{accessKey}")
 *             .accessSecret("{accessSecret}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AWSLambdaDestinationBuilder implements Builder<AWSLambdaDestination> {

    private String arn;

    private String accessKey;

    private String accessSecret;

    /**
     *  <p>Amazon Resource Name (ARN) of the Lambda function in the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;</code>. Use the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;:&lt;functionAlias/version&gt;</code> to point to a specific version of the function.</p>
     * @param arn value to be set
     * @return Builder
     */

    public AWSLambdaDestinationBuilder arn(final String arn) {
        this.arn = arn;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param accessKey value to be set
     * @return Builder
     */

    public AWSLambdaDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param accessSecret value to be set
     * @return Builder
     */

    public AWSLambdaDestinationBuilder accessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    /**
     *  <p>Amazon Resource Name (ARN) of the Lambda function in the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;</code>. Use the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;:&lt;functionAlias/version&gt;</code> to point to a specific version of the function.</p>
     * @return arn
     */

    public String getArn() {
        return this.arn;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return accessKey
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return accessSecret
     */

    public String getAccessSecret() {
        return this.accessSecret;
    }

    /**
     * builds AWSLambdaDestination with checking for non-null required values
     * @return AWSLambdaDestination
     */
    public AWSLambdaDestination build() {
        Objects.requireNonNull(arn, AWSLambdaDestination.class + ": arn is missing");
        Objects.requireNonNull(accessKey, AWSLambdaDestination.class + ": accessKey is missing");
        Objects.requireNonNull(accessSecret, AWSLambdaDestination.class + ": accessSecret is missing");
        return new AWSLambdaDestinationImpl(arn, accessKey, accessSecret);
    }

    /**
     * builds AWSLambdaDestination without checking for non-null required values
     * @return AWSLambdaDestination
     */
    public AWSLambdaDestination buildUnchecked() {
        return new AWSLambdaDestinationImpl(arn, accessKey, accessSecret);
    }

    /**
     * factory method for an instance of AWSLambdaDestinationBuilder
     * @return builder
     */
    public static AWSLambdaDestinationBuilder of() {
        return new AWSLambdaDestinationBuilder();
    }

    /**
     * create builder for AWSLambdaDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AWSLambdaDestinationBuilder of(final AWSLambdaDestination template) {
        AWSLambdaDestinationBuilder builder = new AWSLambdaDestinationBuilder();
        builder.arn = template.getArn();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        return builder;
    }

}
