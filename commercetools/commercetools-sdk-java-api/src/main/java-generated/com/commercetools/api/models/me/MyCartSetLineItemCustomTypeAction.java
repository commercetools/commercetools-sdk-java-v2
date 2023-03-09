
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemCustomTypeAction myCartSetLineItemCustomTypeAction = MyCartSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemCustomTypeActionImpl.class)
public interface MyCartSetLineItemCustomTypeAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the LineItem.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the LineItem.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyCartSetLineItemCustomTypeAction of() {
        return new MyCartSetLineItemCustomTypeActionImpl();
    }

    public static MyCartSetLineItemCustomTypeAction of(final MyCartSetLineItemCustomTypeAction template) {
        MyCartSetLineItemCustomTypeActionImpl instance = new MyCartSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyCartSetLineItemCustomTypeActionBuilder builder() {
        return MyCartSetLineItemCustomTypeActionBuilder.of();
    }

    public static MyCartSetLineItemCustomTypeActionBuilder builder(final MyCartSetLineItemCustomTypeAction template) {
        return MyCartSetLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyCartSetLineItemCustomTypeAction(Function<MyCartSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemCustomTypeAction>";
            }
        };
    }
}
