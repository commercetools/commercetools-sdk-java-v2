
package com.commercetools.api.models.order_edit;

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
 * OrderEditSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomTypeAction orderEditSetCustomTypeAction = OrderEditSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditSetCustomTypeActionImpl.class)
public interface OrderEditSetCustomTypeAction extends OrderEditUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     <*  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     <*  <p>Sets the Custom Fields fields for the OrderEdit.</p>>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderEditSetCustomTypeAction of() {
        return new OrderEditSetCustomTypeActionImpl();
    }

    public static OrderEditSetCustomTypeAction of(final OrderEditSetCustomTypeAction template) {
        OrderEditSetCustomTypeActionImpl instance = new OrderEditSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderEditSetCustomTypeActionBuilder builder() {
        return OrderEditSetCustomTypeActionBuilder.of();
    }

    public static OrderEditSetCustomTypeActionBuilder builder(final OrderEditSetCustomTypeAction template) {
        return OrderEditSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderEditSetCustomTypeAction(Function<OrderEditSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetCustomTypeAction>";
            }
        };
    }
}
