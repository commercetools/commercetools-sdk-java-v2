package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetItemShippingAddressCustomFieldActionBuilder {

    
    
    private String addressKey;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public CartSetItemShippingAddressCustomFieldActionBuilder addressKey( final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    
    public CartSetItemShippingAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public CartSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    
    
    public String getAddressKey(){
        return this.addressKey;
    }
    
    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    public CartSetItemShippingAddressCustomFieldAction build() {
        return new CartSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder of() {
        return new CartSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder of(final CartSetItemShippingAddressCustomFieldAction template) {
        CartSetItemShippingAddressCustomFieldActionBuilder builder = new CartSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
