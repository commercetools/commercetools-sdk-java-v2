package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetTextActionImpl;

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
 * ReviewSetTextAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTextAction reviewSetTextAction = ReviewSetTextAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetTextActionImpl.class)
public interface ReviewSetTextAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetTextAction
     */
    String SET_TEXT = "setText";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return text
     */
    
    @JsonProperty("text")
    public String getText();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param text value to be set
     */
    
    public void setText(final String text);
    

    /**
     * factory method
     * @return instance of ReviewSetTextAction
     */
    public static ReviewSetTextAction of(){
        return new ReviewSetTextActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ReviewSetTextAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetTextAction of(final ReviewSetTextAction template) {
        ReviewSetTextActionImpl instance = new ReviewSetTextActionImpl();
        instance.setText(template.getText());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReviewSetTextAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewSetTextAction deepCopy(@Nullable final ReviewSetTextAction template) {
        if (template == null) {
            return null;
        }
        ReviewSetTextActionImpl instance = new ReviewSetTextActionImpl();
        instance.setText(template.getText());
        return instance;
    }

    /**
     * builder factory method for ReviewSetTextAction
     * @return builder
     */
    public static ReviewSetTextActionBuilder builder() {
        return ReviewSetTextActionBuilder.of();
    }
    
    /**
     * create builder for ReviewSetTextAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetTextActionBuilder builder(final ReviewSetTextAction template) {
        return ReviewSetTextActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetTextAction(Function<ReviewSetTextAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetTextAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetTextAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetTextAction>";
            }
        };
    }
}
