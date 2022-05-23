
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
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ReviewStateTransitionMessage reviewStateTransitionMessage = ReviewStateTransitionMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .oldState(oldStateBuilder -> oldStateBuilder)
           .newState(newStateBuilder -> newStateBuilder)
           .oldIncludedInStatistics(true)
           .newIncludedInStatistics(true)
           .target(targetBuilder -> targetBuilder)
           .force(true)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewStateTransitionMessageImpl.class)
public interface ReviewStateTransitionMessage extends Message {

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

    @NotNull
    @JsonProperty("oldIncludedInStatistics")
    public Boolean getOldIncludedInStatistics();

    @NotNull
    @JsonProperty("newIncludedInStatistics")
    public Boolean getNewIncludedInStatistics();

    /**
     *  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setOldState(final StateReference oldState);

    public void setNewState(final StateReference newState);

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);

    public void setTarget(final Reference target);

    public void setForce(final Boolean force);

    public static ReviewStateTransitionMessage of() {
        return new ReviewStateTransitionMessageImpl();
    }

    public static ReviewStateTransitionMessage of(final ReviewStateTransitionMessage template) {
        ReviewStateTransitionMessageImpl instance = new ReviewStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setOldState(template.getOldState());
        instance.setNewState(template.getNewState());
        instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
        instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
        instance.setTarget(template.getTarget());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ReviewStateTransitionMessageBuilder builder() {
        return ReviewStateTransitionMessageBuilder.of();
    }

    public static ReviewStateTransitionMessageBuilder builder(final ReviewStateTransitionMessage template) {
        return ReviewStateTransitionMessageBuilder.of(template);
    }

    default <T> T withReviewStateTransitionMessage(Function<ReviewStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewStateTransitionMessage>";
            }
        };
    }
}
