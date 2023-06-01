package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewSetAuthorNameAction;
import com.commercetools.api.models.review.ReviewSetCustomFieldAction;
import com.commercetools.api.models.review.ReviewSetCustomTypeAction;
import com.commercetools.api.models.review.ReviewSetCustomerAction;
import com.commercetools.api.models.review.ReviewSetKeyAction;
import com.commercetools.api.models.review.ReviewSetLocaleAction;
import com.commercetools.api.models.review.ReviewSetRatingAction;
import com.commercetools.api.models.review.ReviewSetTargetAction;
import com.commercetools.api.models.review.ReviewSetTextAction;
import com.commercetools.api.models.review.ReviewSetTitleAction;
import com.commercetools.api.models.review.ReviewTransitionStateAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ReviewUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewUpdateAction reviewUpdateAction = ReviewUpdateAction.setAuthorNameBuilder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetAuthorNameActionImpl.class, name = ReviewSetAuthorNameAction.SET_AUTHOR_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomFieldActionImpl.class, name = ReviewSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomTypeActionImpl.class, name = ReviewSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomerActionImpl.class, name = ReviewSetCustomerAction.SET_CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetKeyActionImpl.class, name = ReviewSetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetLocaleActionImpl.class, name = ReviewSetLocaleAction.SET_LOCALE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetRatingActionImpl.class, name = ReviewSetRatingAction.SET_RATING),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTargetActionImpl.class, name = ReviewSetTargetAction.SET_TARGET),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTextActionImpl.class, name = ReviewSetTextAction.SET_TEXT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTitleActionImpl.class, name = ReviewSetTitleAction.SET_TITLE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewTransitionStateActionImpl.class, name = ReviewTransitionStateAction.TRANSITION_STATE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ReviewUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = ReviewUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ReviewUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ReviewUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of ReviewUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewUpdateAction deepCopy(@Nullable final ReviewUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetAuthorNameAction) {
            return com.commercetools.api.models.review.ReviewSetAuthorNameAction.deepCopy((com.commercetools.api.models.review.ReviewSetAuthorNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetCustomFieldAction) {
            return com.commercetools.api.models.review.ReviewSetCustomFieldAction.deepCopy((com.commercetools.api.models.review.ReviewSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetCustomTypeAction) {
            return com.commercetools.api.models.review.ReviewSetCustomTypeAction.deepCopy((com.commercetools.api.models.review.ReviewSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetCustomerAction) {
            return com.commercetools.api.models.review.ReviewSetCustomerAction.deepCopy((com.commercetools.api.models.review.ReviewSetCustomerAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetKeyAction) {
            return com.commercetools.api.models.review.ReviewSetKeyAction.deepCopy((com.commercetools.api.models.review.ReviewSetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetLocaleAction) {
            return com.commercetools.api.models.review.ReviewSetLocaleAction.deepCopy((com.commercetools.api.models.review.ReviewSetLocaleAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetRatingAction) {
            return com.commercetools.api.models.review.ReviewSetRatingAction.deepCopy((com.commercetools.api.models.review.ReviewSetRatingAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetTargetAction) {
            return com.commercetools.api.models.review.ReviewSetTargetAction.deepCopy((com.commercetools.api.models.review.ReviewSetTargetAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetTextAction) {
            return com.commercetools.api.models.review.ReviewSetTextAction.deepCopy((com.commercetools.api.models.review.ReviewSetTextAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewSetTitleAction) {
            return com.commercetools.api.models.review.ReviewSetTitleAction.deepCopy((com.commercetools.api.models.review.ReviewSetTitleAction)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewTransitionStateAction) {
            return com.commercetools.api.models.review.ReviewTransitionStateAction.deepCopy((com.commercetools.api.models.review.ReviewTransitionStateAction)template);
        }
        ReviewUpdateActionImpl instance = new ReviewUpdateActionImpl();
        return instance;
    }


    /**
     * builder for setAuthorName subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetAuthorNameActionBuilder setAuthorNameBuilder() {
       return com.commercetools.api.models.review.ReviewSetAuthorNameActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.review.ReviewSetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.review.ReviewSetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetCustomerActionBuilder setCustomerBuilder() {
       return com.commercetools.api.models.review.ReviewSetCustomerActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.review.ReviewSetKeyActionBuilder.of();
    }
    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.review.ReviewSetLocaleActionBuilder.of();
    }
    /**
     * builder for setRating subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetRatingActionBuilder setRatingBuilder() {
       return com.commercetools.api.models.review.ReviewSetRatingActionBuilder.of();
    }
    /**
     * builder for setTarget subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetTargetActionBuilder setTargetBuilder() {
       return com.commercetools.api.models.review.ReviewSetTargetActionBuilder.of();
    }
    /**
     * builder for setText subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetTextActionBuilder setTextBuilder() {
       return com.commercetools.api.models.review.ReviewSetTextActionBuilder.of();
    }
    /**
     * builder for setTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewSetTitleActionBuilder setTitleBuilder() {
       return com.commercetools.api.models.review.ReviewSetTitleActionBuilder.of();
    }
    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.review.ReviewTransitionStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewUpdateAction(Function<ReviewUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewUpdateAction>";
            }
        };
    }
}
