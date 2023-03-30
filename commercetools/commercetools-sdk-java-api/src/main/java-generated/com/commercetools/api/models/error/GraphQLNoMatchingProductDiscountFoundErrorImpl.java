
package com.commercetools.api.models.error;

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
 *  <p>Returned when a Product Discount could not be found that could be applied to the Price of a Product Variant.</p>
 *  <p>The error is returned as a failed response to the Get Matching ProductDiscount request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLNoMatchingProductDiscountFoundErrorImpl
        implements GraphQLNoMatchingProductDiscountFoundError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLNoMatchingProductDiscountFoundErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
        this.code = NO_MATCHING_PRODUCT_DISCOUNT_FOUND;
    }

    /**
     * create empty instance
     */
    public GraphQLNoMatchingProductDiscountFoundErrorImpl() {
        this.code = NO_MATCHING_PRODUCT_DISCOUNT_FOUND;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLNoMatchingProductDiscountFoundErrorImpl that = (GraphQLNoMatchingProductDiscountFoundErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).toHashCode();
    }

}
