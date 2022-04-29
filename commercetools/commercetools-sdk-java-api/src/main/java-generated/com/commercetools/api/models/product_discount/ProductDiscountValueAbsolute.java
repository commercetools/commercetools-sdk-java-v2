
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueAbsoluteImpl.class)
public interface ProductDiscountValueAbsolute extends ProductDiscountValue {

    String ABSOLUTE = "absolute";

    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    @JsonIgnore
    public void setMoney(final TypedMoney... money);

    public void setMoney(final List<TypedMoney> money);

    public static ProductDiscountValueAbsolute of() {
        return new ProductDiscountValueAbsoluteImpl();
    }

    public static ProductDiscountValueAbsolute of(final ProductDiscountValueAbsolute template) {
        ProductDiscountValueAbsoluteImpl instance = new ProductDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static ProductDiscountValueAbsoluteBuilder builder() {
        return ProductDiscountValueAbsoluteBuilder.of();
    }

    public static ProductDiscountValueAbsoluteBuilder builder(final ProductDiscountValueAbsolute template) {
        return ProductDiscountValueAbsoluteBuilder.of(template);
    }

    default <T> T withProductDiscountValueAbsolute(Function<ProductDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsolute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsolute>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueAbsolute>";
            }
        };
    }
}
