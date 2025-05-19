
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
 *  <p>Change triggered by the Change Product Selection Active update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeProductSelectionActiveChangeImpl implements ChangeProductSelectionActiveChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Reference productSelection;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeProductSelectionActiveChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("productSelection") final com.commercetools.history.models.common.Reference productSelection,
            @JsonProperty("previousValue") final Boolean previousValue,
            @JsonProperty("nextValue") final Boolean nextValue) {
        this.change = change;
        this.productSelection = productSelection;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_PRODUCT_SELECTION_ACTIVE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeProductSelectionActiveChangeImpl() {
        this.type = CHANGE_PRODUCT_SELECTION_ACTIVE_CHANGE;
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
     *  <p>Reference to the Product Selection which was changed.</p>
     */

    public com.commercetools.history.models.common.Reference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setProductSelection(final com.commercetools.history.models.common.Reference productSelection) {
        this.productSelection = productSelection;
    }

    public void setPreviousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeProductSelectionActiveChangeImpl that = (ChangeProductSelectionActiveChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(productSelection, that.productSelection)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(productSelection, that.productSelection)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(productSelection)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("productSelection", productSelection)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public ChangeProductSelectionActiveChange copyDeep() {
        return ChangeProductSelectionActiveChange.deepCopy(this);
    }
}
