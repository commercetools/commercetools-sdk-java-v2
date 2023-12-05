
package com.commercetools.importapi.models.orders;

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
 * ScoreShippingRateInput
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScoreShippingRateInputImpl implements ScoreShippingRateInput, ModelBase {

    private com.commercetools.importapi.models.orders.ShippingRateInputType type;

    private Double score;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ScoreShippingRateInputImpl(@JsonProperty("score") final Double score) {
        this.score = score;
        this.type = ShippingRateInputType.findEnum("Score");
    }

    /**
     * create empty instance
     */
    public ScoreShippingRateInputImpl() {
        this.type = ShippingRateInputType.findEnum("Score");
    }

    /**
     *
     */

    public com.commercetools.importapi.models.orders.ShippingRateInputType getType() {
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

        ScoreShippingRateInputImpl that = (ScoreShippingRateInputImpl) o;

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

}
