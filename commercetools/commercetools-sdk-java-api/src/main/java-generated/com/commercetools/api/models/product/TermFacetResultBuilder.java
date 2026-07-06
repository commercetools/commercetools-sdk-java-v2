
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
     *  <p>Data type to which the facet is applied.</p>
     * @param dataType value to be set
     * @return Builder
     */

    public TermFacetResultBuilder dataType(final com.commercetools.api.models.product.TermFacetResultType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> that have no value for the specified <span>term facet expression</span>.</p>
     * @param missing value to be set
     * @return Builder
     */

    public TermFacetResultBuilder missing(final Long missing) {
        this.missing = missing;
        return this;
    }

    /**
     *  <p>Number of terms matching the <span>term facet expression</span>.</p>
     *  <ul>
     *   <li>If the expression refers to Product fields like <code>categories.id</code> and <code>reviewRatingStatistics.count</code>, the value represents the number of Products.</li>
     *   <li>If the expression is defined for fields specific to Product Variants, for example, <code>variants.attributes.{name}</code>, the value represents the number of Product Variants matching the expression.</li>
     *  </ul>
     * @param total value to be set
     * @return Builder
     */

    public TermFacetResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of terms not represented in this object (such as the number of terms beyond the <span>limit</span>).</p>
     * @param other value to be set
     * @return Builder
     */

    public TermFacetResultBuilder other(final Long other) {
        this.other = other;
        return this;
    }

    /**
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @param terms value to be set
     * @return Builder
     */

    public TermFacetResultBuilder terms(final com.commercetools.api.models.product.FacetTerm... terms) {
        this.terms = new ArrayList<>(Arrays.asList(terms));
        return this;
    }

    /**
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @param terms value to be set
     * @return Builder
     */

    public TermFacetResultBuilder terms(final java.util.List<com.commercetools.api.models.product.FacetTerm> terms) {
        this.terms = terms;
        return this;
    }

    /**
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
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
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
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
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
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
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @param builder function to build the terms value
     * @return Builder
     */

    public TermFacetResultBuilder addTerms(
            Function<com.commercetools.api.models.product.FacetTermBuilder, com.commercetools.api.models.product.FacetTerm> builder) {
        return plusTerms(builder.apply(com.commercetools.api.models.product.FacetTermBuilder.of()));
    }

    /**
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @param builder function to build the terms value
     * @return Builder
     */

    public TermFacetResultBuilder setTerms(
            Function<com.commercetools.api.models.product.FacetTermBuilder, com.commercetools.api.models.product.FacetTerm> builder) {
        return terms(builder.apply(com.commercetools.api.models.product.FacetTermBuilder.of()));
    }

    /**
     *  <p>Data type to which the facet is applied.</p>
     * @return dataType
     */

    public com.commercetools.api.models.product.TermFacetResultType getDataType() {
        return this.dataType;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> that have no value for the specified <span>term facet expression</span>.</p>
     * @return missing
     */

    public Long getMissing() {
        return this.missing;
    }

    /**
     *  <p>Number of terms matching the <span>term facet expression</span>.</p>
     *  <ul>
     *   <li>If the expression refers to Product fields like <code>categories.id</code> and <code>reviewRatingStatistics.count</code>, the value represents the number of Products.</li>
     *   <li>If the expression is defined for fields specific to Product Variants, for example, <code>variants.attributes.{name}</code>, the value represents the number of Product Variants matching the expression.</li>
     *  </ul>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of terms not represented in this object (such as the number of terms beyond the <span>limit</span>).</p>
     * @return other
     */

    public Long getOther() {
        return this.other;
    }

    /**
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
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
