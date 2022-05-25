
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ScoreShippingRateInputDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScoreShippingRateInputDraftImpl implements ScoreShippingRateInputDraft, ModelBase {

    private String type;

    private Double score;

    @JsonCreator
    ScoreShippingRateInputDraftImpl(@JsonProperty("score") final Double score) {
        this.score = score;
        this.type = SCORE;
    }

    public ScoreShippingRateInputDraftImpl() {
        this.type = SCORE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public Double getScore() {
        return this.score;
    }

    public void setScore(final Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ScoreShippingRateInputDraftImpl that = (ScoreShippingRateInputDraftImpl) o;

        return new EqualsBuilder().append(type, that.type).append(score, that.score).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(score).toHashCode();
    }

}
