package com.commercetools.api.models.order;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderResourceIdentifier orderResourceIdentifier = OrderResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderResourceIdentifierBuilder implements Builder<OrderResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public OrderResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public OrderResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds OrderResourceIdentifier with checking for non-null required values
     * @return OrderResourceIdentifier
     */
    public OrderResourceIdentifier build() {
        return new OrderResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds OrderResourceIdentifier without checking for non-null required values
     * @return OrderResourceIdentifier
     */
    public OrderResourceIdentifier buildUnchecked() {
        return new OrderResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of OrderResourceIdentifierBuilder
     * @return builder 
     */
    public static OrderResourceIdentifierBuilder of() {
        return new OrderResourceIdentifierBuilder();
    }

    /**
     * create builder for OrderResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderResourceIdentifierBuilder of(final OrderResourceIdentifier template) {
        OrderResourceIdentifierBuilder builder = new OrderResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
