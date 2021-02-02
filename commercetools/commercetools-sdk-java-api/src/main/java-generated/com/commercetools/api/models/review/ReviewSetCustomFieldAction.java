
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewSetCustomFieldActionImpl.class)
public interface ReviewSetCustomFieldAction extends ReviewUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static ReviewSetCustomFieldAction of() {
        return new ReviewSetCustomFieldActionImpl();
    }

    public static ReviewSetCustomFieldAction of(final ReviewSetCustomFieldAction template) {
        ReviewSetCustomFieldActionImpl instance = new ReviewSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ReviewSetCustomFieldActionBuilder builder() {
        return ReviewSetCustomFieldActionBuilder.of();
    }

    public static ReviewSetCustomFieldActionBuilder builder(final ReviewSetCustomFieldAction template) {
        return ReviewSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withReviewSetCustomFieldAction(Function<ReviewSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
