
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetTextActionBuilder implements Builder<ReviewSetTextAction> {

    @Nullable
    private String text;

    public ReviewSetTextActionBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }

    @Nullable
    public String getText() {
        return this.text;
    }

    public ReviewSetTextAction build() {
        return new ReviewSetTextActionImpl(text);
    }

    /**
     * builds ReviewSetTextAction without checking for non null required values
     */
    public ReviewSetTextAction buildUnchecked() {
        return new ReviewSetTextActionImpl(text);
    }

    public static ReviewSetTextActionBuilder of() {
        return new ReviewSetTextActionBuilder();
    }

    public static ReviewSetTextActionBuilder of(final ReviewSetTextAction template) {
        ReviewSetTextActionBuilder builder = new ReviewSetTextActionBuilder();
        builder.text = template.getText();
        return builder;
    }

}
