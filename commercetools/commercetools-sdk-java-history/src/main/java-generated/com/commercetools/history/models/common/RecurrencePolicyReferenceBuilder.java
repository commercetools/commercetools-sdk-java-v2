
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyReference recurrencePolicyReference = RecurrencePolicyReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyReferenceBuilder implements Builder<RecurrencePolicyReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurrencePolicyReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds RecurrencePolicyReference with checking for non-null required values
     * @return RecurrencePolicyReference
     */
    public RecurrencePolicyReference build() {
        Objects.requireNonNull(id, RecurrencePolicyReference.class + ": id is missing");
        return new RecurrencePolicyReferenceImpl(id);
    }

    /**
     * builds RecurrencePolicyReference without checking for non-null required values
     * @return RecurrencePolicyReference
     */
    public RecurrencePolicyReference buildUnchecked() {
        return new RecurrencePolicyReferenceImpl(id);
    }

    /**
     * factory method for an instance of RecurrencePolicyReferenceBuilder
     * @return builder
     */
    public static RecurrencePolicyReferenceBuilder of() {
        return new RecurrencePolicyReferenceBuilder();
    }

    /**
     * create builder for RecurrencePolicyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyReferenceBuilder of(final RecurrencePolicyReference template) {
        RecurrencePolicyReferenceBuilder builder = new RecurrencePolicyReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
