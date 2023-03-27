
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategorySetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategorySetDescriptionAction taxCategorySetDescriptionAction = TaxCategorySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategorySetDescriptionActionBuilder implements Builder<TaxCategorySetDescriptionAction> {

    @Nullable
    private String description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public TaxCategorySetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     * builds TaxCategorySetDescriptionAction with checking for non-null required values
     * @return TaxCategorySetDescriptionAction
     */
    public TaxCategorySetDescriptionAction build() {
        return new TaxCategorySetDescriptionActionImpl(description);
    }

    /**
     * builds TaxCategorySetDescriptionAction without checking for non-null required values
     * @return TaxCategorySetDescriptionAction
     */
    public TaxCategorySetDescriptionAction buildUnchecked() {
        return new TaxCategorySetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of TaxCategorySetDescriptionActionBuilder
     * @return builder
     */
    public static TaxCategorySetDescriptionActionBuilder of() {
        return new TaxCategorySetDescriptionActionBuilder();
    }

    /**
     * create builder for TaxCategorySetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategorySetDescriptionActionBuilder of(final TaxCategorySetDescriptionAction template) {
        TaxCategorySetDescriptionActionBuilder builder = new TaxCategorySetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
