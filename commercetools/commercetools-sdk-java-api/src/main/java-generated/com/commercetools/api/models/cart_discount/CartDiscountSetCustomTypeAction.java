
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetCustomTypeAction cartDiscountSetCustomTypeAction = CartDiscountSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the CartDiscount with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CartDiscount.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the CartDiscount.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartDiscountSetCustomTypeAction of() {
        return new CartDiscountSetCustomTypeActionImpl();
    }

    public static CartDiscountSetCustomTypeAction of(final CartDiscountSetCustomTypeAction template) {
        CartDiscountSetCustomTypeActionImpl instance = new CartDiscountSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartDiscountSetCustomTypeActionBuilder builder() {
        return CartDiscountSetCustomTypeActionBuilder.of();
    }

    public static CartDiscountSetCustomTypeActionBuilder builder(final CartDiscountSetCustomTypeAction template) {
        return CartDiscountSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetCustomTypeAction(Function<CartDiscountSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetCustomTypeAction>";
            }
        };
    }
}
