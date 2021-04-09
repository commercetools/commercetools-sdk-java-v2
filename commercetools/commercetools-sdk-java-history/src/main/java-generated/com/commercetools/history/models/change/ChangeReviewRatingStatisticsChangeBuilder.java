
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeReviewRatingStatisticsChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.ReviewRatingStatistics nextValue;

    private com.commercetools.history.models.common.ReviewRatingStatistics previousValue;

    public ChangeReviewRatingStatisticsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeReviewRatingStatisticsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ReviewRatingStatistics nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeReviewRatingStatisticsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReviewRatingStatistics previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.ReviewRatingStatistics getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ReviewRatingStatistics getPreviousValue() {
        return this.previousValue;
    }

    public ChangeReviewRatingStatisticsChange build() {
        return new ChangeReviewRatingStatisticsChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeReviewRatingStatisticsChangeBuilder of() {
        return new ChangeReviewRatingStatisticsChangeBuilder();
    }

    public static ChangeReviewRatingStatisticsChangeBuilder of(final ChangeReviewRatingStatisticsChange template) {
        ChangeReviewRatingStatisticsChangeBuilder builder = new ChangeReviewRatingStatisticsChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
