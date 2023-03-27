
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *
     * @return dataType
     */
    @NotNull
    @JsonProperty("dataType")
    public TermFacetResultType getDataType();

    /**
     *
     * @return missing
     */
    @NotNull
    @JsonProperty("missing")
    public Long getMissing();

    /**
     *
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *
     * @return other
     */
    @NotNull
    @JsonProperty("other")
    public Long getOther();

    /**
     *
     * @return terms
     */
    @NotNull
    @Valid
    @JsonProperty("terms")
    public List<FacetTerm> getTerms();

    /**
     * set dataType
     * @param dataType value to be set
     */

    public void setDataType(final TermFacetResultType dataType);

    /**
     * set missing
     * @param missing value to be set
     */

    public void setMissing(final Long missing);

    /**
     * set total
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     * set other
     * @param other value to be set
     */

    public void setOther(final Long other);

    /**
     * set terms
     * @param terms values to be set
     */

    @JsonIgnore
    public void setTerms(final FacetTerm... terms);

    /**
     * set terms
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
     * factory method to copy an instance of TermFacetResult
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
