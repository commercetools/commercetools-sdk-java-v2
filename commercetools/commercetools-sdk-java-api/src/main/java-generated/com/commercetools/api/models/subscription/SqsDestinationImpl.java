
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
 *  <p><span>AWS SQS</span> is a pull-queue on AWS. The queue must be a <span>Standard</span> queue type with a <code>MaximumMessageSize</code> of <code>256 KB</code>.</p>
 *  <p>We recommend setting <code>authenticationMode</code> to <code>IAM</code>, to avoid unnecessary key management. For IAM authentication and before creating the Subscription, give permissions to the following user account: <code>arn:aws:iam::362576667341:user/subscriptions</code>. Otherwise, a test message will not be sent.</p>
 *  <p>If you prefer to use <code>Credentials</code> for authentication, we recommend <span>creating an IAM user</span> with an <code>accessKey</code> and <code>accessSecret</code> pair specifically for each Subscription.</p>
 *  <p>The IAM user should only have the <code>sqs:SendMessage</code> permission on this queue.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SqsDestinationImpl implements SqsDestination, ModelBase {

    private String type;

    private String accessKey;

    private String accessSecret;

    private String queueUrl;

    private String region;

    private com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SqsDestinationImpl(@JsonProperty("accessKey") final String accessKey,
            @JsonProperty("accessSecret") final String accessSecret, @JsonProperty("queueUrl") final String queueUrl,
            @JsonProperty("region") final String region,
            @JsonProperty("authenticationMode") final com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode) {
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.queueUrl = queueUrl;
        this.region = region;
        this.authenticationMode = authenticationMode;
        this.type = SQS;
    }

    /**
     * create empty instance
     */
    public SqsDestinationImpl() {
        this.type = SQS;
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
     *  <p>URL of the Amazon SQS queue.</p>
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     *  <p><span>AWS Region</span> the message queue is located in.</p>
     */

    public String getRegion() {
        return this.region;
    }

    /**
     *  <p>Defines the method of authentication for the SQS queue.</p>
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

    public void setQueueUrl(final String queueUrl) {
        this.queueUrl = queueUrl;
    }

    public void setRegion(final String region) {
        this.region = region;
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

        SqsDestinationImpl that = (SqsDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .append(queueUrl, that.queueUrl)
                .append(region, that.region)
                .append(authenticationMode, that.authenticationMode)
                .append(type, that.type)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .append(queueUrl, that.queueUrl)
                .append(region, that.region)
                .append(authenticationMode, that.authenticationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(accessKey)
                .append(accessSecret)
                .append(queueUrl)
                .append(region)
                .append(authenticationMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("accessKey", accessKey)
                .append("accessSecret", accessSecret)
                .append("queueUrl", queueUrl)
                .append("region", region)
                .append("authenticationMode", authenticationMode)
                .build();
    }

    @Override
    public SqsDestination copyDeep() {
        return SqsDestination.deepCopy(this);
    }
}
