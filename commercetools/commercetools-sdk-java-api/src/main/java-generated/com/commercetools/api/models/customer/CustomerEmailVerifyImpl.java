
package com.commercetools.api.models.customer;

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
public class CustomerEmailVerifyImpl implements CustomerEmailVerify, ModelBase {

    private Long version;

    private String tokenValue;

    @JsonCreator
    CustomerEmailVerifyImpl(@JsonProperty("version") final Long version,
            @JsonProperty("tokenValue") final String tokenValue) {
        this.version = version;
        this.tokenValue = tokenValue;
    }

    public CustomerEmailVerifyImpl() {
    }

    public Long getVersion() {
        return this.version;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setTokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerEmailVerifyImpl that = (CustomerEmailVerifyImpl) o;

        return new EqualsBuilder().append(version, that.version).append(tokenValue, that.tokenValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(tokenValue).toHashCode();
    }

}
