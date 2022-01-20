
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SnsDestinationImpl implements SnsDestination, ModelBase {

    private String type;

    private String accessKey;

    private String accessSecret;

    private String topicArn;

    @JsonCreator
    SnsDestinationImpl(@JsonProperty("accessKey") final String accessKey,
            @JsonProperty("accessSecret") final String accessSecret, @JsonProperty("topicArn") final String topicArn) {
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.topicArn = topicArn;
        this.type = SNS;
    }

    public SnsDestinationImpl() {
        this.type = SNS;
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

    public String getTopicArn() {
        return this.topicArn;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(accessKey)
                .append(accessSecret)
                .append(topicArn)
                .toHashCode();
    }

}
