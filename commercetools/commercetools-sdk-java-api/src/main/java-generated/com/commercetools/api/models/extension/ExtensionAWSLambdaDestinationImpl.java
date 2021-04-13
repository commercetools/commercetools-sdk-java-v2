
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionAWSLambdaDestinationImpl implements ExtensionAWSLambdaDestination {

    private String type;

    private String arn;

    private String accessKey;

    private String accessSecret;

    @JsonCreator
    ExtensionAWSLambdaDestinationImpl(@JsonProperty("arn") final String arn,
            @JsonProperty("accessKey") final String accessKey,
            @JsonProperty("accessSecret") final String accessSecret) {
        this.arn = arn;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.type = AWS_LAMBDA;
    }

    public ExtensionAWSLambdaDestinationImpl() {
        this.type = AWS_LAMBDA;
    }

    public String getType() {
        return this.type;
    }

    public String getArn() {
        return this.arn;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public void setArn(final String arn) {
        this.arn = arn;
    }

    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    public void setAccessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionAWSLambdaDestinationImpl that = (ExtensionAWSLambdaDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(arn, that.arn)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(arn).append(accessKey).append(accessSecret).toHashCode();
    }

}
