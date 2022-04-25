
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderExcerptImpl.class)
public interface OrderExcerpt {

    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setVersion(final Integer version);

    public static OrderExcerpt of() {
        return new OrderExcerptImpl();
    }

    public static OrderExcerpt of(final OrderExcerpt template) {
        OrderExcerptImpl instance = new OrderExcerptImpl();
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public static OrderExcerptBuilder builder() {
        return OrderExcerptBuilder.of();
    }

    public static OrderExcerptBuilder builder(final OrderExcerpt template) {
        return OrderExcerptBuilder.of(template);
    }

    default <T> T withOrderExcerpt(Function<OrderExcerpt, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderExcerpt> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderExcerpt>() {
            @Override
            public String toString() {
                return "TypeReference<OrderExcerpt>";
            }
        };
    }
}
