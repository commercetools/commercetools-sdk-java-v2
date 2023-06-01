package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupResourceIdentifier customerGroupResourceIdentifier = CustomerGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerGroupResourceIdentifierBuilder implements Builder<CustomerGroupResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public CustomerGroupResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CustomerGroupResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds CustomerGroupResourceIdentifier with checking for non-null required values
     * @return CustomerGroupResourceIdentifier
     */
    public CustomerGroupResourceIdentifier build() {
        return new CustomerGroupResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds CustomerGroupResourceIdentifier without checking for non-null required values
     * @return CustomerGroupResourceIdentifier
     */
    public CustomerGroupResourceIdentifier buildUnchecked() {
        return new CustomerGroupResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of CustomerGroupResourceIdentifierBuilder
     * @return builder 
     */
    public static CustomerGroupResourceIdentifierBuilder of() {
        return new CustomerGroupResourceIdentifierBuilder();
    }

    /**
     * create builder for CustomerGroupResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupResourceIdentifierBuilder of(final CustomerGroupResourceIdentifier template) {
        CustomerGroupResourceIdentifierBuilder builder = new CustomerGroupResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
