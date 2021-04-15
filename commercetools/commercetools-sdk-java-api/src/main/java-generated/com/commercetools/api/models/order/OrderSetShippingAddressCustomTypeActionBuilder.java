package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetShippingAddressCustomTypeActionBuilder {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    public OrderSetShippingAddressCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    public OrderSetShippingAddressCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public OrderSetShippingAddressCustomTypeAction build() {
        return new OrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    public static OrderSetShippingAddressCustomTypeActionBuilder of() {
        return new OrderSetShippingAddressCustomTypeActionBuilder();
    }

    public static OrderSetShippingAddressCustomTypeActionBuilder of(final OrderSetShippingAddressCustomTypeAction template) {
        OrderSetShippingAddressCustomTypeActionBuilder builder = new OrderSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
