package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeSortOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeSortOrderAction productDiscountChangeSortOrderAction = ProductDiscountChangeSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountChangeSortOrderActionBuilder implements Builder<ProductDiscountChangeSortOrderAction> {

    
    
    private String sortOrder;

    
    /**
     *  <p>New value to set. Must not be empty. The string value must be a number between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized.</p>
     * @param sortOrder value to be set
     * @return Builder
     */
    
    public ProductDiscountChangeSortOrderActionBuilder sortOrder( final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty. The string value must be a number between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized.</p>
     * @return sortOrder
     */
    
    
    public String getSortOrder(){
        return this.sortOrder;
    }

    /**
     * builds ProductDiscountChangeSortOrderAction with checking for non-null required values
     * @return ProductDiscountChangeSortOrderAction
     */
    public ProductDiscountChangeSortOrderAction build() {
        Objects.requireNonNull(sortOrder, ProductDiscountChangeSortOrderAction.class + ": sortOrder is missing");
        return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
    }
    
    /**
     * builds ProductDiscountChangeSortOrderAction without checking for non-null required values
     * @return ProductDiscountChangeSortOrderAction
     */
    public ProductDiscountChangeSortOrderAction buildUnchecked() {
        return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
    }

    /**
     * factory method for an instance of ProductDiscountChangeSortOrderActionBuilder
     * @return builder 
     */
    public static ProductDiscountChangeSortOrderActionBuilder of() {
        return new ProductDiscountChangeSortOrderActionBuilder();
    }

    /**
     * create builder for ProductDiscountChangeSortOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeSortOrderActionBuilder of(final ProductDiscountChangeSortOrderAction template) {
        ProductDiscountChangeSortOrderActionBuilder builder = new ProductDiscountChangeSortOrderActionBuilder();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
