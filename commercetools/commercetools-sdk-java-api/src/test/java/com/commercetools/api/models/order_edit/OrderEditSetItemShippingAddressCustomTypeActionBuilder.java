package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetItemShippingAddressCustomTypeActionBuilder {

    
    
    private String addressKey;
    
    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    public OrderEditSetItemShippingAddressCustomTypeActionBuilder addressKey( final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    
    public OrderEditSetItemShippingAddressCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    public OrderEditSetItemShippingAddressCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    
    
    public String getAddressKey(){
        return this.addressKey;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public OrderEditSetItemShippingAddressCustomTypeAction build() {
        return new OrderEditSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    public static OrderEditSetItemShippingAddressCustomTypeActionBuilder of() {
        return new OrderEditSetItemShippingAddressCustomTypeActionBuilder();
    }

    public static OrderEditSetItemShippingAddressCustomTypeActionBuilder of(final OrderEditSetItemShippingAddressCustomTypeAction template) {
        OrderEditSetItemShippingAddressCustomTypeActionBuilder builder = new OrderEditSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
