
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ReviewRatingStatistics;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeReviewRatingStatisticsChangeImpl.class)
public interface ChangeReviewRatingStatisticsChange extends Change {

    String CHANGE_REVIEW_RATING_STATISTICS_CHANGE = "ChangeReviewRatingStatisticsChange";

    /**
    *  <p>Update action for <code>changeReviewRatingStatistics</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ReviewRatingStatistics getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ReviewRatingStatistics getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ReviewRatingStatistics nextValue);

    public void setPreviousValue(final ReviewRatingStatistics previousValue);

    public static ChangeReviewRatingStatisticsChange of() {
        return new ChangeReviewRatingStatisticsChangeImpl();
    }

    public static ChangeReviewRatingStatisticsChange of(final ChangeReviewRatingStatisticsChange template) {
        ChangeReviewRatingStatisticsChangeImpl instance = new ChangeReviewRatingStatisticsChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeReviewRatingStatisticsChangeBuilder builder() {
        return ChangeReviewRatingStatisticsChangeBuilder.of();
    }

    public static ChangeReviewRatingStatisticsChangeBuilder builder(final ChangeReviewRatingStatisticsChange template) {
        return ChangeReviewRatingStatisticsChangeBuilder.of(template);
    }

    default <T> T withChangeReviewRatingStatisticsChange(Function<ChangeReviewRatingStatisticsChange, T> helper) {
        return helper.apply(this);
    }
}
