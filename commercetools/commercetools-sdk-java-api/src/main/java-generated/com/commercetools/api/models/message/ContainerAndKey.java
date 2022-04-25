
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Custom Objects are grouped into containers, which can be used like namespaces. Within a given container, a user-defined key can be used to uniquely identify resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ContainerAndKeyImpl.class)
public interface ContainerAndKey {

    /**
    *  <p>User-defined identifier that is unique within the given container.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Namespace to group Custom Objects.</p>
    */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    public void setKey(final String key);

    public void setContainer(final String container);

    public static ContainerAndKey of() {
        return new ContainerAndKeyImpl();
    }

    public static ContainerAndKey of(final ContainerAndKey template) {
        ContainerAndKeyImpl instance = new ContainerAndKeyImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    public static ContainerAndKeyBuilder builder() {
        return ContainerAndKeyBuilder.of();
    }

    public static ContainerAndKeyBuilder builder(final ContainerAndKey template) {
        return ContainerAndKeyBuilder.of(template);
    }

    default <T> T withContainerAndKey(Function<ContainerAndKey, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ContainerAndKey> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ContainerAndKey>() {
            @Override
            public String toString() {
                return "TypeReference<ContainerAndKey>";
            }
        };
    }
}
