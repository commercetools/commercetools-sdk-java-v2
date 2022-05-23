
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductUnpublishAction productUnpublishAction = ProductUnpublishAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductUnpublishActionBuilder implements Builder<ProductUnpublishAction> {

    public ProductUnpublishAction build() {
        return new ProductUnpublishActionImpl();
    }

    /**
     * builds ProductUnpublishAction without checking for non null required values
     */
    public ProductUnpublishAction buildUnchecked() {
        return new ProductUnpublishActionImpl();
    }

    public static ProductUnpublishActionBuilder of() {
        return new ProductUnpublishActionBuilder();
    }

    public static ProductUnpublishActionBuilder of(final ProductUnpublishAction template) {
        ProductUnpublishActionBuilder builder = new ProductUnpublishActionBuilder();
        return builder;
    }

}
