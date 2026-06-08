
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("ReviewStateTransition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewStateTransitionMessagePayloadImpl.class)
public interface ReviewStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for ReviewStateTransitionMessagePayload
     */
    String REVIEW_STATE_TRANSITION = "ReviewStateTransition";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return oldState
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return newState
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public StateReference getNewState();

    /**
     *  <p>Whether the old <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the rating statistics of the target before the state transition.</p>
     * @return oldIncludedInStatistics
     */
    @NotNull
    @JsonProperty("oldIncludedInStatistics")
    public Boolean getOldIncludedInStatistics();

    /**
     *  <p>Whether the new <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the rating statistics of the target after the state transition.</p>
     * @return newIncludedInStatistics
     */
    @NotNull
    @JsonProperty("newIncludedInStatistics")
    public Boolean getNewIncludedInStatistics();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> belongs to.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final StateReference oldState);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param newState value to be set
     */

    public void setNewState(final StateReference newState);

    /**
     *  <p>Whether the old <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the rating statistics of the target before the state transition.</p>
     * @param oldIncludedInStatistics value to be set
     */

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);

    /**
     *  <p>Whether the new <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> was taken into account in the rating statistics of the target after the state transition.</p>
     * @param newIncludedInStatistics value to be set
     */

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a> belongs to.</p>
     * @param target value to be set
     */

    public void setTarget(final Reference target);

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of ReviewStateTransitionMessagePayload
     */
    public static ReviewStateTransitionMessagePayload of() {
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

    public ReviewStateTransitionMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ReviewStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewStateTransitionMessagePayload deepCopy(
            @Nullable final ReviewStateTransitionMessagePayload template) {
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
    public static ReviewStateTransitionMessagePayloadBuilder builder(
            final ReviewStateTransitionMessagePayload template) {
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
