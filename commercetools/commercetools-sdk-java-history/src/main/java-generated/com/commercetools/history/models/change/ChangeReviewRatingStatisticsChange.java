
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ReviewRatingStatistics;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ChangeReviewRatingStatisticsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeReviewRatingStatisticsChange changeReviewRatingStatisticsChange = ChangeReviewRatingStatisticsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeReviewRatingStatisticsChangeImpl.class)
public interface ChangeReviewRatingStatisticsChange extends Change {

    /**
     * discriminator value for ChangeReviewRatingStatisticsChange
     */
    String CHANGE_REVIEW_RATING_STATISTICS_CHANGE = "ChangeReviewRatingStatisticsChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ReviewRatingStatistics getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ReviewRatingStatistics getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ReviewRatingStatistics previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ReviewRatingStatistics nextValue);

    /**
     * factory method
     * @return instance of ChangeReviewRatingStatisticsChange
     */
    public static ChangeReviewRatingStatisticsChange of() {
        return new ChangeReviewRatingStatisticsChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeReviewRatingStatisticsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeReviewRatingStatisticsChange of(final ChangeReviewRatingStatisticsChange template) {
        ChangeReviewRatingStatisticsChangeImpl instance = new ChangeReviewRatingStatisticsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeReviewRatingStatisticsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeReviewRatingStatisticsChange deepCopy(
            @Nullable final ChangeReviewRatingStatisticsChange template) {
        if (template == null) {
            return null;
        }
        ChangeReviewRatingStatisticsChangeImpl instance = new ChangeReviewRatingStatisticsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ReviewRatingStatistics.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ReviewRatingStatistics.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeReviewRatingStatisticsChange
     * @return builder
     */
    public static ChangeReviewRatingStatisticsChangeBuilder builder() {
        return ChangeReviewRatingStatisticsChangeBuilder.of();
    }

    /**
     * create builder for ChangeReviewRatingStatisticsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeReviewRatingStatisticsChangeBuilder builder(final ChangeReviewRatingStatisticsChange template) {
        return ChangeReviewRatingStatisticsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeReviewRatingStatisticsChange(Function<ChangeReviewRatingStatisticsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeReviewRatingStatisticsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeReviewRatingStatisticsChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeReviewRatingStatisticsChange>";
            }
        };
    }
}
