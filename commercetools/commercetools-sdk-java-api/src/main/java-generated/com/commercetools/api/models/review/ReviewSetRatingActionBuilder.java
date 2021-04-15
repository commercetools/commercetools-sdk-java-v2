
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetRatingActionBuilder {

    @Nullable
    private Integer rating;

    public ReviewSetRatingActionBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }

    @Nullable
    public Integer getRating() {
        return this.rating;
    }

    public ReviewSetRatingAction build() {
        return new ReviewSetRatingActionImpl(rating);
    }

    public static ReviewSetRatingActionBuilder of() {
        return new ReviewSetRatingActionBuilder();
    }

    public static ReviewSetRatingActionBuilder of(final ReviewSetRatingAction template) {
        ReviewSetRatingActionBuilder builder = new ReviewSetRatingActionBuilder();
        builder.rating = template.getRating();
        return builder;
    }

}
