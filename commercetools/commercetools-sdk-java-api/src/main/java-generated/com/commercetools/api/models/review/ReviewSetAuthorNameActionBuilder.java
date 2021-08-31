
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetAuthorNameActionBuilder implements Builder<ReviewSetAuthorNameAction> {

    @Nullable
    private String authorName;

    public ReviewSetAuthorNameActionBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }

    @Nullable
    public String getAuthorName() {
        return this.authorName;
    }

    public ReviewSetAuthorNameAction build() {
        return new ReviewSetAuthorNameActionImpl(authorName);
    }

    /**
     * builds ReviewSetAuthorNameAction without checking for non null required values
     */
    public ReviewSetAuthorNameAction buildUnchecked() {
        return new ReviewSetAuthorNameActionImpl(authorName);
    }

    public static ReviewSetAuthorNameActionBuilder of() {
        return new ReviewSetAuthorNameActionBuilder();
    }

    public static ReviewSetAuthorNameActionBuilder of(final ReviewSetAuthorNameAction template) {
        ReviewSetAuthorNameActionBuilder builder = new ReviewSetAuthorNameActionBuilder();
        builder.authorName = template.getAuthorName();
        return builder;
    }

}
