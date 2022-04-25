
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

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

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

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetCustomFieldAction>";
            }
        };
    }
}
