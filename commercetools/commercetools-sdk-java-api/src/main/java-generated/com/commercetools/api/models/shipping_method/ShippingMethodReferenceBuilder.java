package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodReference shippingMethodReference = ShippingMethodReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodReferenceBuilder implements Builder<ShippingMethodReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethod obj;

    
    /**
     *  <p>Unique identifier of the referenced ShippingMethod.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ShippingMethodReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded ShippingMethod. Only present in responses to requests with Reference Expansion for ShippingMethods.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public ShippingMethodReferenceBuilder obj(Function<com.commercetools.api.models.shipping_method.ShippingMethodBuilder, com.commercetools.api.models.shipping_method.ShippingMethodBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded ShippingMethod. Only present in responses to requests with Reference Expansion for ShippingMethods.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public ShippingMethodReferenceBuilder withObj(Function<com.commercetools.api.models.shipping_method.ShippingMethodBuilder, com.commercetools.api.models.shipping_method.ShippingMethod> builder) {
        this.obj = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded ShippingMethod. Only present in responses to requests with Reference Expansion for ShippingMethods.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public ShippingMethodReferenceBuilder obj(@Nullable final com.commercetools.api.models.shipping_method.ShippingMethod obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced ShippingMethod.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded ShippingMethod. Only present in responses to requests with Reference Expansion for ShippingMethods.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethod getObj(){
        return this.obj;
    }

    /**
     * builds ShippingMethodReference with checking for non-null required values
     * @return ShippingMethodReference
     */
    public ShippingMethodReference build() {
        Objects.requireNonNull(id, ShippingMethodReference.class + ": id is missing");
        return new ShippingMethodReferenceImpl(id, obj);
    }
    
    /**
     * builds ShippingMethodReference without checking for non-null required values
     * @return ShippingMethodReference
     */
    public ShippingMethodReference buildUnchecked() {
        return new ShippingMethodReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ShippingMethodReferenceBuilder
     * @return builder 
     */
    public static ShippingMethodReferenceBuilder of() {
        return new ShippingMethodReferenceBuilder();
    }

    /**
     * create builder for ShippingMethodReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodReferenceBuilder of(final ShippingMethodReference template) {
        ShippingMethodReferenceBuilder builder = new ShippingMethodReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
