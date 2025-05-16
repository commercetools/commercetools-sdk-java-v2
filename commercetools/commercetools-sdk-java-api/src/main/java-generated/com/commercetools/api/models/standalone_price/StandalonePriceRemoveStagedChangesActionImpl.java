
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Removes all staged changes from the StandalonePrice. Removing staged changes successfully produces the StandalonePriceStagedChangesRemoved Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceRemoveStagedChangesActionImpl
        implements StandalonePriceRemoveStagedChangesAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public StandalonePriceRemoveStagedChangesActionImpl() {
        this.action = REMOVE_STAGED_CHANGES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceRemoveStagedChangesActionImpl that = (StandalonePriceRemoveStagedChangesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action).build();
    }

    @Override
    public StandalonePriceRemoveStagedChangesAction copyDeep() {
        return StandalonePriceRemoveStagedChangesAction.deepCopy(this);
    }
}
