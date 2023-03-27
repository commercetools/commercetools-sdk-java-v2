
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTargetAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTargetAction reviewSetTargetAction = ReviewSetTargetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetTargetActionImpl.class)
public interface ReviewSetTargetAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetTargetAction
     */
    String SET_TARGET = "setTarget";

    /**
     *  <p>Value to set, specified as ProductResourceIdentifier or ChannelResourceIdentifier, respectively. If empty, any existing value will be removed.</p>
     * @return target
     */
    @NotNull
    @JsonProperty("target")
    public Object getTarget();

    /**
     *  <p>Value to set, specified as ProductResourceIdentifier or ChannelResourceIdentifier, respectively. If empty, any existing value will be removed.</p>
     * @param target value to be set
     */

    public void setTarget(final ProductResourceIdentifier target);

    /**
     *  <p>Value to set, specified as ProductResourceIdentifier or ChannelResourceIdentifier, respectively. If empty, any existing value will be removed.</p>
     * @param target value to be set
     */

    public void setTarget(final ChannelResourceIdentifier target);

    /**
     *  <p>Value to set, specified as ProductResourceIdentifier or ChannelResourceIdentifier, respectively. If empty, any existing value will be removed.</p>
     * @param target value to be set
     */

    public void setTarget(final Object target);

    /**
     * factory method
     * @return instance of ReviewSetTargetAction
     */
    public static ReviewSetTargetAction of() {
        return new ReviewSetTargetActionImpl();
    }

    /**
     * factory method to copy an instance of ReviewSetTargetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetTargetAction of(final ReviewSetTargetAction template) {
        ReviewSetTargetActionImpl instance = new ReviewSetTargetActionImpl();
        instance.setTarget(template.getTarget());
        return instance;
    }

    /**
     * builder factory method for ReviewSetTargetAction
     * @return builder
     */
    public static ReviewSetTargetActionBuilder builder() {
        return ReviewSetTargetActionBuilder.of();
    }

    /**
     * create builder for ReviewSetTargetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetTargetActionBuilder builder(final ReviewSetTargetAction template) {
        return ReviewSetTargetActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetTargetAction(Function<ReviewSetTargetAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetTargetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetTargetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetTargetAction>";
            }
        };
    }
}
