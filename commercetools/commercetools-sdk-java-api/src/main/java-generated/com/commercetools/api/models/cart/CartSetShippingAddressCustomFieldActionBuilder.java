package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetShippingAddressCustomFieldActionBuilder {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public CartSetShippingAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public CartSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    public CartSetShippingAddressCustomFieldAction build() {
        return new CartSetShippingAddressCustomFieldActionImpl(name, value);
    }

    public static CartSetShippingAddressCustomFieldActionBuilder of() {
        return new CartSetShippingAddressCustomFieldActionBuilder();
    }

    public static CartSetShippingAddressCustomFieldActionBuilder of(final CartSetShippingAddressCustomFieldAction template) {
        CartSetShippingAddressCustomFieldActionBuilder builder = new CartSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
