
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
 *  <p>This Change is no longer triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveAssociateAction" rel="nofollow">Remove Associate</a> update action. It has been deprecated and replaced by the <a href="https://docs.commercetools.com/apis/ctp:history:type:SetAssociatesChange" rel="nofollow">SetAssociatesChange</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class RemoveAssociateChangeImpl implements RemoveAssociateChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Associate previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveAssociateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Associate previousValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.type = REMOVE_ASSOCIATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public RemoveAssociateChangeImpl() {
        this.type = REMOVE_ASSOCIATE_CHANGE;
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
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.Associate getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Associate previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveAssociateChangeImpl that = (RemoveAssociateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(previousValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .build();
    }

    @Override
    public RemoveAssociateChange copyDeep() {
        return RemoveAssociateChange.deepCopy(this);
    }
}
