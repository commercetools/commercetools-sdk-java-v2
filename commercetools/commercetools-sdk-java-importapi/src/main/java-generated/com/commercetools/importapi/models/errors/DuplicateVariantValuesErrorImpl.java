
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

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
 *  <p>The given combination of values of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> conflicts with an existing one. Every <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">Product Variant</a> must have a distinct combination of SKU, prices, and custom attribute values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError, ModelBase {

    private String code;

    private String message;

    private com.commercetools.importapi.models.errors.VariantValues variantValues;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateVariantValuesErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("variantValues") final com.commercetools.importapi.models.errors.VariantValues variantValues) {
        this.message = message;
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
     *  <p>An error identifier.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The offending variant values.</p>
     */

    public com.commercetools.importapi.models.errors.VariantValues getVariantValues() {
        return this.variantValues;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setVariantValues(final com.commercetools.importapi.models.errors.VariantValues variantValues) {
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
                .append(variantValues, that.variantValues)
                .append(code, that.code)
                .append(message, that.message)
                .append(variantValues, that.variantValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(variantValues).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("variantValues", variantValues)
                .build();
    }

    @Override
    public DuplicateVariantValuesError copyDeep() {
        return DuplicateVariantValuesError.deepCopy(this);
    }
}
