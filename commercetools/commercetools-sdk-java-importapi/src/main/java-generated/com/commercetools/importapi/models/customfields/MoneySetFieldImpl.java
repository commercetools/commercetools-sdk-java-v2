
package com.commercetools.importapi.models.customfields;

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
*  <p>A field with a money set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MoneySetFieldImpl implements MoneySetField, ModelBase {

    private String type;

    private java.util.List<com.commercetools.importapi.models.common.Money> value;

    @JsonCreator
    MoneySetFieldImpl(
            @JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.Money> value) {
        this.value = value;
        this.type = MONEY_SET;
    }

    public MoneySetFieldImpl() {
        this.type = MONEY_SET;
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType() {
        return this.type;
    }

    public java.util.List<com.commercetools.importapi.models.common.Money> getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.importapi.models.common.Money... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<com.commercetools.importapi.models.common.Money> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MoneySetFieldImpl that = (MoneySetFieldImpl) o;

        return new EqualsBuilder().append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).toHashCode();
    }

}
