
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderReference recurringOrderReference = RecurringOrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderReferenceBuilder implements Builder<RecurringOrderReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringOrderReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds RecurringOrderReference with checking for non-null required values
     * @return RecurringOrderReference
     */
    public RecurringOrderReference build() {
        Objects.requireNonNull(id, RecurringOrderReference.class + ": id is missing");
        return new RecurringOrderReferenceImpl(id);
    }

    /**
     * builds RecurringOrderReference without checking for non-null required values
     * @return RecurringOrderReference
     */
    public RecurringOrderReference buildUnchecked() {
        return new RecurringOrderReferenceImpl(id);
    }

    /**
     * factory method for an instance of RecurringOrderReferenceBuilder
     * @return builder
     */
    public static RecurringOrderReferenceBuilder of() {
        return new RecurringOrderReferenceBuilder();
    }

    /**
     * create builder for RecurringOrderReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderReferenceBuilder of(final RecurringOrderReference template) {
        RecurringOrderReferenceBuilder builder = new RecurringOrderReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
