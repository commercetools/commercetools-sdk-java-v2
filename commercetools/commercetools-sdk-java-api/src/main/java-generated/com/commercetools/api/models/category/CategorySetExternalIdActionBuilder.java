package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetExternalIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetExternalIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetExternalIdAction categorySetExternalIdAction = CategorySetExternalIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategorySetExternalIdActionBuilder implements Builder<CategorySetExternalIdAction> {

    
    @Nullable
    private String externalId;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalId value to be set
     * @return Builder
     */
    
    public CategorySetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalId
     */
    
    @Nullable
    public String getExternalId(){
        return this.externalId;
    }

    /**
     * builds CategorySetExternalIdAction with checking for non-null required values
     * @return CategorySetExternalIdAction
     */
    public CategorySetExternalIdAction build() {
        return new CategorySetExternalIdActionImpl(externalId);
    }
    
    /**
     * builds CategorySetExternalIdAction without checking for non-null required values
     * @return CategorySetExternalIdAction
     */
    public CategorySetExternalIdAction buildUnchecked() {
        return new CategorySetExternalIdActionImpl(externalId);
    }

    /**
     * factory method for an instance of CategorySetExternalIdActionBuilder
     * @return builder 
     */
    public static CategorySetExternalIdActionBuilder of() {
        return new CategorySetExternalIdActionBuilder();
    }

    /**
     * create builder for CategorySetExternalIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetExternalIdActionBuilder of(final CategorySetExternalIdAction template) {
        CategorySetExternalIdActionBuilder builder = new CategorySetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
