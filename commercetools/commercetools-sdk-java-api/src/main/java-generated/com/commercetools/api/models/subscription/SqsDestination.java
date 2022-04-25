
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SqsDestinationImpl.class)
public interface SqsDestination extends Destination {

    String SQS = "SQS";

    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    @NotNull
    @JsonProperty("accessSecret")
    public String getAccessSecret();

    @NotNull
    @JsonProperty("queueUrl")
    public String getQueueUrl();

    @NotNull
    @JsonProperty("region")
    public String getRegion();

    public void setAccessKey(final String accessKey);

    public void setAccessSecret(final String accessSecret);

    public void setQueueUrl(final String queueUrl);

    public void setRegion(final String region);

    public static SqsDestination of() {
        return new SqsDestinationImpl();
    }

    public static SqsDestination of(final SqsDestination template) {
        SqsDestinationImpl instance = new SqsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setQueueUrl(template.getQueueUrl());
        instance.setRegion(template.getRegion());
        return instance;
    }

    public static SqsDestinationBuilder builder() {
        return SqsDestinationBuilder.of();
    }

    public static SqsDestinationBuilder builder(final SqsDestination template) {
        return SqsDestinationBuilder.of(template);
    }

    default <T> T withSqsDestination(Function<SqsDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SqsDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SqsDestination>() {
            @Override
            public String toString() {
                return "TypeReference<SqsDestination>";
            }
        };
    }
}
