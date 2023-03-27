
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
 *  <p>Returned when a Product Variant value conflicts with an existing one during an Update Product request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.error.VariantValues variantValues;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateVariantValuesErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("variantValues") final com.commercetools.api.models.error.VariantValues variantValues) {
        this.message = message;
        this.values = values;
        this.variantValues = variantValues;
        this.code = DUPLICATE_VARIANT_VALUES;
    }

    /**
     * create empty instance
     */
    public DuplicateVariantValuesErrorImpl() {
        this.code = DUPLICATE_VARIANT_VALUES;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"A duplicate combination of the variant values (sku, key, images, prices, attributes) exists."</code></p>
     */

    public String getMessage() {
        return this.message;
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

    public void setMessage(final String message) {
        this.message = message;
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

        DuplicateVariantValuesErrorImpl that = (DuplicateVariantValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(variantValues, that.variantValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(variantValues)
                .toHashCode();
    }

}
