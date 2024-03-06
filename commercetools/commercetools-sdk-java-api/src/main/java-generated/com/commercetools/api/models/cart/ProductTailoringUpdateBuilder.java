
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUpdate productTailoringUpdate = ProductTailoringUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringUpdateBuilder implements Builder<ProductTailoringUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction> actions;

    /**
     *  <p>Expected version of the ProductTailoring on which the changes apply. If the expected version does not match the actual version, a 409 Conflict is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductTailoringUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductTailoringUpdateBuilder actions(
            final com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductTailoringUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductTailoringUpdateBuilder plusActions(
            final com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductTailoringUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductTailoringUpdateBuilder withActions(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Expected version of the ProductTailoring on which the changes apply. If the expected version does not match the actual version, a 409 Conflict is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ProductTailoringUpdate with checking for non-null required values
     * @return ProductTailoringUpdate
     */
    public ProductTailoringUpdate build() {
        Objects.requireNonNull(version, ProductTailoringUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductTailoringUpdate.class + ": actions is missing");
        return new ProductTailoringUpdateImpl(version, actions);
    }

    /**
     * builds ProductTailoringUpdate without checking for non-null required values
     * @return ProductTailoringUpdate
     */
    public ProductTailoringUpdate buildUnchecked() {
        return new ProductTailoringUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ProductTailoringUpdateBuilder
     * @return builder
     */
    public static ProductTailoringUpdateBuilder of() {
        return new ProductTailoringUpdateBuilder();
    }

    /**
     * create builder for ProductTailoringUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringUpdateBuilder of(final ProductTailoringUpdate template) {
        ProductTailoringUpdateBuilder builder = new ProductTailoringUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
