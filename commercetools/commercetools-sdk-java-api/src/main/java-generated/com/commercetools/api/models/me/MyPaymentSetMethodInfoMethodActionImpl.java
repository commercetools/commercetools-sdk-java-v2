
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
public final class MyPaymentSetMethodInfoMethodActionImpl implements MyPaymentSetMethodInfoMethodAction {

    private String action;

    private String method;

    @JsonCreator
    MyPaymentSetMethodInfoMethodActionImpl(@JsonProperty("method") final String method) {
        this.method = method;
        this.action = SET_METHOD_INFO_METHOD;
    }

    public MyPaymentSetMethodInfoMethodActionImpl() {
        this.action = SET_METHOD_INFO_METHOD;
    }

    public String getAction() {
        return this.action;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyPaymentSetMethodInfoMethodActionImpl that = (MyPaymentSetMethodInfoMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(method, that.method).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(method).toHashCode();
    }

}
