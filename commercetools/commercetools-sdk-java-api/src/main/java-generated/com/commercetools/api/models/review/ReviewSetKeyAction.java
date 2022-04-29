
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewSetKeyActionImpl.class)
public interface ReviewSetKeyAction extends ReviewUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ReviewSetKeyAction of() {
        return new ReviewSetKeyActionImpl();
    }

    public static ReviewSetKeyAction of(final ReviewSetKeyAction template) {
        ReviewSetKeyActionImpl instance = new ReviewSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReviewSetKeyActionBuilder builder() {
        return ReviewSetKeyActionBuilder.of();
    }

    public static ReviewSetKeyActionBuilder builder(final ReviewSetKeyAction template) {
        return ReviewSetKeyActionBuilder.of(template);
    }

    default <T> T withReviewSetKeyAction(Function<ReviewSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetKeyAction>";
            }
        };
    }
}
