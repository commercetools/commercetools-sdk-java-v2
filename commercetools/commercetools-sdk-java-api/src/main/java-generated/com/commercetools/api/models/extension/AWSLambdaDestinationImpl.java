
package com.commercetools.api.models.extension;

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
 *  <p>We recommend creating an Identify and Access Management (IAM) user with an <code>accessKey</code> and <code>accessSecret</code> pair, specifically for each Extension that only has the <code>lambda:InvokeFunction</code> permission on this function.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AWSLambdaDestinationImpl implements AWSLambdaDestination, ModelBase {

    private String type;

    private String arn;

    private String accessKey;

    private String accessSecret;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AWSLambdaDestinationImpl(@JsonProperty("arn") final String arn, @JsonProperty("accessKey") final String accessKey,
            @JsonProperty("accessSecret") final String accessSecret) {
        this.arn = arn;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.type = AWS_LAMBDA;
    }

    /**
     * create empty instance
     */
    public AWSLambdaDestinationImpl() {
        this.type = AWS_LAMBDA;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Amazon Resource Name (ARN) of the Lambda function in the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;</code>. Use the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;:&lt;functionAlias/version&gt;</code> to point to a specific version of the function.</p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

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

        AWSLambdaDestinationImpl that = (AWSLambdaDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(arn, that.arn)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .append(type, that.type)
                .append(arn, that.arn)
                .append(accessKey, that.accessKey)
                .append(accessSecret, that.accessSecret)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(arn).append(accessKey).append(accessSecret).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("arn", arn)
                .append("accessKey", accessKey)
                .append("accessSecret", accessSecret)
                .build();
    }

    @Override
    public AWSLambdaDestination copyDeep() {
        return AWSLambdaDestination.deepCopy(this);
    }
}
