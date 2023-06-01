package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryUpdate categoryUpdate = CategoryUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryUpdateBuilder implements Builder<CategoryUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions;

    
    /**
     *  <p>Expected version of the Category on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public CategoryUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public CategoryUpdateBuilder actions( final com.commercetools.api.models.category.CategoryUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public CategoryUpdateBuilder actions( final java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public CategoryUpdateBuilder plusActions( final com.commercetools.api.models.category.CategoryUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public CategoryUpdateBuilder plusActions(Function<com.commercetools.api.models.category.CategoryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.category.CategoryUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.category.CategoryUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public CategoryUpdateBuilder withActions(Function<com.commercetools.api.models.category.CategoryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.category.CategoryUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.category.CategoryUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Expected version of the Category on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds CategoryUpdate with checking for non-null required values
     * @return CategoryUpdate
     */
    public CategoryUpdate build() {
        Objects.requireNonNull(version, CategoryUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CategoryUpdate.class + ": actions is missing");
        return new CategoryUpdateImpl(version, actions);
    }
    
    /**
     * builds CategoryUpdate without checking for non-null required values
     * @return CategoryUpdate
     */
    public CategoryUpdate buildUnchecked() {
        return new CategoryUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of CategoryUpdateBuilder
     * @return builder 
     */
    public static CategoryUpdateBuilder of() {
        return new CategoryUpdateBuilder();
    }

    /**
     * create builder for CategoryUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryUpdateBuilder of(final CategoryUpdate template) {
        CategoryUpdateBuilder builder = new CategoryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
