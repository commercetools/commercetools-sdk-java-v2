
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SnsDestinationImpl.class)
public interface SnsDestination extends Destination {

    String SNS = "SNS";

    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    @NotNull
    @JsonProperty("accessSecret")
    public String getAccessSecret();

    @NotNull
    @JsonProperty("topicArn")
    public String getTopicArn();

    public void setAccessKey(final String accessKey);

    public void setAccessSecret(final String accessSecret);

    public void setTopicArn(final String topicArn);

    public static SnsDestination of() {
        return new SnsDestinationImpl();
    }

    public static SnsDestination of(final SnsDestination template) {
        SnsDestinationImpl instance = new SnsDestinationImpl();
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        instance.setTopicArn(template.getTopicArn());
        return instance;
    }

    public static SnsDestinationBuilder builder() {
        return SnsDestinationBuilder.of();
    }

    public static SnsDestinationBuilder builder(final SnsDestination template) {
        return SnsDestinationBuilder.of(template);
    }

    default <T> T withSnsDestination(Function<SnsDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SnsDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SnsDestination>() {
            @Override
            public String toString() {
                return "TypeReference<SnsDestination>";
            }
        };
    }
}
