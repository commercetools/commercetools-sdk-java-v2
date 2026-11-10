
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentReference recurringPaymentReference = RecurringPaymentReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentReferenceBuilder implements Builder<RecurringPaymentReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringPaymentReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds RecurringPaymentReference with checking for non-null required values
     * @return RecurringPaymentReference
     */
    public RecurringPaymentReference build() {
        Objects.requireNonNull(id, RecurringPaymentReference.class + ": id is missing");
        return new RecurringPaymentReferenceImpl(id);
    }

    /**
     * builds RecurringPaymentReference without checking for non-null required values
     * @return RecurringPaymentReference
     */
    public RecurringPaymentReference buildUnchecked() {
        return new RecurringPaymentReferenceImpl(id);
    }

    /**
     * factory method for an instance of RecurringPaymentReferenceBuilder
     * @return builder
     */
    public static RecurringPaymentReferenceBuilder of() {
        return new RecurringPaymentReferenceBuilder();
    }

    /**
     * create builder for RecurringPaymentReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentReferenceBuilder of(final RecurringPaymentReference template) {
        RecurringPaymentReferenceBuilder builder = new RecurringPaymentReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
