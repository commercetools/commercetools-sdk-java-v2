
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductSearchRequestMeta
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductSearchRequestMeta similarProductSearchRequestMeta = SimilarProductSearchRequestMeta.builder()
 *             .similarityMeasures(similarityMeasuresBuilder -> similarityMeasuresBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SimilarProductSearchRequestMetaImpl.class)
public interface SimilarProductSearchRequestMeta {

    /**
     *  <p>The SimilarityMeasures used in this search.</p>
     * @return similarityMeasures
     */
    @NotNull
    @Valid
    @JsonProperty("similarityMeasures")
    public SimilarityMeasures getSimilarityMeasures();

    /**
     *  <p>The SimilarityMeasures used in this search.</p>
     * @param similarityMeasures value to be set
     */

    public void setSimilarityMeasures(final SimilarityMeasures similarityMeasures);

    /**
     * factory method
     * @return instance of SimilarProductSearchRequestMeta
     */
    public static SimilarProductSearchRequestMeta of() {
        return new SimilarProductSearchRequestMetaImpl();
    }

    /**
     * factory method to create a shallow copy SimilarProductSearchRequestMeta
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarProductSearchRequestMeta of(final SimilarProductSearchRequestMeta template) {
        SimilarProductSearchRequestMetaImpl instance = new SimilarProductSearchRequestMetaImpl();
        instance.setSimilarityMeasures(template.getSimilarityMeasures());
        return instance;
    }

    /**
     * factory method to create a deep copy of SimilarProductSearchRequestMeta
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SimilarProductSearchRequestMeta deepCopy(@Nullable final SimilarProductSearchRequestMeta template) {
        if (template == null) {
            return null;
        }
        SimilarProductSearchRequestMetaImpl instance = new SimilarProductSearchRequestMetaImpl();
        instance.setSimilarityMeasures(
            com.commercetools.ml.models.similar_products.SimilarityMeasures.deepCopy(template.getSimilarityMeasures()));
        return instance;
    }

    /**
     * builder factory method for SimilarProductSearchRequestMeta
     * @return builder
     */
    public static SimilarProductSearchRequestMetaBuilder builder() {
        return SimilarProductSearchRequestMetaBuilder.of();
    }

    /**
     * create builder for SimilarProductSearchRequestMeta instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductSearchRequestMetaBuilder builder(final SimilarProductSearchRequestMeta template) {
        return SimilarProductSearchRequestMetaBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProductSearchRequestMeta(Function<SimilarProductSearchRequestMeta, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductSearchRequestMeta> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductSearchRequestMeta>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductSearchRequestMeta>";
            }
        };
    }
}
