
package com.commercetools.api.models.review;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> actions;

    public ReviewUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ReviewUpdateBuilder actions(final com.commercetools.api.models.review.ReviewUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ReviewUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> getActions() {
        return this.actions;
    }

    public ReviewUpdate build() {
        return new ReviewUpdateImpl(version, actions);
    }

    public static ReviewUpdateBuilder of() {
        return new ReviewUpdateBuilder();
    }

    public static ReviewUpdateBuilder of(final ReviewUpdate template) {
        ReviewUpdateBuilder builder = new ReviewUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
