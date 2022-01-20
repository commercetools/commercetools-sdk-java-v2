
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountChangePredicateActionImpl implements ProductDiscountChangePredicateAction, ModelBase {

    private String action;

    private String predicate;

    @JsonCreator
    ProductDiscountChangePredicateActionImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.action = CHANGE_PREDICATE;
    }

    public ProductDiscountChangePredicateActionImpl() {
        this.action = CHANGE_PREDICATE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>A valid ProductDiscount Predicate.</p>
    */
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

        ProductDiscountChangePredicateActionImpl that = (ProductDiscountChangePredicateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(predicate, that.predicate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(predicate).toHashCode();
    }

}
