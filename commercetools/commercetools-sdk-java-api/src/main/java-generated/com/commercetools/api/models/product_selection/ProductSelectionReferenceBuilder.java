package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product_selection.ProductSelection;
import com.commercetools.api.models.product_selection.ProductSelectionReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionReference productSelectionReference = ProductSelectionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionReferenceBuilder implements Builder<ProductSelectionReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.product_selection.ProductSelection obj;

    
    /**
     *  <p>Unique identifier of the referenced ProductSelection.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ProductSelectionReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public ProductSelectionReferenceBuilder obj(Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelectionBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public ProductSelectionReferenceBuilder withObj(Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelection> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public ProductSelectionReferenceBuilder obj(@Nullable final com.commercetools.api.models.product_selection.ProductSelection obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced ProductSelection.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.product_selection.ProductSelection getObj(){
        return this.obj;
    }

    /**
     * builds ProductSelectionReference with checking for non-null required values
     * @return ProductSelectionReference
     */
    public ProductSelectionReference build() {
        Objects.requireNonNull(id, ProductSelectionReference.class + ": id is missing");
        return new ProductSelectionReferenceImpl(id, obj);
    }
    
    /**
     * builds ProductSelectionReference without checking for non-null required values
     * @return ProductSelectionReference
     */
    public ProductSelectionReference buildUnchecked() {
        return new ProductSelectionReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ProductSelectionReferenceBuilder
     * @return builder 
     */
    public static ProductSelectionReferenceBuilder of() {
        return new ProductSelectionReferenceBuilder();
    }

    /**
     * create builder for ProductSelectionReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionReferenceBuilder of(final ProductSelectionReference template) {
        ProductSelectionReferenceBuilder builder = new ProductSelectionReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
