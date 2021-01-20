
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartReferenceImpl;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartReferenceImpl.class)
public interface CartReference extends Reference {

    @Valid
    @JsonProperty("obj")
    public Cart getObj();

    public void setObj(final Cart obj);

    public static CartReference of() {
        return new CartReferenceImpl();
    }

    public static CartReference of(final CartReference template) {
        CartReferenceImpl instance = new CartReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CartReferenceBuilder builder() {
        return CartReferenceBuilder.of();
    }

    public static CartReferenceBuilder builder(final CartReference template) {
        return CartReferenceBuilder.of(template);
    }

    default <T> T withCartReference(Function<CartReference, T> helper) {
        return helper.apply(this);
    }
}
