package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDescriptionAction productSetDescriptionAction = ProductSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSetDescriptionActionBuilder implements Builder<ProductSetDescriptionAction> {

    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ProductSetDescriptionActionBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ProductSetDescriptionActionBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public ProductSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductSetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductSetDescriptionAction with checking for non-null required values
     * @return ProductSetDescriptionAction
     */
    public ProductSetDescriptionAction build() {
        return new ProductSetDescriptionActionImpl(description, staged);
    }
    
    /**
     * builds ProductSetDescriptionAction without checking for non-null required values
     * @return ProductSetDescriptionAction
     */
    public ProductSetDescriptionAction buildUnchecked() {
        return new ProductSetDescriptionActionImpl(description, staged);
    }

    /**
     * factory method for an instance of ProductSetDescriptionActionBuilder
     * @return builder 
     */
    public static ProductSetDescriptionActionBuilder of() {
        return new ProductSetDescriptionActionBuilder();
    }

    /**
     * create builder for ProductSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetDescriptionActionBuilder of(final ProductSetDescriptionAction template) {
        ProductSetDescriptionActionBuilder builder = new ProductSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
