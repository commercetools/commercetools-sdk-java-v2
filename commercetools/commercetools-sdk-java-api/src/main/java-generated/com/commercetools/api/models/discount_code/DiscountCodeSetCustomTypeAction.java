
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
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the DiscountCode with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the DiscountCode.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetCustomTypeAction>";
            }
        };
    }
}
