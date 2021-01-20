
package com.commercetools.api.models.review;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewReferenceImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewReferenceImpl.class)
public interface ReviewReference extends Reference {

    @Valid
    @JsonProperty("obj")
    public Review getObj();

    public void setObj(final Review obj);

    public static ReviewReference of() {
        return new ReviewReferenceImpl();
    }

    public static ReviewReference of(final ReviewReference template) {
        ReviewReferenceImpl instance = new ReviewReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ReviewReferenceBuilder builder() {
        return ReviewReferenceBuilder.of();
    }

    public static ReviewReferenceBuilder builder(final ReviewReference template) {
        return ReviewReferenceBuilder.of(template);
    }

    default <T> T withReviewReference(Function<ReviewReference, T> helper) {
        return helper.apply(this);
    }
}
