
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ScoreShippingRateInputDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScoreShippingRateInputDraftImpl implements ScoreShippingRateInputDraft, ModelBase {

    private String type;

    private Long score;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ScoreShippingRateInputDraftImpl(@JsonProperty("score") final Long score) {
        this.score = score;
        this.type = SCORE;
    }

    /**
     * create empty instance
     */
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
     *  <p>Abstract value for categorizing a Cart.</p>
     */

    public Long getScore() {
        return this.score;
    }

    public void setScore(final Long score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ScoreShippingRateInputDraftImpl that = (ScoreShippingRateInputDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(score, that.score)
                .append(type, that.type)
                .append(score, that.score)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(score).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("score", score)
                .build();
    }

    @Override
    public ScoreShippingRateInputDraft copyDeep() {
        return ScoreShippingRateInputDraft.deepCopy(this);
    }
}
