
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewUpdateImpl.class)
public interface ReviewUpdate
        extends com.commercetools.api.models.ResourceUpdate<ReviewUpdate, ReviewUpdateAction, ReviewUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ReviewUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ReviewUpdateAction... actions);

    public void setActions(final List<ReviewUpdateAction> actions);

    public static ReviewUpdate of() {
        return new ReviewUpdateImpl();
    }

    public static ReviewUpdate of(final ReviewUpdate template) {
        ReviewUpdateImpl instance = new ReviewUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ReviewUpdateBuilder builder() {
        return ReviewUpdateBuilder.of();
    }

    public static ReviewUpdateBuilder builder(final ReviewUpdate template) {
        return ReviewUpdateBuilder.of(template);
    }

    default <T> T withReviewUpdate(Function<ReviewUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewUpdate>";
            }
        };
    }
}
