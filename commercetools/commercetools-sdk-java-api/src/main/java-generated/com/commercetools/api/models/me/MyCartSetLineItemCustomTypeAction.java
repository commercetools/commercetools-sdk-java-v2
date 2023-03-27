
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

    /**
     * discriminator value for MyCartSetLineItemCustomTypeAction
     */
    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of MyCartSetLineItemCustomTypeAction
     */
    public static MyCartSetLineItemCustomTypeAction of() {
        return new MyCartSetLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to copy an instance of MyCartSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetLineItemCustomTypeAction of(final MyCartSetLineItemCustomTypeAction template) {
        MyCartSetLineItemCustomTypeActionImpl instance = new MyCartSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * builder factory method for MyCartSetLineItemCustomTypeAction
     * @return builder
     */
    public static MyCartSetLineItemCustomTypeActionBuilder builder() {
        return MyCartSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for MyCartSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemCustomTypeActionBuilder builder(final MyCartSetLineItemCustomTypeAction template) {
        return MyCartSetLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetLineItemCustomTypeAction(Function<MyCartSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemCustomTypeAction>";
            }
        };
    }
}
