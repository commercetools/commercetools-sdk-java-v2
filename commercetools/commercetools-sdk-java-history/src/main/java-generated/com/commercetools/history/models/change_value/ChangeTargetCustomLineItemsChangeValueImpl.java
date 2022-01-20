
package com.commercetools.history.models.change_value;

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
*  <p>Shape of the value for cart discounts line item and custom line items target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeTargetCustomLineItemsChangeValueImpl implements ChangeTargetCustomLineItemsChangeValue, ModelBase {

    private String type;

    private String predicate;

    @JsonCreator
    ChangeTargetCustomLineItemsChangeValueImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.type = CUSTOM_LINE_ITEMS;
    }

    public ChangeTargetCustomLineItemsChangeValueImpl() {
        this.type = CUSTOM_LINE_ITEMS;
    }

    public String getType() {
        return this.type;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTargetCustomLineItemsChangeValueImpl that = (ChangeTargetCustomLineItemsChangeValueImpl) o;

        return new EqualsBuilder().append(type, that.type).append(predicate, that.predicate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(predicate).toHashCode();
    }

}
