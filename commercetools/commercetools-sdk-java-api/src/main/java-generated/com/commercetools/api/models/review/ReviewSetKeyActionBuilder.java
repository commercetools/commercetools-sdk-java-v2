
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetKeyActionBuilder implements Builder<ReviewSetKeyAction> {

    @Nullable
    private String key;

    public ReviewSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ReviewSetKeyAction build() {
        return new ReviewSetKeyActionImpl(key);
    }

    /**
     * builds ReviewSetKeyAction without checking for non null required values
     */
    public ReviewSetKeyAction buildUnchecked() {
        return new ReviewSetKeyActionImpl(key);
    }

    public static ReviewSetKeyActionBuilder of() {
        return new ReviewSetKeyActionBuilder();
    }

    public static ReviewSetKeyActionBuilder of(final ReviewSetKeyAction template) {
        ReviewSetKeyActionBuilder builder = new ReviewSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
