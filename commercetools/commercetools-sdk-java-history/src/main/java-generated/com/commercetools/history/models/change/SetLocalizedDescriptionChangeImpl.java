
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

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Description on Cart Discounts.</li>
 *   <li>Set Description on Categories.</li>
 *   <li>Set Description on Discount Codes.</li>
 *   <li>Set Description on Products.</li>
 *   <li>Set Description on Product Discounts.</li>
 *   <li>Set Description on Shopping Lists.</li>
 *   <li>Set Description on States.</li>
 *   <li>Set Description on Tax Categories.</li>
 *   <li>Set Description on Types.</li>
 *   <li>Set Description on Zones.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLocalizedDescriptionChangeImpl implements SetLocalizedDescriptionChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLocalizedDescriptionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.LocalizedString previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_LOCALIZED_DESCRIPTION_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetLocalizedDescriptionChangeImpl() {
        this.type = SET_LOCALIZED_DESCRIPTION_CHANGE;
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

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLocalizedDescriptionChangeImpl that = (SetLocalizedDescriptionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
