
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SqsDestinationImpl implements SqsDestination {

    private String type;

    private String accessKey;

    private String accessSecret;

    private String queueUrl;

    private String region;

    @JsonCreator
    SqsDestinationImpl(@JsonProperty("accessKey") final String accessKey,
            @JsonProperty("accessSecret") final String accessSecret, @JsonProperty("queueUrl") final String queueUrl,
            @JsonProperty("region") final String region) {
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.queueUrl = queueUrl;
        this.region = region;
        this.type = SQS;
    }

    public SqsDestinationImpl() {
        this.type = SQS;
    }

    public String getType() {
        return this.type;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public String getQueueUrl() {
        return this.queueUrl;
    }

    public String getRegion() {
        return this.region;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SqsDestinationImpl that = (SqsDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(accessKey, that.accessKey).append(accessSecret,
            that.accessSecret).append(queueUrl, that.queueUrl).append(region, that.region).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(accessKey).append(accessSecret).append(queueUrl).append(
            region).toHashCode();
    }

}
