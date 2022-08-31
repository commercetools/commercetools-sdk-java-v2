
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Change Value update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValueChangedMessagePayloadImpl
        implements StandalonePriceValueChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Money value;

    private Boolean staged;

    @JsonCreator
    StandalonePriceValueChangedMessagePayloadImpl(
            @JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("staged") final Boolean staged) {
        this.value = value;
        this.staged = staged;
        this.type = STANDALONE_PRICE_VALUE_CHANGED;
    }

    public StandalonePriceValueChangedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_VALUE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setValue(final com.commercetools.api.models.common.Money value) {
        this.value = value;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceValueChangedMessagePayloadImpl that = (StandalonePriceValueChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(value, that.value)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).append(staged).toHashCode();
    }

}
