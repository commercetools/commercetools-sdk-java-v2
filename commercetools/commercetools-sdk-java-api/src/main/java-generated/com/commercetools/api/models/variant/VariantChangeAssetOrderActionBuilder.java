
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantChangeAssetOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantChangeAssetOrderAction variantChangeAssetOrderAction = VariantChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantChangeAssetOrderActionBuilder implements Builder<VariantChangeAssetOrderAction> {

    @Nullable
    private Boolean staged;

    private java.util.List<String> assetOrder;

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantChangeAssetOrderActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @param assetOrder value to be set
     * @return Builder
     */

    public VariantChangeAssetOrderActionBuilder assetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @param assetOrder value to be set
     * @return Builder
     */

    public VariantChangeAssetOrderActionBuilder assetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @param assetOrder value to be set
     * @return Builder
     */

    public VariantChangeAssetOrderActionBuilder plusAssetOrder(final String... assetOrder) {
        if (this.assetOrder == null) {
            this.assetOrder = new ArrayList<>();
        }
        this.assetOrder.addAll(Arrays.asList(assetOrder));
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @return assetOrder
     */

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    /**
     * builds VariantChangeAssetOrderAction with checking for non-null required values
     * @return VariantChangeAssetOrderAction
     */
    public VariantChangeAssetOrderAction build() {
        Objects.requireNonNull(assetOrder, VariantChangeAssetOrderAction.class + ": assetOrder is missing");
        return new VariantChangeAssetOrderActionImpl(staged, assetOrder);
    }

    /**
     * builds VariantChangeAssetOrderAction without checking for non-null required values
     * @return VariantChangeAssetOrderAction
     */
    public VariantChangeAssetOrderAction buildUnchecked() {
        return new VariantChangeAssetOrderActionImpl(staged, assetOrder);
    }

    /**
     * factory method for an instance of VariantChangeAssetOrderActionBuilder
     * @return builder
     */
    public static VariantChangeAssetOrderActionBuilder of() {
        return new VariantChangeAssetOrderActionBuilder();
    }

    /**
     * create builder for VariantChangeAssetOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantChangeAssetOrderActionBuilder of(final VariantChangeAssetOrderAction template) {
        VariantChangeAssetOrderActionBuilder builder = new VariantChangeAssetOrderActionBuilder();
        builder.staged = template.getStaged();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
