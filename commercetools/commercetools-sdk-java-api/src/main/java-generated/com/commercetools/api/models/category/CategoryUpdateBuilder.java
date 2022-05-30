
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryUpdateBuilder implements Builder<CategoryUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions;

    /**
     *  <p>Expected version of the Category on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */

    public CategoryUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Category.</p>
     */

    public CategoryUpdateBuilder actions(final com.commercetools.api.models.category.CategoryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Category.</p>
     */

    public CategoryUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Category.</p>
     */

    public CategoryUpdateBuilder plusActions(
            final com.commercetools.api.models.category.CategoryUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Category.</p>
     */

    public CategoryUpdateBuilder plusActions(
            Function<com.commercetools.api.models.category.CategoryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.category.CategoryUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.category.CategoryUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Category.</p>
     */

    public CategoryUpdateBuilder withActions(
            Function<com.commercetools.api.models.category.CategoryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.category.CategoryUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.category.CategoryUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> getActions() {
        return this.actions;
    }

    public CategoryUpdate build() {
        Objects.requireNonNull(version, CategoryUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CategoryUpdate.class + ": actions is missing");
        return new CategoryUpdateImpl(version, actions);
    }

    /**
     * builds CategoryUpdate without checking for non null required values
     */
    public CategoryUpdate buildUnchecked() {
        return new CategoryUpdateImpl(version, actions);
    }

    public static CategoryUpdateBuilder of() {
        return new CategoryUpdateBuilder();
    }

    public static CategoryUpdateBuilder of(final CategoryUpdate template) {
        CategoryUpdateBuilder builder = new CategoryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
