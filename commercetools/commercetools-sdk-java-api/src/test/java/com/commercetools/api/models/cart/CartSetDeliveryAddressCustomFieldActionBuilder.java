package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetDeliveryAddressCustomFieldActionBuilder {

    
    
    private String deliveryId;
    
    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    public CartSetDeliveryAddressCustomFieldActionBuilder deliveryId( final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }
    
    
    public CartSetDeliveryAddressCustomFieldActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    public CartSetDeliveryAddressCustomFieldActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public CartSetDeliveryAddressCustomFieldAction build() {
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, type, fields);
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder of() {
        return new CartSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder of(final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionBuilder builder = new CartSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
