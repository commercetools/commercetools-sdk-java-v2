
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>AWS SNS can be used to push messages to AWS Lambda, HTTP endpoints (webhooks), or fan-out messages to SQS queues. The SQS queue must be a Standard queue type.</p>
 *  <p>We recommend setting <code>authenticationMode</code> to <code>IAM</code>, to avoid unnecessary key management. For IAM authentication and before creating the Subscription, give permissions to the following user account: <code>arn:aws:iam::362576667341:user/subscriptions</code>. Otherwise, a test notification will not be sent.</p>
 *  <p>If you prefer to use <code>Credentials</code> for authentication, we recommend creating an IAM user with an <code>accessKey</code> and <code>accessSecret</code> pair specifically for each Subscription.</p>
 *  <p>The IAM user should only have the <code>sns:Publish</code> permission on this topic.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SnsDestinationImpl implements SnsDestination, ModelBase {

    private String type;

    private String accessKey;

    private String accessSecret;

    private String topicArn;

    private com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SnsDestinationImpl(@JsonProperty("accessKey") final String accessKey,
            @JsonProperty("accessSecret") final String accessSecret, @JsonProperty("topicArn") final String topicArn,
            @JsonProperty("authenticationMode") final com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode) {
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.topicArn = topicArn;
        this.authenticationMode = authenticationMode;
        this.type = SNS;
    }

    /**
     * create empty instance
     */
    public SnsDestinationImpl() {
        this.type = SNS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     *  <p>Only present if <code>authenticationMode</code> is set to <code>Credentials</code>.</p>
     */

    public String getAccessSecret() {
        return this.accessSecret;
    }

    /**
     *  <p>Amazon Resource Name (ARN) of the topic.</p>
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     *  <p>Defines the method of authentication for the SNS topic.</p>
     */

    public com.commercetools.api.models.subscription.AwsAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    public void setAccessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public void setTopicArn(final String topicArn) {
        this.topicArn = topicArn;
    }

    public void setAuthenticationMode(
            final com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SnsDestinationImpl that = (SnsDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .append(topicArn, that.topicArn)
                .append(authenticationMode, that.authenticationMode)
                .append(type, that.type)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .append(topicArn, that.topicArn)
                .append(authenticationMode, that.authenticationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(accessKey)
                .append(accessSecret)
                .append(topicArn)
                .append(authenticationMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("accessKey", accessKey)
                .append("accessSecret", accessSecret)
                .append("topicArn", topicArn)
                .append("authenticationMode", authenticationMode)
                .build();
    }

}
