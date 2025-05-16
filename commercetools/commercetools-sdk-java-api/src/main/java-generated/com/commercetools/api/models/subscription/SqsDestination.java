
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
 *  <p>AWS SQS is a pull-queue on AWS. The queue must be a Standard queue type with a <code>MaximumMessageSize</code> of <code>256 KB</code>.</p>
 *  <p>We recommend setting <code>authenticationMode</code> to <code>IAM</code>, to avoid unnecessary key management. For IAM authentication and before creating the Subscription, give permissions to the following user account: <code>arn:aws:iam::362576667341:user/subscriptions</code>. Otherwise, a test message will not be sent.</p>
 *  <p>If you prefer to use <code>Credentials</code> for authentication, we recommend creating an IAM user with an <code>accessKey</code> and <code>accessSecret</code> pair specifically for each Subscription.</p>
 *  <p>The IAM user should only have the <code>sqs:SendMessage</code> permission on this queue.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("SQS")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SqsDestinationImpl.class)
public interface SqsDestination extends Destination {

    /**
     * discriminator value for SqsDestination
     */
    String SQS = "SQS";

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
     *  <p>URL of the Amazon SQS queue.</p>
     * @return queueUrl
     */
    @NotNull
    @JsonProperty("queueUrl")
    public String getQueueUrl();

    /**
     *  <p>AWS Region the message queue is located in.</p>
     * @return region
     */
    @NotNull
    @JsonProperty("region")
    public String getRegion();

    /**
     *  <p>Defines the method of authentication for the SQS queue.</p>
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
     *  <p>URL of the Amazon SQS queue.</p>
     * @param queueUrl value to be set
     */

    public void setQueueUrl(final String queueUrl);

    /**
     *  <p>AWS Region the message queue is located in.</p>
     * @param region value to be set
     */

    public void setRegion(final String region);

    /**
     *  <p>Defines the method of authentication for the SQS queue.</p>
     * @param authenticationMode value to be set
     */

    public void setAuthenticationMode(final AwsAuthenticationMode authenticationMode);

    /**
     * factory method
     * @return instance of SqsDestination
     */
    public static SqsDestination of() {
        return new SqsDestinationImpl();
    }

    /**
     * factory method to create a shallow copy SqsDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static SqsDestination of(final SqsDestination template) {
        SqsDestinationImpl instance = new SqsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setQueueUrl(template.getQueueUrl());
        instance.setRegion(template.getRegion());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    public SqsDestination copyDeep();

    /**
     * factory method to create a deep copy of SqsDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SqsDestination deepCopy(@Nullable final SqsDestination template) {
        if (template == null) {
            return null;
        }
        SqsDestinationImpl instance = new SqsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setQueueUrl(template.getQueueUrl());
        instance.setRegion(template.getRegion());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    /**
     * builder factory method for SqsDestination
     * @return builder
     */
    public static SqsDestinationBuilder builder() {
        return SqsDestinationBuilder.of();
    }

    /**
     * create builder for SqsDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SqsDestinationBuilder builder(final SqsDestination template) {
        return SqsDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSqsDestination(Function<SqsDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SqsDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SqsDestination>() {
            @Override
            public String toString() {
                return "TypeReference<SqsDestination>";
            }
        };
    }
}
