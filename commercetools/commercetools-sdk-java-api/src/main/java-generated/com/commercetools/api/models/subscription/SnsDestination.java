
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>AWS SNS can be used to push messages to AWS Lambda, HTTP endpoints (webhooks), or fan-out messages to SQS queues. We recommend setting <code>authenticationMode</code> to <code>IAM</code>, to avoid unnecessary key management. For IAM authentication, give permissions to user <code>arn:aws:iam::362576667341:user/subscriptions</code> to publish to the topic before creating the Subscription. Otherwise, a test message will not be sent.</p>
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

    String SNS = "SNS";

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     */

    @JsonProperty("accessKey")
    public String getAccessKey();

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     */

    @JsonProperty("accessSecret")
    public String getAccessSecret();

    /**
     *  <p>Amazon Resource Name (ARN) of the topic.</p>
     */
    @NotNull
    @JsonProperty("topicArn")
    public String getTopicArn();

    /**
     *  <p>Defines the method of authentication for the SNS topic.</p>
     */

    @JsonProperty("authenticationMode")
    public AwsAuthenticationMode getAuthenticationMode();

    public void setAccessKey(final String accessKey);

    public void setAccessSecret(final String accessSecret);

    public void setTopicArn(final String topicArn);

    public void setAuthenticationMode(final AwsAuthenticationMode authenticationMode);

    public static SnsDestination of() {
        return new SnsDestinationImpl();
    }

    public static SnsDestination of(final SnsDestination template) {
        SnsDestinationImpl instance = new SnsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setTopicArn(template.getTopicArn());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    public static SnsDestinationBuilder builder() {
        return SnsDestinationBuilder.of();
    }

    public static SnsDestinationBuilder builder(final SnsDestination template) {
        return SnsDestinationBuilder.of(template);
    }

    default <T> T withSnsDestination(Function<SnsDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SnsDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SnsDestination>() {
            @Override
            public String toString() {
                return "TypeReference<SnsDestination>";
            }
        };
    }
}
