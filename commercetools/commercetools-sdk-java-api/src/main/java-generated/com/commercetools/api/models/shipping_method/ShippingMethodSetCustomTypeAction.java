
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetCustomTypeActionImpl.class)
public interface ShippingMethodSetCustomTypeAction extends ShippingMethodUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the ShippingMethod with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the ShippingMethod.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ShippingMethodSetCustomTypeAction of() {
        return new ShippingMethodSetCustomTypeActionImpl();
    }

    public static ShippingMethodSetCustomTypeAction of(final ShippingMethodSetCustomTypeAction template) {
        ShippingMethodSetCustomTypeActionImpl instance = new ShippingMethodSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ShippingMethodSetCustomTypeActionBuilder builder() {
        return ShippingMethodSetCustomTypeActionBuilder.of();
    }

    public static ShippingMethodSetCustomTypeActionBuilder builder(final ShippingMethodSetCustomTypeAction template) {
        return ShippingMethodSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetCustomTypeAction(Function<ShippingMethodSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCustomTypeAction>";
            }
        };
    }
}
