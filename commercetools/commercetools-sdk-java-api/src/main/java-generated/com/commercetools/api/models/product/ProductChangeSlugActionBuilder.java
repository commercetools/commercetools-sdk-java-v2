package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangeSlugAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeSlugActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeSlugAction productChangeSlugAction = ProductChangeSlugAction.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductChangeSlugActionBuilder implements Builder<ProductChangeSlugAction> {

    
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */
    
    public ProductChangeSlugActionBuilder slug(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */
    
    public ProductChangeSlugActionBuilder withSlug(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param slug value to be set
     * @return Builder
     */
    
    public ProductChangeSlugActionBuilder slug( final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductChangeSlugActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @return slug
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductChangeSlugAction with checking for non-null required values
     * @return ProductChangeSlugAction
     */
    public ProductChangeSlugAction build() {
        Objects.requireNonNull(slug, ProductChangeSlugAction.class + ": slug is missing");
        return new ProductChangeSlugActionImpl(slug, staged);
    }
    
    /**
     * builds ProductChangeSlugAction without checking for non-null required values
     * @return ProductChangeSlugAction
     */
    public ProductChangeSlugAction buildUnchecked() {
        return new ProductChangeSlugActionImpl(slug, staged);
    }

    /**
     * factory method for an instance of ProductChangeSlugActionBuilder
     * @return builder 
     */
    public static ProductChangeSlugActionBuilder of() {
        return new ProductChangeSlugActionBuilder();
    }

    /**
     * create builder for ProductChangeSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeSlugActionBuilder of(final ProductChangeSlugAction template) {
        ProductChangeSlugActionBuilder builder = new ProductChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        builder.staged = template.getStaged();
        return builder;
    }

}
