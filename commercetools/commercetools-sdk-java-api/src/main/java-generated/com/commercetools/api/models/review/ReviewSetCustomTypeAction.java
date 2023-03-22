
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetCustomTypeAction reviewSetCustomTypeAction = ReviewSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetCustomTypeActionImpl.class)
public interface ReviewSetCustomTypeAction extends ReviewUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Review with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Review.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Review.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ReviewSetCustomTypeAction of() {
        return new ReviewSetCustomTypeActionImpl();
    }

    public static ReviewSetCustomTypeAction of(final ReviewSetCustomTypeAction template) {
        ReviewSetCustomTypeActionImpl instance = new ReviewSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ReviewSetCustomTypeActionBuilder builder() {
        return ReviewSetCustomTypeActionBuilder.of();
    }

    public static ReviewSetCustomTypeActionBuilder builder(final ReviewSetCustomTypeAction template) {
        return ReviewSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withReviewSetCustomTypeAction(Function<ReviewSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetCustomTypeAction>";
            }
        };
    }
}
