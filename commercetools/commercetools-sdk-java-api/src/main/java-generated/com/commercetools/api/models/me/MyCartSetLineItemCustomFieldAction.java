
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemCustomFieldActionImpl.class)
public interface MyCartSetLineItemCustomFieldAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static MyCartSetLineItemCustomFieldAction of() {
        return new MyCartSetLineItemCustomFieldActionImpl();
    }

    public static MyCartSetLineItemCustomFieldAction of(final MyCartSetLineItemCustomFieldAction template) {
        MyCartSetLineItemCustomFieldActionImpl instance = new MyCartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyCartSetLineItemCustomFieldActionBuilder builder() {
        return MyCartSetLineItemCustomFieldActionBuilder.of();
    }

    public static MyCartSetLineItemCustomFieldActionBuilder builder(final MyCartSetLineItemCustomFieldAction template) {
        return MyCartSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyCartSetLineItemCustomFieldAction(Function<MyCartSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
