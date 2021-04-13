
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Shape of the value for cart discounts absolute value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueAbsoluteChangeValueImpl implements ChangeValueAbsoluteChangeValue {

    private String type;

    private java.util.List<com.commercetools.history.models.common.Money> money;

    @JsonCreator
    ChangeValueAbsoluteChangeValueImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.history.models.common.Money> money) {
        this.money = money;
        this.type = ABSOLUTE;
    }

    public ChangeValueAbsoluteChangeValueImpl() {
        this.type = ABSOLUTE;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<com.commercetools.history.models.common.Money> getMoney() {
        return this.money;
    }

    public void setMoney(final com.commercetools.history.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.history.models.common.Money> money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeValueAbsoluteChangeValueImpl that = (ChangeValueAbsoluteChangeValueImpl) o;

        return new EqualsBuilder().append(type, that.type).append(money, that.money).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).toHashCode();
    }

}
