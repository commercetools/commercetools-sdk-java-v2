
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * StagedOrderSetShippingAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressCustomTypeAction stagedOrderSetShippingAddressCustomTypeAction = StagedOrderSetShippingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setShippingAddressCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressCustomTypeActionImpl.class)
public interface StagedOrderSetShippingAddressCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingAddressCustomTypeAction
     */
    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE = "setShippingAddressCustomType";

    /**
     *  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingAddressCustomTypeAction
     */
    public static StagedOrderSetShippingAddressCustomTypeAction of() {
        return new StagedOrderSetShippingAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingAddressCustomTypeAction of(
            final StagedOrderSetShippingAddressCustomTypeAction template) {
        StagedOrderSetShippingAddressCustomTypeActionImpl instance = new StagedOrderSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public StagedOrderSetShippingAddressCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingAddressCustomTypeAction deepCopy(
            @Nullable final StagedOrderSetShippingAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingAddressCustomTypeActionImpl instance = new StagedOrderSetShippingAddressCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingAddressCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetShippingAddressCustomTypeActionBuilder builder() {
        return StagedOrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressCustomTypeActionBuilder builder(
            final StagedOrderSetShippingAddressCustomTypeAction template) {
        return StagedOrderSetShippingAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingAddressCustomTypeAction(
            Function<StagedOrderSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressCustomTypeAction>";
            }
        };
    }
}
