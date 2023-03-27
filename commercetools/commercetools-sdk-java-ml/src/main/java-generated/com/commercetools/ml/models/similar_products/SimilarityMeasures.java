
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Specify which ProductData attributes to use for estimating similarity and how to weigh them. An attribute's weight can be any whole positive integer, starting with 0. The larger the integer, the higher its weight.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarityMeasures similarityMeasures = SimilarityMeasures.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SimilarityMeasuresImpl.class)
public interface SimilarityMeasures {

    /**
     *  <p>Importance of the <code>name</code> attribute in overall similarity.</p>
     * @return name
     */

    @JsonProperty("name")
    public Long getName();

    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @return description
     */

    @JsonProperty("description")
    public Long getDescription();

    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @return attribute
     */

    @JsonProperty("attribute")
    public Long getAttribute();

    /**
     *  <p>Importance of the number of product variants in overall similarity.</p>
     * @return variantCount
     */

    @JsonProperty("variantCount")
    public Long getVariantCount();

    /**
     *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
     * @return price
     */

    @JsonProperty("price")
    public Long getPrice();

    /**
     *  <p>Importance of the <code>name</code> attribute in overall similarity.</p>
     * @param name value to be set
     */

    public void setName(final Long name);

    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @param description value to be set
     */

    public void setDescription(final Long description);

    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @param attribute value to be set
     */

    public void setAttribute(final Long attribute);

    /**
     *  <p>Importance of the number of product variants in overall similarity.</p>
     * @param variantCount value to be set
     */

    public void setVariantCount(final Long variantCount);

    /**
     *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
     * @param price value to be set
     */

    public void setPrice(final Long price);

    /**
     * factory method
     * @return instance of SimilarityMeasures
     */
    public static SimilarityMeasures of() {
        return new SimilarityMeasuresImpl();
    }

    /**
     * factory method to copy an instance of SimilarityMeasures
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarityMeasures of(final SimilarityMeasures template) {
        SimilarityMeasuresImpl instance = new SimilarityMeasuresImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttribute(template.getAttribute());
        instance.setVariantCount(template.getVariantCount());
        instance.setPrice(template.getPrice());
        return instance;
    }

    /**
     * builder factory method for SimilarityMeasures
     * @return builder
     */
    public static SimilarityMeasuresBuilder builder() {
        return SimilarityMeasuresBuilder.of();
    }

    /**
     * create builder for SimilarityMeasures instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarityMeasuresBuilder builder(final SimilarityMeasures template) {
        return SimilarityMeasuresBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarityMeasures(Function<SimilarityMeasures, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarityMeasures> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarityMeasures>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarityMeasures>";
            }
        };
    }
}
