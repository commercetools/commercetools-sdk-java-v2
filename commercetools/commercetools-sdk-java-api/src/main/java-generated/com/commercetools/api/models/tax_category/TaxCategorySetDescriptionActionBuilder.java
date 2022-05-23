
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TaxCategorySetDescriptionAction taxCategorySetDescriptionAction = TaxCategorySetDescriptionAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategorySetDescriptionActionBuilder implements Builder<TaxCategorySetDescriptionAction> {

    @Nullable
    private String description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public TaxCategorySetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public TaxCategorySetDescriptionAction build() {
        return new TaxCategorySetDescriptionActionImpl(description);
    }

    /**
     * builds TaxCategorySetDescriptionAction without checking for non null required values
     */
    public TaxCategorySetDescriptionAction buildUnchecked() {
        return new TaxCategorySetDescriptionActionImpl(description);
    }

    public static TaxCategorySetDescriptionActionBuilder of() {
        return new TaxCategorySetDescriptionActionBuilder();
    }

    public static TaxCategorySetDescriptionActionBuilder of(final TaxCategorySetDescriptionAction template) {
        TaxCategorySetDescriptionActionBuilder builder = new TaxCategorySetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
