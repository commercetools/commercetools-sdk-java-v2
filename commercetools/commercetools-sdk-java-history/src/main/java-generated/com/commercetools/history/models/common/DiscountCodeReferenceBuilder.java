
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeReference discountCodeReference = DiscountCodeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeReferenceBuilder implements Builder<DiscountCodeReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public DiscountCodeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds DiscountCodeReference with checking for non-null required values
     * @return DiscountCodeReference
     */
    public DiscountCodeReference build() {
        Objects.requireNonNull(id, DiscountCodeReference.class + ": id is missing");
        return new DiscountCodeReferenceImpl(id);
    }

    /**
     * builds DiscountCodeReference without checking for non-null required values
     * @return DiscountCodeReference
     */
    public DiscountCodeReference buildUnchecked() {
        return new DiscountCodeReferenceImpl(id);
    }

    /**
     * factory method for an instance of DiscountCodeReferenceBuilder
     * @return builder
     */
    public static DiscountCodeReferenceBuilder of() {
        return new DiscountCodeReferenceBuilder();
    }

    /**
     * create builder for DiscountCodeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeReferenceBuilder of(final DiscountCodeReference template) {
        DiscountCodeReferenceBuilder builder = new DiscountCodeReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
