package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeDescriptionAction productTypeChangeDescriptionAction = ProductTypeChangeDescriptionAction.builder()
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeDescriptionActionBuilder implements Builder<ProductTypeChangeDescriptionAction> {

    
    
    private String description;

    
    /**
     *  <p>New value to set.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public ProductTypeChangeDescriptionActionBuilder description( final String description) {
        this.description = description;
        return this;
    }
    
    

    /**
     *  <p>New value to set.</p>
     * @return description
     */
    
    
    public String getDescription(){
        return this.description;
    }

    /**
     * builds ProductTypeChangeDescriptionAction with checking for non-null required values
     * @return ProductTypeChangeDescriptionAction
     */
    public ProductTypeChangeDescriptionAction build() {
        Objects.requireNonNull(description, ProductTypeChangeDescriptionAction.class + ": description is missing");
        return new ProductTypeChangeDescriptionActionImpl(description);
    }
    
    /**
     * builds ProductTypeChangeDescriptionAction without checking for non-null required values
     * @return ProductTypeChangeDescriptionAction
     */
    public ProductTypeChangeDescriptionAction buildUnchecked() {
        return new ProductTypeChangeDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of ProductTypeChangeDescriptionActionBuilder
     * @return builder 
     */
    public static ProductTypeChangeDescriptionActionBuilder of() {
        return new ProductTypeChangeDescriptionActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeDescriptionActionBuilder of(final ProductTypeChangeDescriptionAction template) {
        ProductTypeChangeDescriptionActionBuilder builder = new ProductTypeChangeDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
