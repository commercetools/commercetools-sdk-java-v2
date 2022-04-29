
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>We recommend creating an Identify and Access Management (IAM) user with an <code>accessKey</code> and <code>accessSecret</code> pair, specifically for each Extension that only has the <code>lambda:InvokeFunction</code> permission on this function.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AWSLambdaDestinationImpl.class)
public interface AWSLambdaDestination extends ExtensionDestination {

    String AWS_LAMBDA = "AWSLambda";

    /**
    *  <p>Amazon Resource Name (ARN) of the Lambda function in the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;</code>.</p>
    */
    @NotNull
    @JsonProperty("arn")
    public String getArn();

    /**
    *  <p>Partially hidden on retrieval for security reasons.</p>
    */
    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    /**
    *  <p>Partially hidden on retrieval for security reasons.</p>
    */
    @NotNull
    @JsonProperty("accessSecret")
    public String getAccessSecret();

    public void setArn(final String arn);

    public void setAccessKey(final String accessKey);

    public void setAccessSecret(final String accessSecret);

    public static AWSLambdaDestination of() {
        return new AWSLambdaDestinationImpl();
    }

    public static AWSLambdaDestination of(final AWSLambdaDestination template) {
        AWSLambdaDestinationImpl instance = new AWSLambdaDestinationImpl();
        instance.setArn(template.getArn());
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        return instance;
    }

    public static AWSLambdaDestinationBuilder builder() {
        return AWSLambdaDestinationBuilder.of();
    }

    public static AWSLambdaDestinationBuilder builder(final AWSLambdaDestination template) {
        return AWSLambdaDestinationBuilder.of(template);
    }

    default <T> T withAWSLambdaDestination(Function<AWSLambdaDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AWSLambdaDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AWSLambdaDestination>() {
            @Override
            public String toString() {
                return "TypeReference<AWSLambdaDestination>";
            }
        };
    }
}
