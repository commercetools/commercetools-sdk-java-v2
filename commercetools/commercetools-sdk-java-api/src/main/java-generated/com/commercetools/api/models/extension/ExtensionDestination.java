
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Generic type for destinations.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.AWSLambdaDestinationImpl.class, name = AWSLambdaDestination.AWS_LAMBDA),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.HttpDestinationImpl.class, name = HttpDestination.HTTP) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ExtensionDestinationImpl.class, visible = true)
@JsonDeserialize(as = ExtensionDestinationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExtensionDestination {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.extension.AWSLambdaDestinationBuilder awsLambdaBuilder() {
        return com.commercetools.api.models.extension.AWSLambdaDestinationBuilder.of();
    }

    public static com.commercetools.api.models.extension.HttpDestinationBuilder httpBuilder() {
        return com.commercetools.api.models.extension.HttpDestinationBuilder.of();
    }

    default <T> T withExtensionDestination(Function<ExtensionDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionDestination>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionDestination>";
            }
        };
    }
}
