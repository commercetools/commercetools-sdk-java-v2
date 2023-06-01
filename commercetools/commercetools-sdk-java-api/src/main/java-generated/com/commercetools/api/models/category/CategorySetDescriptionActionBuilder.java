package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategorySetDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetDescriptionAction categorySetDescriptionAction = CategorySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategorySetDescriptionActionBuilder implements Builder<CategorySetDescriptionAction> {

    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public CategorySetDescriptionActionBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public CategorySetDescriptionActionBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public CategorySetDescriptionActionBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
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
     * builds CategorySetDescriptionAction with checking for non-null required values
     * @return CategorySetDescriptionAction
     */
    public CategorySetDescriptionAction build() {
        return new CategorySetDescriptionActionImpl(description);
    }
    
    /**
     * builds CategorySetDescriptionAction without checking for non-null required values
     * @return CategorySetDescriptionAction
     */
    public CategorySetDescriptionAction buildUnchecked() {
        return new CategorySetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of CategorySetDescriptionActionBuilder
     * @return builder 
     */
    public static CategorySetDescriptionActionBuilder of() {
        return new CategorySetDescriptionActionBuilder();
    }

    /**
     * create builder for CategorySetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetDescriptionActionBuilder of(final CategorySetDescriptionAction template) {
        CategorySetDescriptionActionBuilder builder = new CategorySetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
