package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryChangeAssetOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeAssetOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetOrderAction categoryChangeAssetOrderAction = CategoryChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryChangeAssetOrderActionBuilder implements Builder<CategoryChangeAssetOrderAction> {

    
    
    private java.util.List<String> assetOrder;

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @param assetOrder value to be set
     * @return Builder
     */
    
    public CategoryChangeAssetOrderActionBuilder assetOrder( final String ...assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }
    
    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @param assetOrder value to be set
     * @return Builder
     */
    
    public CategoryChangeAssetOrderActionBuilder assetOrder( final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }
    
    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @param assetOrder value to be set
     * @return Builder
     */
    
    public CategoryChangeAssetOrderActionBuilder plusAssetOrder( final String ...assetOrder) {
        if (this.assetOrder == null) {
            this.assetOrder = new ArrayList<>();
        }
        this.assetOrder.addAll(Arrays.asList(assetOrder));
        return this;
    }
    
    
    

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @return assetOrder
     */
    
    
    public java.util.List<String> getAssetOrder(){
        return this.assetOrder;
    }

    /**
     * builds CategoryChangeAssetOrderAction with checking for non-null required values
     * @return CategoryChangeAssetOrderAction
     */
    public CategoryChangeAssetOrderAction build() {
        Objects.requireNonNull(assetOrder, CategoryChangeAssetOrderAction.class + ": assetOrder is missing");
        return new CategoryChangeAssetOrderActionImpl(assetOrder);
    }
    
    /**
     * builds CategoryChangeAssetOrderAction without checking for non-null required values
     * @return CategoryChangeAssetOrderAction
     */
    public CategoryChangeAssetOrderAction buildUnchecked() {
        return new CategoryChangeAssetOrderActionImpl(assetOrder);
    }

    /**
     * factory method for an instance of CategoryChangeAssetOrderActionBuilder
     * @return builder 
     */
    public static CategoryChangeAssetOrderActionBuilder of() {
        return new CategoryChangeAssetOrderActionBuilder();
    }

    /**
     * create builder for CategoryChangeAssetOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeAssetOrderActionBuilder of(final CategoryChangeAssetOrderAction template) {
        CategoryChangeAssetOrderActionBuilder builder = new CategoryChangeAssetOrderActionBuilder();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
