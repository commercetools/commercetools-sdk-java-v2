
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>AWS SNS can be used to push messages to AWS Lambda, HTTP endpoints (webhooks), or fan-out messages to SQS queues. The SQS queue must be a Standard queue type.</p>
 *  <p>We recommend setting <code>authenticationMode</code> to <code>IAM</code>, to avoid unnecessary key management. For IAM authentication and before creating the Subscription, give permissions to the following user account: <code>arn:aws:iam::362576667341:user/subscriptions</code>. Otherwise, a test notification will not be sent.</p>
 *  <p>If you prefer to use <code>Credentials</code> for authentication, we recommend creating an IAM user with an <code>accessKey</code> and <code>accessSecret</code> pair specifically for each Subscription.</p>
 *  <p>The IAM user should only have the <code>sns:Publish</code> permission on this topic.</p>
 *
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
@JsonDeserialize(as = SnsDestinationImpl.class)
public interface SnsDestination extends Destination {

    /**
     * discriminator value for SnsDestination
     */
    String SNS = "SNS";

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @return accessKey
     */

    @JsonProperty("accessKey")
    public String getAccessKey();

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @return accessSecret
     */

    @JsonProperty("accessSecret")
    public String getAccessSecret();

    /**
     *  <p>Amazon Resource Name (ARN) of the topic.</p>
     * @return topicArn
     */
    @NotNull
    @JsonProperty("topicArn")
    public String getTopicArn();

    /**
     *  <p>Defines the method of authentication for the SNS topic.</p>
     * @return authenticationMode
     */

    @JsonProperty("authenticationMode")
    public AwsAuthenticationMode getAuthenticationMode();

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @param accessKey value to be set
     */

    public void setAccessKey(final String accessKey);

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     * @param accessSecret value to be set
     */

    public void setAccessSecret(final String accessSecret);

    /**
     *  <p>Amazon Resource Name (ARN) of the topic.</p>
     * @param topicArn value to be set
     */

    public void setTopicArn(final String topicArn);

    /**
     *  <p>Defines the method of authentication for the SNS topic.</p>
     * @param authenticationMode value to be set
     */

    public void setAuthenticationMode(final AwsAuthenticationMode authenticationMode);

    /**
     * factory method
     * @return instance of SnsDestination
     */
    public static SnsDestination of() {
        return new SnsDestinationImpl();
    }

    /**
     * factory method to create a shallow copy SnsDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static SnsDestination of(final SnsDestination template) {
        SnsDestinationImpl instance = new SnsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setTopicArn(template.getTopicArn());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of SnsDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SnsDestination deepCopy(@Nullable final SnsDestination template) {
        if (template == null) {
            return null;
        }
        SnsDestinationImpl instance = new SnsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setTopicArn(template.getTopicArn());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    /**
     * builder factory method for SnsDestination
     * @return builder
     */
    public static SnsDestinationBuilder builder() {
        return SnsDestinationBuilder.of();
    }

    /**
     * create builder for SnsDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SnsDestinationBuilder builder(final SnsDestination template) {
        return SnsDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSnsDestination(Function<SnsDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SnsDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SnsDestination>() {
            @Override
            public String toString() {
                return "TypeReference<SnsDestination>";
            }
        };
    }
}
