package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomLineItemCustomTypeActionBuilder {

    
    private String customLineItemId;
    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CartSetCustomLineItemCustomTypeActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    public CartSetCustomLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    public CartSetCustomLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public CartSetCustomLineItemCustomTypeAction build() {
        return new CartSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    public static CartSetCustomLineItemCustomTypeActionBuilder of() {
        return new CartSetCustomLineItemCustomTypeActionBuilder();
    }

    public static CartSetCustomLineItemCustomTypeActionBuilder of(final CartSetCustomLineItemCustomTypeAction template) {
        CartSetCustomLineItemCustomTypeActionBuilder builder = new CartSetCustomLineItemCustomTypeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
