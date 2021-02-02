
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetLineItemCustomFieldActionImpl implements MyCartSetLineItemCustomFieldAction {

    private String action;

    private String lineItemId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    MyCartSetLineItemCustomFieldActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.lineItemId = lineItemId;
        this.name = name;
        this.value = value;
        this.action = SET_LINE_ITEM_CUSTOM_FIELD;
    }

    public MyCartSetLineItemCustomFieldActionImpl() {
        this.action = SET_LINE_ITEM_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartSetLineItemCustomFieldActionImpl that = (MyCartSetLineItemCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(lineItemId, that.lineItemId).append(name,
            that.name).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(name).append(value).toHashCode();
    }

}
