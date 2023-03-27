
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TermFacetResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TermFacetResult termFacetResult = TermFacetResult.builder()
 *             .dataType(TermFacetResultType.TEXT)
 *             .missing(0.3)
 *             .total(0.3)
 *             .other(0.3)
 *             .plusTerms(termsBuilder -> termsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TermFacetResultBuilder implements Builder<TermFacetResult> {

    private com.commercetools.api.models.product.TermFacetResultType dataType;

    private Long missing;

    private Long total;

    private Long other;

    private java.util.List<com.commercetools.api.models.product.FacetTerm> terms;

    /**
     * set the value to the dataType
     * @param dataType value to be set
     * @return Builder
     */

    public TermFacetResultBuilder dataType(final com.commercetools.api.models.product.TermFacetResultType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * set the value to the missing
     * @param missing value to be set
     * @return Builder
     */

    public TermFacetResultBuilder missing(final Long missing) {
        this.missing = missing;
        return this;
    }

    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */

    public TermFacetResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     * set the value to the other
     * @param other value to be set
     * @return Builder
     */

    public TermFacetResultBuilder other(final Long other) {
        this.other = other;
        return this;
    }

    /**
     * set values to the terms
     * @param terms value to be set
     * @return Builder
     */

    public TermFacetResultBuilder terms(final com.commercetools.api.models.product.FacetTerm... terms) {
        this.terms = new ArrayList<>(Arrays.asList(terms));
        return this;
    }

    /**
     * set value to the terms
     * @param terms value to be set
     * @return Builder
     */

    public TermFacetResultBuilder terms(final java.util.List<com.commercetools.api.models.product.FacetTerm> terms) {
        this.terms = terms;
        return this;
    }

    /**
     * add values to the terms
     * @param terms value to be set
     * @return Builder
     */

    public TermFacetResultBuilder plusTerms(final com.commercetools.api.models.product.FacetTerm... terms) {
        if (this.terms == null) {
            this.terms = new ArrayList<>();
        }
        this.terms.addAll(Arrays.asList(terms));
        return this;
    }

    /**
     * add the value to the terms using the builder function
     * @param builder function to build the terms value
     * @return Builder
     */

    public TermFacetResultBuilder plusTerms(
            Function<com.commercetools.api.models.product.FacetTermBuilder, com.commercetools.api.models.product.FacetTermBuilder> builder) {
        if (this.terms == null) {
            this.terms = new ArrayList<>();
        }
        this.terms.add(builder.apply(com.commercetools.api.models.product.FacetTermBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the terms using the builder function
     * @param builder function to build the terms value
     * @return Builder
     */

    public TermFacetResultBuilder withTerms(
            Function<com.commercetools.api.models.product.FacetTermBuilder, com.commercetools.api.models.product.FacetTermBuilder> builder) {
        this.terms = new ArrayList<>();
        this.terms.add(builder.apply(com.commercetools.api.models.product.FacetTermBuilder.of()).build());
        return this;
    }

    /**
     * value of dataType}
     * @return dataType
     */

    public com.commercetools.api.models.product.TermFacetResultType getDataType() {
        return this.dataType;
    }

    /**
     * value of missing}
     * @return missing
     */

    public Long getMissing() {
        return this.missing;
    }

    /**
     * value of total}
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     * value of other}
     * @return other
     */

    public Long getOther() {
        return this.other;
    }

    /**
     * value of terms}
     * @return terms
     */

    public java.util.List<com.commercetools.api.models.product.FacetTerm> getTerms() {
        return this.terms;
    }

    /**
     * builds TermFacetResult with checking for non-null required values
     * @return TermFacetResult
     */
    public TermFacetResult build() {
        Objects.requireNonNull(dataType, TermFacetResult.class + ": dataType is missing");
        Objects.requireNonNull(missing, TermFacetResult.class + ": missing is missing");
        Objects.requireNonNull(total, TermFacetResult.class + ": total is missing");
        Objects.requireNonNull(other, TermFacetResult.class + ": other is missing");
        Objects.requireNonNull(terms, TermFacetResult.class + ": terms is missing");
        return new TermFacetResultImpl(dataType, missing, total, other, terms);
    }

    /**
     * builds TermFacetResult without checking for non-null required values
     * @return TermFacetResult
     */
    public TermFacetResult buildUnchecked() {
        return new TermFacetResultImpl(dataType, missing, total, other, terms);
    }

    /**
     * factory method for an instance of TermFacetResultBuilder
     * @return builder
     */
    public static TermFacetResultBuilder of() {
        return new TermFacetResultBuilder();
    }

    /**
     * create builder for TermFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TermFacetResultBuilder of(final TermFacetResult template) {
        TermFacetResultBuilder builder = new TermFacetResultBuilder();
        builder.dataType = template.getDataType();
        builder.missing = template.getMissing();
        builder.total = template.getTotal();
        builder.other = template.getOther();
        builder.terms = template.getTerms();
        return builder;
    }

}
