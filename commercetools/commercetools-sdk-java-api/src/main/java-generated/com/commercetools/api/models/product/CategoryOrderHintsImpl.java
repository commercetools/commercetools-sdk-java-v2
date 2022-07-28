
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>JSON object where the key is a Category <code>id</code> and the value is an order hint: a string representing a number between 0 and 1 that must start with <code>0.</code> and cannot end with <code>0</code>. Allows controlling the order of Products and how they appear in Categories. Products with no order hint have an order score below <code>0</code>. Order hints are non-unique. If a subset of Products have the same value for order hint in a specific category, the behavior is undetermined.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryOrderHintsImpl implements CategoryOrderHints, ModelBase {

    @JsonCreator
    CategoryOrderHintsImpl() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryOrderHintsImpl that = (CategoryOrderHintsImpl) o;

        return new EqualsBuilder().isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).toHashCode();
    }

}
