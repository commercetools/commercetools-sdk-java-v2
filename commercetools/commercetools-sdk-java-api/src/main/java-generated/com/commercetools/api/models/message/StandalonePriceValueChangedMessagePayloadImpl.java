
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Change Value update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValueChangedMessagePayloadImpl
        implements StandalonePriceValueChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.TypedMoney value;

    private Boolean staged;

    private com.commercetools.api.models.common.TypedMoney oldValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceValueChangedMessagePayloadImpl(
            @JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("oldValue") final com.commercetools.api.models.common.TypedMoney oldValue) {
        this.value = value;
        this.staged = staged;
        this.oldValue = oldValue;
        this.type = STANDALONE_PRICE_VALUE_CHANGED;
    }

    /**
     * create empty instance
     */
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

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getOldValue() {
        return this.oldValue;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setOldValue(final com.commercetools.api.models.common.TypedMoney oldValue) {
        this.oldValue = oldValue;
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
                .append(oldValue, that.oldValue)
                .append(type, that.type)
                .append(value, that.value)
                .append(staged, that.staged)
                .append(oldValue, that.oldValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).append(staged).append(oldValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("value", value)
                .append("staged", staged)
                .append("oldValue", oldValue)
                .build();
    }

    @Override
    public StandalonePriceValueChangedMessagePayload copyDeep() {
        return StandalonePriceValueChangedMessagePayload.deepCopy(this);
    }
}
