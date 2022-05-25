
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewStateTransitionMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewStateTransitionMessagePayload reviewStateTransitionMessagePayload = ReviewStateTransitionMessagePayload.builder()
 *             .oldState(oldStateBuilder -> oldStateBuilder)
 *             .newState(newStateBuilder -> newStateBuilder)
 *             .oldIncludedInStatistics(true)
 *             .newIncludedInStatistics(true)
 *             .target(targetBuilder -> targetBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewStateTransitionMessagePayloadImpl.class)
public interface ReviewStateTransitionMessagePayload extends MessagePayload {

    String REVIEW_STATE_TRANSITION = "ReviewStateTransition";

    /**
     *  <p>Reference to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p>Reference to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public StateReference getNewState();

    /**
     *
     */
    @NotNull
    @JsonProperty("oldIncludedInStatistics")
    public Boolean getOldIncludedInStatistics();

    /**
     *
     */
    @NotNull
    @JsonProperty("newIncludedInStatistics")
    public Boolean getNewIncludedInStatistics();

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    /**
     *
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setOldState(final StateReference oldState);

    public void setNewState(final StateReference newState);

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);

    public void setTarget(final Reference target);

    public void setForce(final Boolean force);

    public static ReviewStateTransitionMessagePayload of() {
        return new ReviewStateTransitionMessagePayloadImpl();
    }

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

    public static ReviewStateTransitionMessagePayloadBuilder builder() {
        return ReviewStateTransitionMessagePayloadBuilder.of();
    }

    public static ReviewStateTransitionMessagePayloadBuilder builder(
            final ReviewStateTransitionMessagePayload template) {
        return ReviewStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withReviewStateTransitionMessagePayload(Function<ReviewStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewStateTransitionMessagePayload>";
            }
        };
    }
}
