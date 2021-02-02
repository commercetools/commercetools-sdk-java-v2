
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.custom_object.CustomObjectReference;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.zone.ZoneReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceImpl implements Reference {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    @JsonCreator
    ReferenceImpl(@JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id) {
        this.typeId = typeId;
        this.id = id;
    }

    public ReferenceImpl() {
    }

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferenceImpl that = (ReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).toHashCode();
    }

}
