
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   DiscountCodeKeyReference discountCodeKeyReference = DiscountCodeKeyReference.builder()
           .key("{key}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeKeyReferenceBuilder implements Builder<DiscountCodeKeyReference> {

    private String key;

    public DiscountCodeKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public DiscountCodeKeyReference build() {
        Objects.requireNonNull(key, DiscountCodeKeyReference.class + ": key is missing");
        return new DiscountCodeKeyReferenceImpl(key);
    }

    /**
     * builds DiscountCodeKeyReference without checking for non null required values
     */
    public DiscountCodeKeyReference buildUnchecked() {
        return new DiscountCodeKeyReferenceImpl(key);
    }

    public static DiscountCodeKeyReferenceBuilder of() {
        return new DiscountCodeKeyReferenceBuilder();
    }

    public static DiscountCodeKeyReferenceBuilder of(final DiscountCodeKeyReference template) {
        DiscountCodeKeyReferenceBuilder builder = new DiscountCodeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
