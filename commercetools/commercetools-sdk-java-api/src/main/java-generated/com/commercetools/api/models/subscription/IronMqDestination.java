
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = IronMqDestinationImpl.class)
public interface IronMqDestination extends Destination {

    String IRON_MQ = "IronMQ";

    @NotNull
    @JsonProperty("uri")
    public String getUri();

    public void setUri(final String uri);

    public static IronMqDestination of() {
        return new IronMqDestinationImpl();
    }

    public static IronMqDestination of(final IronMqDestination template) {
        IronMqDestinationImpl instance = new IronMqDestinationImpl();
        instance.setUri(template.getUri());
        return instance;
    }

    public static IronMqDestinationBuilder builder() {
        return IronMqDestinationBuilder.of();
    }

    public static IronMqDestinationBuilder builder(final IronMqDestination template) {
        return IronMqDestinationBuilder.of(template);
    }

    default <T> T withIronMqDestination(Function<IronMqDestination, T> helper) {
        return helper.apply(this);
    }
}
