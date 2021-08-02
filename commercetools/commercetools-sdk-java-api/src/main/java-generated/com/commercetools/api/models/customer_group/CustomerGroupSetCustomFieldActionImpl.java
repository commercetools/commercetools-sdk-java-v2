
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupSetCustomFieldActionImpl implements CustomerGroupSetCustomFieldAction {

    private String action;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    CustomerGroupSetCustomFieldActionImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.name = name;
        this.value = value;
        this.action = SET_CUSTOM_FIELD;
    }

    public CustomerGroupSetCustomFieldActionImpl() {
        this.action = SET_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>Value must be of type <a href="/../api/projects/custom-fields#value">Value</a>.
    *  If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#400-bad-request-1">InvalidOperation</a> error.
    *  If <code>value</code> is provided, set the <code>value</code> of the field defined by the <code>name</code>.</p>
    */
    public java.lang.Object getValue() {
        return this.value;
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

        CustomerGroupSetCustomFieldActionImpl that = (CustomerGroupSetCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).append(value).toHashCode();
    }

}
