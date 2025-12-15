
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeValueAction" rel="nofollow">Change Value</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeValueChangeImpl implements StandalonePriceChangeValueChange, ModelBase {

    private String type;

    private String change;

    private Boolean staged;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceChangeValueChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Money previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Money nextValue) {
        this.change = change;
        this.staged = staged;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = STANDALONE_PRICE_CHANGE_VALUE_CHANGE;
    }

    /**
     * create empty instance
     */
    public StandalonePriceChangeValueChangeImpl() {
        this.type = STANDALONE_PRICE_CHANGE_VALUE_CHANGE;
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

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Indicates if the change was applied to the staged or current price.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceChangeValueChangeImpl that = (StandalonePriceChangeValueChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(staged, that.staged)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(staged, that.staged)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(staged)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("staged", staged)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public StandalonePriceChangeValueChange copyDeep() {
        return StandalonePriceChangeValueChange.deepCopy(this);
    }
}
