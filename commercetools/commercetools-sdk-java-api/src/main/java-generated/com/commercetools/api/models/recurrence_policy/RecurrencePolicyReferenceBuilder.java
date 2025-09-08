
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.recurrence_policy.RecurrencePolicy obj;

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
     *  <p>Contains the representation of the expanded RecurrencePolicy. Only present in responses to requests with <span>Reference Expansion</span> for RecurrencePolicies.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public RecurrencePolicyReferenceBuilder obj(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded RecurrencePolicy. Only present in responses to requests with <span>Reference Expansion</span> for RecurrencePolicies.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public RecurrencePolicyReferenceBuilder withObj(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicy> builder) {
        this.obj = builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded RecurrencePolicy. Only present in responses to requests with <span>Reference Expansion</span> for RecurrencePolicies.</p>
     * @param obj value to be set
     * @return Builder
     */

    public RecurrencePolicyReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.recurrence_policy.RecurrencePolicy obj) {
        this.obj = obj;
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
     *  <p>Contains the representation of the expanded RecurrencePolicy. Only present in responses to requests with <span>Reference Expansion</span> for RecurrencePolicies.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.recurrence_policy.RecurrencePolicy getObj() {
        return this.obj;
    }

    /**
     * builds RecurrencePolicyReference with checking for non-null required values
     * @return RecurrencePolicyReference
     */
    public RecurrencePolicyReference build() {
        Objects.requireNonNull(id, RecurrencePolicyReference.class + ": id is missing");
        return new RecurrencePolicyReferenceImpl(id, obj);
    }

    /**
     * builds RecurrencePolicyReference without checking for non-null required values
     * @return RecurrencePolicyReference
     */
    public RecurrencePolicyReference buildUnchecked() {
        return new RecurrencePolicyReferenceImpl(id, obj);
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
        builder.obj = template.getObj();
        return builder;
    }

}
