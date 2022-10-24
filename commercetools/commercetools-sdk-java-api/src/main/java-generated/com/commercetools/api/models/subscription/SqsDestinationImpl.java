
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

/**
 * SqsDestination
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SqsDestinationImpl implements SqsDestination, ModelBase {

    private String type;

    private String accessKey;

    private String accessSecret;

    private String queueUrl;

    private String region;

    private com.commercetools.api.models.subscription.AwsAuthenticationMode authenticationMode;

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
     *
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     *
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

}
