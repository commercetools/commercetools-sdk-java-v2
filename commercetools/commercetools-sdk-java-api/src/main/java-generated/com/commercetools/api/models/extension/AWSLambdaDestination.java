
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AWSLambdaDestinationImpl.class)
public interface AWSLambdaDestination extends ExtensionDestination {

    String AWS_LAMBDA = "AWSLambda";

    @NotNull
    @JsonProperty("arn")
    public String getArn();

    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

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
}
