
package com.commercetools.api.models.discount_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupResourceIdentifier discountGroupResourceIdentifier = DiscountGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupResourceIdentifierBuilder implements Builder<DiscountGroupResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced DiscountGroup. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public DiscountGroupResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced DiscountGroup. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountGroupResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced DiscountGroup. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced DiscountGroup. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds DiscountGroupResourceIdentifier with checking for non-null required values
     * @return DiscountGroupResourceIdentifier
     */
    public DiscountGroupResourceIdentifier build() {
        return new DiscountGroupResourceIdentifierImpl(id, key);
    }

    /**
     * builds DiscountGroupResourceIdentifier without checking for non-null required values
     * @return DiscountGroupResourceIdentifier
     */
    public DiscountGroupResourceIdentifier buildUnchecked() {
        return new DiscountGroupResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of DiscountGroupResourceIdentifierBuilder
     * @return builder
     */
    public static DiscountGroupResourceIdentifierBuilder of() {
        return new DiscountGroupResourceIdentifierBuilder();
    }

    /**
     * create builder for DiscountGroupResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupResourceIdentifierBuilder of(final DiscountGroupResourceIdentifier template) {
        DiscountGroupResourceIdentifierBuilder builder = new DiscountGroupResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
