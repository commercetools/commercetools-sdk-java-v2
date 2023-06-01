package com.commercetools.api.models.message;


import com.commercetools.api.models.message.ContainerAndKey;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ContainerAndKeyBuilder
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
public class ContainerAndKeyBuilder implements Builder<ContainerAndKey> {

    
    
    private String key;
    
    
    
    private String container;

    
    /**
     *  <p>User-defined identifier that is unique within the given container.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ContainerAndKeyBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Namespace to group Custom Objects.</p>
     * @param container value to be set
     * @return Builder
     */
    
    public ContainerAndKeyBuilder container( final String container) {
        this.container = container;
        return this;
    }
    
    

    /**
     *  <p>User-defined identifier that is unique within the given container.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Namespace to group Custom Objects.</p>
     * @return container
     */
    
    
    public String getContainer(){
        return this.container;
    }

    /**
     * builds ContainerAndKey with checking for non-null required values
     * @return ContainerAndKey
     */
    public ContainerAndKey build() {
        Objects.requireNonNull(key, ContainerAndKey.class + ": key is missing");
        Objects.requireNonNull(container, ContainerAndKey.class + ": container is missing");
        return new ContainerAndKeyImpl(key, container);
    }
    
    /**
     * builds ContainerAndKey without checking for non-null required values
     * @return ContainerAndKey
     */
    public ContainerAndKey buildUnchecked() {
        return new ContainerAndKeyImpl(key, container);
    }

    /**
     * factory method for an instance of ContainerAndKeyBuilder
     * @return builder 
     */
    public static ContainerAndKeyBuilder of() {
        return new ContainerAndKeyBuilder();
    }

    /**
     * create builder for ContainerAndKey instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ContainerAndKeyBuilder of(final ContainerAndKey template) {
        ContainerAndKeyBuilder builder = new ContainerAndKeyBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
