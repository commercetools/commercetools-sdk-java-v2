
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRecalculateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRecalculateAction myCartRecalculateAction = MyCartRecalculateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRecalculateActionBuilder implements Builder<MyCartRecalculateAction> {

    @Nullable
    private Boolean updateProductData;

    /**
     *  <ul>
     *   <li>Leave empty or set to <code>false</code> to only update the Prices and TaxRates of the Line Items.</li>
     *   <li>Set to <code>true</code> to update the Line Items' product data (like <code>name</code>, <code>variant</code> and <code>productType</code>) also.</li>
     *  </ul>
     * @param updateProductData value to be set
     * @return Builder
     */

    public MyCartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    /**
     * builds MyCartRecalculateAction with checking for non-null required values
     * @return MyCartRecalculateAction
     */
    public MyCartRecalculateAction build() {
        return new MyCartRecalculateActionImpl(updateProductData);
    }

    /**
     * builds MyCartRecalculateAction without checking for non-null required values
     * @return MyCartRecalculateAction
     */
    public MyCartRecalculateAction buildUnchecked() {
        return new MyCartRecalculateActionImpl(updateProductData);
    }

    public static MyCartRecalculateActionBuilder of() {
        return new MyCartRecalculateActionBuilder();
    }

    public static MyCartRecalculateActionBuilder of(final MyCartRecalculateAction template) {
        MyCartRecalculateActionBuilder builder = new MyCartRecalculateActionBuilder();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
