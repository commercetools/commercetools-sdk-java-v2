
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeResourceIdentifier discountCodeResourceIdentifier = DiscountCodeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeResourceIdentifierBuilder implements Builder<DiscountCodeResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     <*  <p>Unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public DiscountCodeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public DiscountCodeResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public DiscountCodeResourceIdentifier build() {
        return new DiscountCodeResourceIdentifierImpl(id, key);
    }

    /**
     * builds DiscountCodeResourceIdentifier without checking for non null required values
     */
    public DiscountCodeResourceIdentifier buildUnchecked() {
        return new DiscountCodeResourceIdentifierImpl(id, key);
    }

    public static DiscountCodeResourceIdentifierBuilder of() {
        return new DiscountCodeResourceIdentifierBuilder();
    }

    public static DiscountCodeResourceIdentifierBuilder of(final DiscountCodeResourceIdentifier template) {
        DiscountCodeResourceIdentifierBuilder builder = new DiscountCodeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
