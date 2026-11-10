
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemRecurrenceInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemRecurrenceInfo customLineItemRecurrenceInfo = CustomLineItemRecurrenceInfo.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemRecurrenceInfoBuilder implements Builder<CustomLineItemRecurrenceInfo> {

    private com.commercetools.history.models.common.RecurrencePolicyReference recurrencePolicy;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public CustomLineItemRecurrenceInfoBuilder recurrencePolicy(
            Function<com.commercetools.history.models.common.RecurrencePolicyReferenceBuilder, com.commercetools.history.models.common.RecurrencePolicyReferenceBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.history.models.common.RecurrencePolicyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public CustomLineItemRecurrenceInfoBuilder withRecurrencePolicy(
            Function<com.commercetools.history.models.common.RecurrencePolicyReferenceBuilder, com.commercetools.history.models.common.RecurrencePolicyReference> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.history.models.common.RecurrencePolicyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public CustomLineItemRecurrenceInfoBuilder recurrencePolicy(
            final com.commercetools.history.models.common.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */

    public com.commercetools.history.models.common.RecurrencePolicyReference getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * builds CustomLineItemRecurrenceInfo with checking for non-null required values
     * @return CustomLineItemRecurrenceInfo
     */
    public CustomLineItemRecurrenceInfo build() {
        Objects.requireNonNull(recurrencePolicy, CustomLineItemRecurrenceInfo.class + ": recurrencePolicy is missing");
        return new CustomLineItemRecurrenceInfoImpl(recurrencePolicy);
    }

    /**
     * builds CustomLineItemRecurrenceInfo without checking for non-null required values
     * @return CustomLineItemRecurrenceInfo
     */
    public CustomLineItemRecurrenceInfo buildUnchecked() {
        return new CustomLineItemRecurrenceInfoImpl(recurrencePolicy);
    }

    /**
     * factory method for an instance of CustomLineItemRecurrenceInfoBuilder
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoBuilder of() {
        return new CustomLineItemRecurrenceInfoBuilder();
    }

    /**
     * create builder for CustomLineItemRecurrenceInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoBuilder of(final CustomLineItemRecurrenceInfo template) {
        CustomLineItemRecurrenceInfoBuilder builder = new CustomLineItemRecurrenceInfoBuilder();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        return builder;
    }

}
