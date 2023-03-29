
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ReviewRatingStatistics;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeReviewRatingStatisticsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeReviewRatingStatisticsChange changeReviewRatingStatisticsChange = ChangeReviewRatingStatisticsChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
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
     *  <p>Update action for <code>changeReviewRatingStatistics</code></p>
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
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ReviewRatingStatistics getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ReviewRatingStatistics getPreviousValue();

    /**
     *  <p>Update action for <code>changeReviewRatingStatistics</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ReviewRatingStatistics nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ReviewRatingStatistics previousValue);

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
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.ReviewRatingStatistics::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.ReviewRatingStatistics::deepCopy)
                .orElse(null));
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
