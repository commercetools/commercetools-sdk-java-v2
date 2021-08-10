
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetLocaleActionBuilder implements Builder<ReviewSetLocaleAction> {

    @Nullable
    private String locale;

    public ReviewSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public ReviewSetLocaleAction build() {
        return new ReviewSetLocaleActionImpl(locale);
    }

    /**
     * builds ReviewSetLocaleAction without checking for non null required values
     */
    public ReviewSetLocaleAction buildUnchecked() {
        return new ReviewSetLocaleActionImpl(locale);
    }

    public static ReviewSetLocaleActionBuilder of() {
        return new ReviewSetLocaleActionBuilder();
    }

    public static ReviewSetLocaleActionBuilder of(final ReviewSetLocaleAction template) {
        ReviewSetLocaleActionBuilder builder = new ReviewSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
