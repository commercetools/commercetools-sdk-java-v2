
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewReferenceBuilder implements Builder<ReviewReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.review.Review obj;

    public ReviewReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ReviewReferenceBuilder obj(
            Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build();
        return this;
    }

    public ReviewReferenceBuilder obj(@Nullable final com.commercetools.api.models.review.Review obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.review.Review getObj() {
        return this.obj;
    }

    public ReviewReference build() {
        Objects.requireNonNull(id, ReviewReference.class + ": id is missing");
        return new ReviewReferenceImpl(id, obj);
    }

    /**
     * builds ReviewReference without checking for non null required values
     */
    public ReviewReference buildUnchecked() {
        return new ReviewReferenceImpl(id, obj);
    }

    public static ReviewReferenceBuilder of() {
        return new ReviewReferenceBuilder();
    }

    public static ReviewReferenceBuilder of(final ReviewReference template) {
        ReviewReferenceBuilder builder = new ReviewReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
