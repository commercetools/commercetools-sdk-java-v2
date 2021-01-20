
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetTargetActionImpl implements ReviewSetTargetAction {

    private String action;

    private com.fasterxml.jackson.databind.JsonNode target;

    @JsonCreator
    ReviewSetTargetActionImpl(@JsonProperty("target") final com.fasterxml.jackson.databind.JsonNode target) {
        this.target = target;
        this.action = ReviewSetTargetAction.SET_TARGET;
    }

    public ReviewSetTargetActionImpl() {
        this.action = ReviewSetTargetAction.SET_TARGET;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Identifies the target of the review.
    *  Can be a Product or a Channel.
    *  If <code>target</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getTarget() {
        return this.target;
    }

    public void setTarget(final com.fasterxml.jackson.databind.JsonNode target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewSetTargetActionImpl that = (ReviewSetTargetActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(target, that.target).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(target).toHashCode();
    }

}
