
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCustomerSetMiddleNameActionImpl implements MyCustomerSetMiddleNameAction, ModelBase {

    private String action;

    private String middleName;

    @JsonCreator
    MyCustomerSetMiddleNameActionImpl(@JsonProperty("middleName") final String middleName) {
        this.middleName = middleName;
        this.action = SET_MIDDLE_NAME;
    }

    public MyCustomerSetMiddleNameActionImpl() {
        this.action = SET_MIDDLE_NAME;
    }

    public String getAction() {
        return this.action;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerSetMiddleNameActionImpl that = (MyCustomerSetMiddleNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(middleName, that.middleName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(middleName).toHashCode();
    }

}
