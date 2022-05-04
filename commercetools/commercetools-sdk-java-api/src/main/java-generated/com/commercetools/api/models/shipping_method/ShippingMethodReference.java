
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:ShippingMethod">ShippingMethod</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodReferenceImpl.class)
public interface ShippingMethodReference extends Reference, com.commercetools.api.models.Identifiable<ShippingMethod> {

    String SHIPPING_METHOD = "shipping-method";

    /**
    *  <p>Contains the representation of the expanded Review. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for ShippingMethods.</p>
    */
    @Valid
    @JsonProperty("obj")
    public ShippingMethod getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:ShippingMethod">ShippingMethod</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final ShippingMethod obj);

    public void setId(final String id);

    public static ShippingMethodReference of() {
        return new ShippingMethodReferenceImpl();
    }

    public static ShippingMethodReference of(final ShippingMethodReference template) {
        ShippingMethodReferenceImpl instance = new ShippingMethodReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ShippingMethodReferenceBuilder builder() {
        return ShippingMethodReferenceBuilder.of();
    }

    public static ShippingMethodReferenceBuilder builder(final ShippingMethodReference template) {
        return ShippingMethodReferenceBuilder.of(template);
    }

    default <T> T withShippingMethodReference(Function<ShippingMethodReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodReference>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodReference>";
            }
        };
    }
}
