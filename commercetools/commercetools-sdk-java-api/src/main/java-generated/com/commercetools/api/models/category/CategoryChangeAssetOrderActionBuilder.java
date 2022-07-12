
package com.commercetools.api.models.category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeAssetOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetOrderAction categoryChangeAssetOrderAction = CategoryChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeAssetOrderActionBuilder implements Builder<CategoryChangeAssetOrderAction> {

    private java.util.List<String> assetOrder;

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     */

    public CategoryChangeAssetOrderActionBuilder assetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     */

    public CategoryChangeAssetOrderActionBuilder assetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     */

    public CategoryChangeAssetOrderActionBuilder plusAssetOrder(final String... assetOrder) {
        if (this.assetOrder == null) {
            this.assetOrder = new ArrayList<>();
        }
        this.assetOrder.addAll(Arrays.asList(assetOrder));
        return this;
    }

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public CategoryChangeAssetOrderAction build() {
        Objects.requireNonNull(assetOrder, CategoryChangeAssetOrderAction.class + ": assetOrder is missing");
        return new CategoryChangeAssetOrderActionImpl(assetOrder);
    }

    /**
     * builds CategoryChangeAssetOrderAction without checking for non null required values
     */
    public CategoryChangeAssetOrderAction buildUnchecked() {
        return new CategoryChangeAssetOrderActionImpl(assetOrder);
    }

    public static CategoryChangeAssetOrderActionBuilder of() {
        return new CategoryChangeAssetOrderActionBuilder();
    }

    public static CategoryChangeAssetOrderActionBuilder of(final CategoryChangeAssetOrderAction template) {
        CategoryChangeAssetOrderActionBuilder builder = new CategoryChangeAssetOrderActionBuilder();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
