package com.commercetools.api.models.message;


import com.commercetools.api.models.message.ContainerAndKeyImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p><code>ContainerAndKey</code> is specific to Custom Objects. Custom Objects are grouped into containers, which can be used like namespaces. Within a given container, a user-defined key can be used to uniquely identify resources.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ContainerAndKey containerAndKey = ContainerAndKey.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ContainerAndKeyImpl.class)
public interface ContainerAndKey  {


    /**
     *  <p>User-defined identifier that is unique within the given container.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Namespace to group Custom Objects.</p>
     * @return container
     */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
     *  <p>User-defined identifier that is unique within the given container.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Namespace to group Custom Objects.</p>
     * @param container value to be set
     */
    
    public void setContainer(final String container);
    

    /**
     * factory method
     * @return instance of ContainerAndKey
     */
    public static ContainerAndKey of(){
        return new ContainerAndKeyImpl();
    }
    

    /**
     * factory method to create a shallow copy ContainerAndKey
     * @param template instance to be copied
     * @return copy instance
     */
    public static ContainerAndKey of(final ContainerAndKey template) {
        ContainerAndKeyImpl instance = new ContainerAndKeyImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    /**
     * factory method to create a deep copy of ContainerAndKey
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ContainerAndKey deepCopy(@Nullable final ContainerAndKey template) {
        if (template == null) {
            return null;
        }
        ContainerAndKeyImpl instance = new ContainerAndKeyImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    /**
     * builder factory method for ContainerAndKey
     * @return builder
     */
    public static ContainerAndKeyBuilder builder() {
        return ContainerAndKeyBuilder.of();
    }
    
    /**
     * create builder for ContainerAndKey instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ContainerAndKeyBuilder builder(final ContainerAndKey template) {
        return ContainerAndKeyBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withContainerAndKey(Function<ContainerAndKey, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ContainerAndKey> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ContainerAndKey>() {
            @Override
            public String toString() {
                return "TypeReference<ContainerAndKey>";
            }
        };
    }
}
