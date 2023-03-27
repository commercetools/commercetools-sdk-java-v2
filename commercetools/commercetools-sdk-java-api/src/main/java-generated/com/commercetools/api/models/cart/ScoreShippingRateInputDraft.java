
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScoreShippingRateInputDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScoreShippingRateInputDraft scoreShippingRateInputDraft = ScoreShippingRateInputDraft.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ScoreShippingRateInputDraftImpl.class)
public interface ScoreShippingRateInputDraft
        extends ShippingRateInputDraft, io.vrap.rmf.base.client.Draft<ScoreShippingRateInputDraft> {

    /**
     * discriminator value for ScoreShippingRateInputDraft
     */
    String SCORE = "Score";

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @return score
     */
    @NotNull
    @JsonProperty("score")
    public Long getScore();

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @param score value to be set
     */

    public void setScore(final Long score);

    /**
     * factory method
     * @return instance of ScoreShippingRateInputDraft
     */
    public static ScoreShippingRateInputDraft of() {
        return new ScoreShippingRateInputDraftImpl();
    }

    /**
     * factory method to copy an instance of ScoreShippingRateInputDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ScoreShippingRateInputDraft of(final ScoreShippingRateInputDraft template) {
        ScoreShippingRateInputDraftImpl instance = new ScoreShippingRateInputDraftImpl();
        instance.setScore(template.getScore());
        return instance;
    }

    /**
     * builder factory method for ScoreShippingRateInputDraft
     * @return builder
     */
    public static ScoreShippingRateInputDraftBuilder builder() {
        return ScoreShippingRateInputDraftBuilder.of();
    }

    /**
     * create builder for ScoreShippingRateInputDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ScoreShippingRateInputDraftBuilder builder(final ScoreShippingRateInputDraft template) {
        return ScoreShippingRateInputDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withScoreShippingRateInputDraft(Function<ScoreShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInputDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInputDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ScoreShippingRateInputDraft>";
            }
        };
    }
}
