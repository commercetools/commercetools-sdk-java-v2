
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountUpdate productDiscountUpdate = ProductDiscountUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountUpdateBuilder implements Builder<ProductDiscountUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions;

    /**
     *  <p>Expected version of the ProductDiscount on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductDiscountUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductDiscountUpdateBuilder actions(
            final com.commercetools.api.models.product_discount.ProductDiscountUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductDiscountUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ProductDiscountUpdateBuilder plusActions(
            final com.commercetools.api.models.product_discount.ProductDiscountUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductDiscountUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ProductDiscountUpdateBuilder withActions(
            Function<com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Expected version of the ProductDiscount on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ProductDiscountUpdate with checking for non-null required values
     * @return ProductDiscountUpdate
     */
    public ProductDiscountUpdate build() {
        Objects.requireNonNull(version, ProductDiscountUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductDiscountUpdate.class + ": actions is missing");
        return new ProductDiscountUpdateImpl(version, actions);
    }

    /**
     * builds ProductDiscountUpdate without checking for non-null required values
     * @return ProductDiscountUpdate
     */
    public ProductDiscountUpdate buildUnchecked() {
        return new ProductDiscountUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ProductDiscountUpdateBuilder
     * @return builder
     */
    public static ProductDiscountUpdateBuilder of() {
        return new ProductDiscountUpdateBuilder();
    }

    /**
     * create builder for ProductDiscountUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountUpdateBuilder of(final ProductDiscountUpdate template) {
        ProductDiscountUpdateBuilder builder = new ProductDiscountUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
