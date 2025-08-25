
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUpdate productUpdate = ProductUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductUpdateBuilder implements Builder<ProductUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions;

    /**
     *  <p>Expected version of the Product on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductUpdateBuilder actions(final com.commercetools.api.models.product.ProductUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductUpdateBuilder plusActions(final com.commercetools.api.models.product.ProductUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product.ProductUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product.ProductUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.product.ProductUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductUpdateBuilder withActions(
            Function<com.commercetools.api.models.product.ProductUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product.ProductUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.product.ProductUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Product on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.product.ProductUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ProductUpdate with checking for non-null required values
     * @return ProductUpdate
     */
    public ProductUpdate build() {
        Objects.requireNonNull(version, ProductUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductUpdate.class + ": actions is missing");
        return new ProductUpdateImpl(version, actions);
    }

    /**
     * builds ProductUpdate without checking for non-null required values
     * @return ProductUpdate
     */
    public ProductUpdate buildUnchecked() {
        return new ProductUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ProductUpdateBuilder
     * @return builder
     */
    public static ProductUpdateBuilder of() {
        return new ProductUpdateBuilder();
    }

    /**
     * create builder for ProductUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductUpdateBuilder of(final ProductUpdate template) {
        ProductUpdateBuilder builder = new ProductUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
