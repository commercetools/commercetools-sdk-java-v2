
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Create DiscountCode request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeCreatedMessagePayloadImpl implements DiscountCodeCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.discount_code.DiscountCode discountCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeCreatedMessagePayloadImpl(
            @JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCode discountCode) {
        this.discountCode = discountCode;
        this.type = DISCOUNT_CODE_CREATED;
    }

    /**
     * create empty instance
     */
    public DiscountCodeCreatedMessagePayloadImpl() {
        this.type = DISCOUNT_CODE_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Discount Code that was created.</p>
     */

    public com.commercetools.api.models.discount_code.DiscountCode getDiscountCode() {
        return this.discountCode;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCode discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeCreatedMessagePayloadImpl that = (DiscountCodeCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(discountCode, that.discountCode)
                .append(type, that.type)
                .append(discountCode, that.discountCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(discountCode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("discountCode", discountCode)
                .build();
    }

    @Override
    public DiscountCodeCreatedMessagePayload copyDeep() {
        return DiscountCodeCreatedMessagePayload.deepCopy(this);
    }
}
