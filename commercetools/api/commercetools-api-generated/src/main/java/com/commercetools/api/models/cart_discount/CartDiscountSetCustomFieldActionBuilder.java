package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountSetCustomFieldActionBuilder {

    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public CartDiscountSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public CartDiscountSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public CartDiscountSetCustomFieldAction build() {
        return new CartDiscountSetCustomFieldActionImpl(name, value);
    }

    public static CartDiscountSetCustomFieldActionBuilder of() {
        return new CartDiscountSetCustomFieldActionBuilder();
    }

    public static CartDiscountSetCustomFieldActionBuilder of(final CartDiscountSetCustomFieldAction template) {
        CartDiscountSetCustomFieldActionBuilder builder = new CartDiscountSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
