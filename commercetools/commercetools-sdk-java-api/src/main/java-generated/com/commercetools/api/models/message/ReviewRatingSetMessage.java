
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewRatingSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingSetMessage reviewRatingSetMessage = ReviewRatingSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .includedInStatistics(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewRatingSetMessageImpl.class)
public interface ReviewRatingSetMessage extends Message {

    String REVIEW_RATING_SET = "ReviewRatingSet";

    /**
     <>
     */

    @JsonProperty("oldRating")
    public Double getOldRating();

    /**
     <>
     */

    @JsonProperty("newRating")
    public Double getNewRating();

    /**
     <>
     */
    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    public void setOldRating(final Double oldRating);

    public void setNewRating(final Double newRating);

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    public void setTarget(final Reference target);

    public static ReviewRatingSetMessage of() {
        return new ReviewRatingSetMessageImpl();
    }

    public static ReviewRatingSetMessage of(final ReviewRatingSetMessage template) {
        ReviewRatingSetMessageImpl instance = new ReviewRatingSetMessageImpl();
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
        instance.setOldRating(template.getOldRating());
        instance.setNewRating(template.getNewRating());
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static ReviewRatingSetMessageBuilder builder() {
        return ReviewRatingSetMessageBuilder.of();
    }

    public static ReviewRatingSetMessageBuilder builder(final ReviewRatingSetMessage template) {
        return ReviewRatingSetMessageBuilder.of(template);
    }

    default <T> T withReviewRatingSetMessage(Function<ReviewRatingSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewRatingSetMessage>";
            }
        };
    }
}
