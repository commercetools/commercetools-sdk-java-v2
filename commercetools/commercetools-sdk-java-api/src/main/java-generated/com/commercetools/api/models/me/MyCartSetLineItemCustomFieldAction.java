
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemCustomFieldAction myCartSetLineItemCustomFieldAction = MyCartSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemCustomFieldActionImpl.class)
public interface MyCartSetLineItemCustomFieldAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

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

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemCustomFieldAction>";
            }
        };
    }
}
