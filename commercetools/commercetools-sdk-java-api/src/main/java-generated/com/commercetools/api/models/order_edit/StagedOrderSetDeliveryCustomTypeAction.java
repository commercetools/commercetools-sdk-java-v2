
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryCustomTypeAction stagedOrderSetDeliveryCustomTypeAction = StagedOrderSetDeliveryCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryCustomTypeActionImpl.class)
public interface StagedOrderSetDeliveryCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryCustomTypeAction
     */
    String SET_DELIVERY_CUSTOM_TYPE = "setDeliveryCustomType";

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedOrderSetDeliveryCustomTypeAction
     */
    public static StagedOrderSetDeliveryCustomTypeAction of() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetDeliveryCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryCustomTypeAction of(final StagedOrderSetDeliveryCustomTypeAction template) {
        StagedOrderSetDeliveryCustomTypeActionImpl instance = new StagedOrderSetDeliveryCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryCustomTypeAction deepCopy(
            @Nullable final StagedOrderSetDeliveryCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryCustomTypeActionImpl instance = new StagedOrderSetDeliveryCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetDeliveryCustomTypeActionBuilder builder() {
        return StagedOrderSetDeliveryCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDeliveryCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryCustomTypeActionBuilder builder(
            final StagedOrderSetDeliveryCustomTypeAction template) {
        return StagedOrderSetDeliveryCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryCustomTypeAction(
            Function<StagedOrderSetDeliveryCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryCustomTypeAction>";
            }
        };
    }
}
