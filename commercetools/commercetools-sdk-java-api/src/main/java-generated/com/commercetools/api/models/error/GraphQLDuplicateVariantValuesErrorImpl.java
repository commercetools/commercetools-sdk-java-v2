
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
 *  <p>Returned when a Product Variant value conflicts with an existing one during an Update Product request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateVariantValuesErrorImpl implements GraphQLDuplicateVariantValuesError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.error.VariantValues variantValues;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicateVariantValuesErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("variantValues") final com.commercetools.api.models.error.VariantValues variantValues) {
        this.values = values;
        this.variantValues = variantValues;
        this.code = DUPLICATE_VARIANT_VALUES;
    }

    /**
     * create empty instance
     */
    public GraphQLDuplicateVariantValuesErrorImpl() {
        this.code = DUPLICATE_VARIANT_VALUES;
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
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     */

    public com.commercetools.api.models.error.VariantValues getVariantValues() {
        return this.variantValues;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setVariantValues(final com.commercetools.api.models.error.VariantValues variantValues) {
        this.variantValues = variantValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLDuplicateVariantValuesErrorImpl that = (GraphQLDuplicateVariantValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(variantValues, that.variantValues)
                .append(code, that.code)
                .append(values, that.values)
                .append(variantValues, that.variantValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(variantValues).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("variantValues", variantValues)
                .build();
    }

}
