
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when a Product is not assigned to the Product Selection. The error is returned as a failed response either to the Set Variant Selection or to the Set Variant Exclusion update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLProductAssignmentMissingErrorImpl implements GraphQLProductAssignmentMissingError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.product.ProductReference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLProductAssignmentMissingErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product) {
        this.values = values;
        this.product = product;
        this.code = PRODUCT_ASSIGNMENT_MISSING;
    }

    /**
     * create empty instance
     */
    public GraphQLProductAssignmentMissingErrorImpl() {
        this.code = PRODUCT_ASSIGNMENT_MISSING;
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

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLProductAssignmentMissingErrorImpl that = (GraphQLProductAssignmentMissingErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(product, that.product)
                .append(code, that.code)
                .append(values, that.values)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(product).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("product", product)
                .build();
    }

    @Override
    public GraphQLProductAssignmentMissingError copyDeep() {
        return GraphQLProductAssignmentMissingError.deepCopy(this);
    }
}
