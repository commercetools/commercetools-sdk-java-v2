
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
 *  <p>Applies all staged changes to the StandalonePrice by overwriting all current values with the values in the StagedStandalonePrice. After successfully applied, the StagedStandalonePrice will be removed from the StandalonePrice. An <code>applyStagedChanges</code> update action on a StandalonePrice that does not contain any staged changes will return a <code>400 Bad Request</code> error. Applying staged changes successfully will produce the StandalonePriceStagedChangesApplied Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceApplyStagedChangesActionImpl implements StandalonePriceApplyStagedChangesAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public StandalonePriceApplyStagedChangesActionImpl() {
        this.action = APPLY_STAGED_CHANGES;
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

        StandalonePriceApplyStagedChangesActionImpl that = (StandalonePriceApplyStagedChangesActionImpl) o;

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
    public StandalonePriceApplyStagedChangesAction copyDeep() {
        return StandalonePriceApplyStagedChangesAction.deepCopy(this);
    }
}
