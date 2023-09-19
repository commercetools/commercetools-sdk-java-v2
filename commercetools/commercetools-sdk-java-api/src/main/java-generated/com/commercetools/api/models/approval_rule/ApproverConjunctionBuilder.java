
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApproverConjunctionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverConjunction approverConjunction = ApproverConjunction.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverConjunctionBuilder implements Builder<ApproverConjunction> {

    private java.util.List<com.commercetools.api.models.approval_rule.ApproverDisjunction> and;

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and value to be set
     * @return Builder
     */

    public ApproverConjunctionBuilder and(final com.commercetools.api.models.approval_rule.ApproverDisjunction... and) {
        this.and = new ArrayList<>(Arrays.asList(and));
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and value to be set
     * @return Builder
     */

    public ApproverConjunctionBuilder and(
            final java.util.List<com.commercetools.api.models.approval_rule.ApproverDisjunction> and) {
        this.and = and;
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and value to be set
     * @return Builder
     */

    public ApproverConjunctionBuilder plusAnd(
            final com.commercetools.api.models.approval_rule.ApproverDisjunction... and) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.addAll(Arrays.asList(and));
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionBuilder plusAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder> builder) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.add(builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionBuilder withAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder> builder) {
        this.and = new ArrayList<>();
        this.and.add(builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionBuilder addAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunction> builder) {
        return plusAnd(builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder.of()));
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionBuilder setAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunction> builder) {
        return and(builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionBuilder.of()));
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @return and
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApproverDisjunction> getAnd() {
        return this.and;
    }

    /**
     * builds ApproverConjunction with checking for non-null required values
     * @return ApproverConjunction
     */
    public ApproverConjunction build() {
        Objects.requireNonNull(and, ApproverConjunction.class + ": and is missing");
        return new ApproverConjunctionImpl(and);
    }

    /**
     * builds ApproverConjunction without checking for non-null required values
     * @return ApproverConjunction
     */
    public ApproverConjunction buildUnchecked() {
        return new ApproverConjunctionImpl(and);
    }

    /**
     * factory method for an instance of ApproverConjunctionBuilder
     * @return builder
     */
    public static ApproverConjunctionBuilder of() {
        return new ApproverConjunctionBuilder();
    }

    /**
     * create builder for ApproverConjunction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverConjunctionBuilder of(final ApproverConjunction template) {
        ApproverConjunctionBuilder builder = new ApproverConjunctionBuilder();
        builder.and = template.getAnd();
        return builder;
    }

}
