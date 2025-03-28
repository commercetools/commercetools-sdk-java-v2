
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TermFacetResult
 *
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
@JsonDeserialize(as = TermFacetResultImpl.class)
public interface TermFacetResult extends FacetResult {

    /**
     * discriminator value for TermFacetResult
     */
    String TERMS = "terms";

    /**
     *  <p>Data type to which the facet is applied.</p>
     * @return dataType
     */
    @NotNull
    @JsonProperty("dataType")
    public TermFacetResultType getDataType();

    /**
     *  <p>Number of ProductVariants that have no value for the specified term facet expression.</p>
     * @return missing
     */
    @NotNull
    @JsonProperty("missing")
    public Long getMissing();

    /**
     *  <p>Number of terms matching the term facet expression.</p>
     *  <ul>
     *   <li>If the expression refers to Product fields like <code>categories.id</code> and <code>reviewRatingStatistics.count</code>, the value represents the number of Products.</li>
     *   <li>If the expression is defined for fields specific to Product Variants, for example, <code>variants.attributes.{name}</code>, the value represents the number of Product Variants matching the expression.</li>
     *  </ul>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of terms not represented in this object (such as the number of terms beyond the limit).</p>
     * @return other
     */
    @NotNull
    @JsonProperty("other")
    public Long getOther();

    /**
     *  <p>Values for the field specified in term facet expression for which at least one ProductVariant could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count Products through the <code>counting products</code> extension, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @return terms
     */
    @NotNull
    @Valid
    @JsonProperty("terms")
    public List<FacetTerm> getTerms();

    /**
     *  <p>Data type to which the facet is applied.</p>
     * @param dataType value to be set
     */

    public void setDataType(final TermFacetResultType dataType);

    /**
     *  <p>Number of ProductVariants that have no value for the specified term facet expression.</p>
     * @param missing value to be set
     */

    public void setMissing(final Long missing);

    /**
     *  <p>Number of terms matching the term facet expression.</p>
     *  <ul>
     *   <li>If the expression refers to Product fields like <code>categories.id</code> and <code>reviewRatingStatistics.count</code>, the value represents the number of Products.</li>
     *   <li>If the expression is defined for fields specific to Product Variants, for example, <code>variants.attributes.{name}</code>, the value represents the number of Product Variants matching the expression.</li>
     *  </ul>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of terms not represented in this object (such as the number of terms beyond the limit).</p>
     * @param other value to be set
     */

    public void setOther(final Long other);

    /**
     *  <p>Values for the field specified in term facet expression for which at least one ProductVariant could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count Products through the <code>counting products</code> extension, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @param terms values to be set
     */

    @JsonIgnore
    public void setTerms(final FacetTerm... terms);

    /**
     *  <p>Values for the field specified in term facet expression for which at least one ProductVariant could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count Products through the <code>counting products</code> extension, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
     * @param terms values to be set
     */

    public void setTerms(final List<FacetTerm> terms);

    /**
     * factory method
     * @return instance of TermFacetResult
     */
    public static TermFacetResult of() {
        return new TermFacetResultImpl();
    }

    /**
     * factory method to create a shallow copy TermFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static TermFacetResult of(final TermFacetResult template) {
        TermFacetResultImpl instance = new TermFacetResultImpl();
        instance.setDataType(template.getDataType());
        instance.setMissing(template.getMissing());
        instance.setTotal(template.getTotal());
        instance.setOther(template.getOther());
        instance.setTerms(template.getTerms());
        return instance;
    }

    /**
     * factory method to create a deep copy of TermFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TermFacetResult deepCopy(@Nullable final TermFacetResult template) {
        if (template == null) {
            return null;
        }
        TermFacetResultImpl instance = new TermFacetResultImpl();
        instance.setDataType(template.getDataType());
        instance.setMissing(template.getMissing());
        instance.setTotal(template.getTotal());
        instance.setOther(template.getOther());
        instance.setTerms(Optional.ofNullable(template.getTerms())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.FacetTerm::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TermFacetResult
     * @return builder
     */
    public static TermFacetResultBuilder builder() {
        return TermFacetResultBuilder.of();
    }

    /**
     * create builder for TermFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TermFacetResultBuilder builder(final TermFacetResult template) {
        return TermFacetResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTermFacetResult(Function<TermFacetResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TermFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TermFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<TermFacetResult>";
            }
        };
    }
}
