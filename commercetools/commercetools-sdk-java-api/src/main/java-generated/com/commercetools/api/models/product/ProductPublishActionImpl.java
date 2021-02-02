
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPublishActionImpl implements ProductPublishAction {

    private String action;

    private com.commercetools.api.models.cart.ProductPublishScope scope;

    @JsonCreator
    ProductPublishActionImpl(@JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
        this.action = PUBLISH;
    }

    public ProductPublishActionImpl() {
        this.action = PUBLISH;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.cart.ProductPublishScope getScope() {
        return this.scope;
    }

    public void setScope(final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPublishActionImpl that = (ProductPublishActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(scope, that.scope).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(scope).toHashCode();
    }

}
