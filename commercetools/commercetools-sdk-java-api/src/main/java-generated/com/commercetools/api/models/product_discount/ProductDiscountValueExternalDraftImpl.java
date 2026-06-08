
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Discounts the Product Price by allowing the client to explicitly <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetDiscountedPriceAction" rel="nofollow">set a discounted value</a>. Use this when setting discounts using an external service.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueExternalDraftImpl implements ProductDiscountValueExternalDraft, ModelBase {

    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public ProductDiscountValueExternalDraftImpl() {
        this.type = EXTERNAL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountValueExternalDraftImpl that = (ProductDiscountValueExternalDraftImpl) o;

        return new EqualsBuilder().append(type, that.type).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type).build();
    }

    @Override
    public ProductDiscountValueExternalDraft copyDeep() {
        return ProductDiscountValueExternalDraft.deepCopy(this);
    }
}
