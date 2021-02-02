
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ReviewResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ReviewResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ReviewResourceIdentifier build() {
        return new ReviewResourceIdentifierImpl(id, key);
    }

    public static ReviewResourceIdentifierBuilder of() {
        return new ReviewResourceIdentifierBuilder();
    }

    public static ReviewResourceIdentifierBuilder of(final ReviewResourceIdentifier template) {
        ReviewResourceIdentifierBuilder builder = new ReviewResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
