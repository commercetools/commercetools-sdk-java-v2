
package com.commercetools.api.models.discount_code;

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
@JsonDeserialize(as = DiscountCodeSetCustomTypeActionImpl.class)
public interface DiscountCodeSetCustomTypeAction extends DiscountCodeUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
    *  Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static DiscountCodeSetCustomTypeAction of() {
        return new DiscountCodeSetCustomTypeActionImpl();
    }

    public static DiscountCodeSetCustomTypeAction of(final DiscountCodeSetCustomTypeAction template) {
        DiscountCodeSetCustomTypeActionImpl instance = new DiscountCodeSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static DiscountCodeSetCustomTypeActionBuilder builder() {
        return DiscountCodeSetCustomTypeActionBuilder.of();
    }

    public static DiscountCodeSetCustomTypeActionBuilder builder(final DiscountCodeSetCustomTypeAction template) {
        return DiscountCodeSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetCustomTypeAction(Function<DiscountCodeSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
