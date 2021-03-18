
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewLabelBuilder {

    private String key;

    private String title;

    public ReviewLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ReviewLabelBuilder title(final String title) {
        this.title = title;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    public ReviewLabel build() {
        return new ReviewLabelImpl(key, title);
    }

    public static ReviewLabelBuilder of() {
        return new ReviewLabelBuilder();
    }

    public static ReviewLabelBuilder of(final ReviewLabel template) {
        ReviewLabelBuilder builder = new ReviewLabelBuilder();
        builder.key = template.getKey();
        builder.title = template.getTitle();
        return builder;
    }

}
