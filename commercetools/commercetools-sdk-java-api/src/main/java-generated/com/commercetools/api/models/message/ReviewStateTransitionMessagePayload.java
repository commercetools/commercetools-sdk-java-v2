package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadImpl;

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
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewStateTransitionMessagePayload reviewStateTransitionMessagePayload = ReviewStateTransitionMessagePayload.builder()
 *             .newState(newStateBuilder -> newStateBuilder)
 *             .oldIncludedInStatistics(true)
 *             .newIncludedInStatistics(true)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ReviewStateTransitionMessagePayloadImpl.class)
public interface ReviewStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for ReviewStateTransitionMessagePayload
     */
    String REVIEW_STATE_TRANSITION = "ReviewStateTransition";

    /**
     *  <p>State of the Review before the Transition State update action.</p>
     * @return oldState
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();
    /**
     *  <p>State of the Review after the Transition State update action.</p>
     * @return newState
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public StateReference getNewState();
    /**
     *  <p>Whether the old Review was taken into account in the rating statistics of the target before the state transition.</p>
     * @return oldIncludedInStatistics
     */
    @NotNull
    @JsonProperty("oldIncludedInStatistics")
    public Boolean getOldIncludedInStatistics();
    /**
     *  <p>Whether the new Review was taken into account in the rating statistics of the target after the state transition.</p>
     * @return newIncludedInStatistics
     */
    @NotNull
    @JsonProperty("newIncludedInStatistics")
    public Boolean getNewIncludedInStatistics();
    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();
    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>State of the Review before the Transition State update action.</p>
     * @param oldState value to be set
     */
    
    public void setOldState(final StateReference oldState);
    
    
    /**
     *  <p>State of the Review after the Transition State update action.</p>
     * @param newState value to be set
     */
    
    public void setNewState(final StateReference newState);
    
    
    /**
     *  <p>Whether the old Review was taken into account in the rating statistics of the target before the state transition.</p>
     * @param oldIncludedInStatistics value to be set
     */
    
    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);
    
    
    /**
     *  <p>Whether the new Review was taken into account in the rating statistics of the target after the state transition.</p>
     * @param newIncludedInStatistics value to be set
     */
    
    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);
    
    
    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     * @param target value to be set
     */
    
    public void setTarget(final Reference target);
    
    
    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     */
    
    public void setForce(final Boolean force);
    

    /**
     * factory method
     * @return instance of ReviewStateTransitionMessagePayload
     */
    public static ReviewStateTransitionMessagePayload of(){
        return new ReviewStateTransitionMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy ReviewStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewStateTransitionMessagePayload of(final ReviewStateTransitionMessagePayload template) {
        ReviewStateTransitionMessagePayloadImpl instance = new ReviewStateTransitionMessagePayloadImpl();
        instance.setOldState(template.getOldState());
        instance.setNewState(template.getNewState());
        instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
        instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
        instance.setTarget(template.getTarget());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReviewStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewStateTransitionMessagePayload deepCopy(@Nullable final ReviewStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        ReviewStateTransitionMessagePayloadImpl instance = new ReviewStateTransitionMessagePayloadImpl();
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setNewState(com.commercetools.api.models.state.StateReference.deepCopy(template.getNewState()));
        instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
        instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
        instance.setTarget(com.commercetools.api.models.common.Reference.deepCopy(template.getTarget()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for ReviewStateTransitionMessagePayload
     * @return builder
     */
    public static ReviewStateTransitionMessagePayloadBuilder builder() {
        return ReviewStateTransitionMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for ReviewStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewStateTransitionMessagePayloadBuilder builder(final ReviewStateTransitionMessagePayload template) {
        return ReviewStateTransitionMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewStateTransitionMessagePayload(Function<ReviewStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewStateTransitionMessagePayload>";
            }
        };
    }
}
