package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountSetCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode fields;

    public CartDiscountSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    public CartDiscountSetCustomTypeActionBuilder fields(@Nullable final com.fasterxml.jackson.databind.JsonNode fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getFields(){
        return this.fields;
    }

    public CartDiscountSetCustomTypeAction build() {
        return new CartDiscountSetCustomTypeActionImpl(type, fields);
    }

    public static CartDiscountSetCustomTypeActionBuilder of() {
        return new CartDiscountSetCustomTypeActionBuilder();
    }

    public static CartDiscountSetCustomTypeActionBuilder of(final CartDiscountSetCustomTypeAction template) {
        CartDiscountSetCustomTypeActionBuilder builder = new CartDiscountSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
