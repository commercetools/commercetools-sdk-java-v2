
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionUpdate productSelectionUpdate = ProductSelectionUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionUpdateBuilder implements Builder<ProductSelectionUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_selection.ProductSelectionUpdateAction> actions;

    /**
     * set the value to the version
     * @param version value to be set
     * @return Builder
     */

    public ProductSelectionUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     * set values to the actions
     * @param actions value to be set
     * @return Builder
     */

    public ProductSelectionUpdateBuilder actions(
            final com.commercetools.api.models.product_selection.ProductSelectionUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     * set value to the actions
     * @param actions value to be set
     * @return Builder
     */

    public ProductSelectionUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_selection.ProductSelectionUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * add values to the actions
     * @param actions value to be set
     * @return Builder
     */

    public ProductSelectionUpdateBuilder plusActions(
            final com.commercetools.api.models.product_selection.ProductSelectionUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     * add a value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductSelectionUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductSelectionUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     * set the value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductSelectionUpdateBuilder withActions(
            Function<com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductSelectionUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     * value of version}
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * value of actions}
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.product_selection.ProductSelectionUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ProductSelectionUpdate with checking for non-null required values
     * @return ProductSelectionUpdate
     */
    public ProductSelectionUpdate build() {
        Objects.requireNonNull(version, ProductSelectionUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductSelectionUpdate.class + ": actions is missing");
        return new ProductSelectionUpdateImpl(version, actions);
    }

    /**
     * builds ProductSelectionUpdate without checking for non-null required values
     * @return ProductSelectionUpdate
     */
    public ProductSelectionUpdate buildUnchecked() {
        return new ProductSelectionUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ProductSelectionUpdateBuilder
     * @return builder
     */
    public static ProductSelectionUpdateBuilder of() {
        return new ProductSelectionUpdateBuilder();
    }

    /**
     * create builder for ProductSelectionUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionUpdateBuilder of(final ProductSelectionUpdate template) {
        ProductSelectionUpdateBuilder builder = new ProductSelectionUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
