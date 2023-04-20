
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeReviewRatingStatisticsChangeBuilder
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
public class ChangeReviewRatingStatisticsChangeBuilder implements Builder<ChangeReviewRatingStatisticsChange> {

    private String change;

    private com.commercetools.history.models.common.ReviewRatingStatistics nextValue;

    private com.commercetools.history.models.common.ReviewRatingStatistics previousValue;

    /**
     *  <p>Update action for <code>changeReviewRatingStatistics</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReviewRatingStatisticsBuilder, com.commercetools.history.models.common.ReviewRatingStatisticsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReviewRatingStatisticsBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReviewRatingStatisticsBuilder, com.commercetools.history.models.common.ReviewRatingStatistics> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReviewRatingStatisticsBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ReviewRatingStatistics nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReviewRatingStatisticsBuilder, com.commercetools.history.models.common.ReviewRatingStatisticsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReviewRatingStatisticsBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReviewRatingStatisticsBuilder, com.commercetools.history.models.common.ReviewRatingStatistics> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReviewRatingStatisticsBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeReviewRatingStatisticsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReviewRatingStatistics previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeReviewRatingStatistics</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.ReviewRatingStatistics getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.ReviewRatingStatistics getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeReviewRatingStatisticsChange with checking for non-null required values
     * @return ChangeReviewRatingStatisticsChange
     */
    public ChangeReviewRatingStatisticsChange build() {
        Objects.requireNonNull(change, ChangeReviewRatingStatisticsChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeReviewRatingStatisticsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeReviewRatingStatisticsChange.class + ": previousValue is missing");
        return new ChangeReviewRatingStatisticsChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeReviewRatingStatisticsChange without checking for non-null required values
     * @return ChangeReviewRatingStatisticsChange
     */
    public ChangeReviewRatingStatisticsChange buildUnchecked() {
        return new ChangeReviewRatingStatisticsChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeReviewRatingStatisticsChangeBuilder
     * @return builder
     */
    public static ChangeReviewRatingStatisticsChangeBuilder of() {
        return new ChangeReviewRatingStatisticsChangeBuilder();
    }

    /**
     * create builder for ChangeReviewRatingStatisticsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeReviewRatingStatisticsChangeBuilder of(final ChangeReviewRatingStatisticsChange template) {
        ChangeReviewRatingStatisticsChangeBuilder builder = new ChangeReviewRatingStatisticsChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
