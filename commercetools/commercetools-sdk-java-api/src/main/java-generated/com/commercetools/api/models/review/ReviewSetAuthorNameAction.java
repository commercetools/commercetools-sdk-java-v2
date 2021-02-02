
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewSetAuthorNameActionImpl.class)
public interface ReviewSetAuthorNameAction extends ReviewUpdateAction {

    String SET_AUTHOR_NAME = "setAuthorName";

    /**
    *  <p>If <code>authorName</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("authorName")
    public String getAuthorName();

    public void setAuthorName(final String authorName);

    public static ReviewSetAuthorNameAction of() {
        return new ReviewSetAuthorNameActionImpl();
    }

    public static ReviewSetAuthorNameAction of(final ReviewSetAuthorNameAction template) {
        ReviewSetAuthorNameActionImpl instance = new ReviewSetAuthorNameActionImpl();
        instance.setAuthorName(template.getAuthorName());
        return instance;
    }

    public static ReviewSetAuthorNameActionBuilder builder() {
        return ReviewSetAuthorNameActionBuilder.of();
    }

    public static ReviewSetAuthorNameActionBuilder builder(final ReviewSetAuthorNameAction template) {
        return ReviewSetAuthorNameActionBuilder.of(template);
    }

    default <T> T withReviewSetAuthorNameAction(Function<ReviewSetAuthorNameAction, T> helper) {
        return helper.apply(this);
    }
}
